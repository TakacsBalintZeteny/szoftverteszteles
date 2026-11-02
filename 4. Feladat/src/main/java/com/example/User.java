
package com.example;

public class User {

    private String userName;
    private String password;
    private boolean isLoggedIn;
    private int id;
    private UserDatabase userDatabase;

    public User(String userName, String password,
                boolean isLoggedIn, int id,
                UserDatabase userDatabase) {
        this.userName = userName;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
        this.id = id;
        this.userDatabase = userDatabase;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public int getId() {
        return id;
    }

    public void updatePwd(String newPwd) {
        userDatabase.setPassword(id, newPwd);
    }
}
