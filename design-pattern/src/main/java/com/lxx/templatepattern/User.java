package com.lxx.templatepattern;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lixiaoxiang
 */
@Data
public class User implements Serializable {
    //id
    private Integer id;
    //用户姓名
    private String name;
    //性别
    private String sex;
    //年龄
    private int age;

    public User() {
    }

    public User(Integer id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}