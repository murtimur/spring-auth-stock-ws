package com.muratyildirim.app.auth.token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import com.muratyildirim.app.auth.dto.Credentials;
import com.muratyildirim.app.user.User;

import java.util.Optional;
import java.util.UUID;

@Service
@ConditionalOnProperty(name = "murtimur.token-type", havingValue = "opaque")
public class OpaqueTokenService implements TokenService {

  @Autowired
  TokenRepository tokenRepository;

  @Override
  public Token createToken(User user, Credentials creds) {
    String value = UUID.randomUUID().toString();
    Token token = new Token();
    token.setUser(user);
    token.setToken(value);
    return tokenRepository.save(token);
  }

  @Override
  public User verifyToken(String authorizationHeader) {
    var inDB = getToken(authorizationHeader);
    if(!inDB.isPresent()) return null;
    return inDB.get().getUser();
  }

  @Override
  public void logout(String authorizationHeader) {
    var inDB = getToken(authorizationHeader);
    if(!inDB.isPresent()) return;
    tokenRepository.delete(inDB.get());
  }

  private Optional<Token> getToken(String authorizationHeader) {
    if(authorizationHeader == null) return Optional.empty();
    var token = authorizationHeader.split(" ")[1];
    return tokenRepository.findById(token);
  }

}
