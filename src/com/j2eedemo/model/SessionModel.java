package com.j2eedemo.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/5/4.
 */
public class SessionModel  implements Serializable {

    private static final long serialVersionUID = -8800804688186337062L;

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
