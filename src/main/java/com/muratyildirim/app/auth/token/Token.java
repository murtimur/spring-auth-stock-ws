package com.muratyildirim.app.auth.token;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.muratyildirim.app.user.User;

import jakarta.persistence.*;

@Entity
@Table(name = "app-token")
public class Token {

  @Id
  private String token;

  @Transient
  private String prefix = "Bearer";

  @JsonIgnore
  @ManyToOne
  private User user;

  public Token(){}

  public Token(String token, String prefix) {
    this.token = token;
    this.prefix = prefix;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
