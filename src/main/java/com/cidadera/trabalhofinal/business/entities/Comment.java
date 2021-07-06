package com.cidadera.trabalhofinal.business.entities;

import javax.persistence.*;

@Entity(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String comment;
    private String image;
    @ManyToOne
    @JoinColumn(name="issue_id", nullable=false)
    private Issue issue;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public Comment() {
    }

    public Comment(String comment, Issue issue, User user) {
        this.comment = comment;
        this.issue = issue;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
