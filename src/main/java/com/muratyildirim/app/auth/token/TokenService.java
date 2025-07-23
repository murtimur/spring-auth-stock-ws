package com.muratyildirim.app.auth.token;

import com.muratyildirim.app.auth.dto.Credentials;
import com.muratyildirim.app.user.User;

public interface TokenService {

  public Token createToken(User user, Credentials creds);

  public User verifyToken(String authorizationHeader);

  public void logout(String authorizationHeader);

}
