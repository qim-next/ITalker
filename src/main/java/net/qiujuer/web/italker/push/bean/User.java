package net.qiujuer.web.italker.push.bean;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String sex;
    String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public User() {
    }

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
}
