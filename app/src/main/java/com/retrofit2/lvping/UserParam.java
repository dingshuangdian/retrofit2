package com.retrofit2.lvping;

public class UserParam {
    private String userAccount;
    private String userPass;

    public UserParam(String userAccount, String userPass) {
        this.userAccount = userAccount;
        this.userPass = userPass;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
