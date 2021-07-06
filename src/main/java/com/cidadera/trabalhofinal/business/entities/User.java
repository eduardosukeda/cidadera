package com.cidadera.trabalhofinal.business.entities;

import com.cidadera.trabalhofinal.business.entities.enums.UserTypeEnum;

import javax.persistence.*;
import java.util.List;

@Entity(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private UserTypeEnum userType;
    @OneToMany(mappedBy="user")
    private List<Issue> issues;
    @OneToMany(mappedBy="user")
    private List<Comment> comments;

    public User() {
    }

    public User(String name, UserTypeEnum userType) {
        this.name = name;
        this.userType = userType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
