package com.muratyildirim.app.auth.token;

import javax.crypto.SecretKey;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.muratyildirim.app.auth.dto.Credentials;
import com.muratyildirim.app.user.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
@ConditionalOnProperty(name = "murtimur.token-type", havingValue = "jwt")
public class JwtTokenService implements TokenService {

  SecretKey key = Keys.hmacShaKeyFor("secret-murtimur-bbbb-besiktasbjk".getBytes());

  ObjectMapper mapper = new ObjectMapper();

  @Override
  public Token createToken(User user, Credentials creds) {
    TokenSubject tokenSubject = new TokenSubject(user.getId());
    try {
      String subject = mapper.writeValueAsString(tokenSubject);
      String token = Jwts.builder().setSubject(subject).signWith(key).compact();
      return new Token("Bearer", token);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public User verifyToken(String authorizationHeader) {
    if (authorizationHeader == null)
      return null;
    var token = authorizationHeader.split(" ")[1];
    JwtParser parser = Jwts.parserBuilder().setSigningKey(key).build();
    try {
      Jws<Claims> claims = parser.parseClaimsJws(token);
      var subject = claims.getBody().getSubject();
      var tokenSubject = mapper.readValue(subject, TokenSubject.class);
      User user = new User();
      user.setId(tokenSubject.id());
      return user;
    } catch (JwtException | JsonProcessingException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static record TokenSubject(int id) {
  }

  @Override
  public void logout(String authorizationHeader) {

  }

}

