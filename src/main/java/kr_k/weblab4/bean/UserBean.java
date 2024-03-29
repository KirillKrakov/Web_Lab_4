package kr_k.weblab4.bean;

import jakarta.ejb.Stateless;

@Stateless
public class UserBean {
    private String login;
    private String password;
    private String token;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserBean{" +
               "login='" + login + '\'' +
               ", password='" + password + '\'' +
               ", token='" + token + '\'' +
               '}';
    }
}
