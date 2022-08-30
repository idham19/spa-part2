package org.launchcode.spaday.models;

import java.util.Objects;

public class User {
    private int id;
    private static int nextId=1;
    private int password;

    private String name;
    private String email;


    public User(int password, String name, String email) {
        this.password = password;
        this.name = name;
        this.email = email;
        this.id=nextId;
        nextId++;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
