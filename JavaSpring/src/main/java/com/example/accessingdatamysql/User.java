package com.example.accessingdatamysql;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table (name = "user")
public class User implements java.io.Serializable {
    private static final long serUID = 1l;

    private Integer id;

    private String name;

    private Integer age;

    public User(){

    }
    public User(Integer id,String name,Integer age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }
    @Column(name = "name")
    public String getName() {
        return name;
    }
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }


}