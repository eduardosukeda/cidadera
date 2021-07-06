package com.cidadera.trabalhofinal.business.entities;

import com.cidadera.trabalhofinal.business.entities.enums.IssueCategoryEnum;
import com.cidadera.trabalhofinal.business.entities.enums.IssueStatusEnum;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name="issues")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private LocalDate date;
    private String neighborhood;
    private String street;
    @Enumerated(EnumType.STRING)
    private IssueCategoryEnum category;
    private String imageLink;
    @Enumerated(EnumType.STRING)
    private IssueStatusEnum issueStatus;
    @OneToMany(mappedBy="issue")
    private List<Comment> comments;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public Issue() {
    }

    public Issue(String title, String description, LocalDate date, String neighborhood, String street, IssueCategoryEnum category, IssueStatusEnum issueStatus, User user) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.neighborhood = neighborhood;
        this.street = street;
        this.category = category;
        this.issueStatus = issueStatus;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public IssueCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(IssueCategoryEnum type) {
        this.category = type;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public IssueStatusEnum getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(IssueStatusEnum issueStatus) {
        this.issueStatus = issueStatus;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comment) {
        this.comments = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
