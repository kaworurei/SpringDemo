package com.j2eedemo.model;

import java.io.Serializable;

public class AccountModel
  implements Serializable
{
  private static final long serialVersionUID = -4018766759111421222L;

  public AccountModel(){

  }
  private String username;
  private String password;

  public void setUsername(String username)
  {
    this.username = username;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return this.username;
  }
  public String getPassword() {
    return this.password;
  }
}