package com.solncev.models;

import java.util.List;

public class User {
    private String name;
    private String login;
    private String password;
    private List<Integer> illnessId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public List<Integer> getIllnessId() {
        return illnessId;
    }

    public void setIllnessId(List<Integer> illnessId) {
        this.illnessId = illnessId;
    }

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public User(String name, String login, String password, List<Integer> illnessId) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.illnessId = illnessId;
    }
}
