package com.cidadera.trabalhofinal.application.models.request;

import com.cidadera.trabalhofinal.business.entities.Issue;
import com.cidadera.trabalhofinal.business.entities.User;
import com.cidadera.trabalhofinal.business.entities.enums.IssueCategoryEnum;
import com.cidadera.trabalhofinal.business.entities.enums.IssueStatusEnum;
import com.cidadera.trabalhofinal.business.entities.mappers.IssueInput;

import java.time.LocalDate;

public class EditIssueRequest implements IssueInput {
    private long id;
    private String title;
    private String description;
    private LocalDate date;
    private String neighborhood;
    private String street;
    private IssueCategoryEnum category;
    private String imageLink;
    private Long userId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public void setCategory(IssueCategoryEnum category) {
        this.category = category;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public Issue toEntity() {
        Issue issue = new Issue();
        issue.setId(this.getId());
        issue.setTitle(this.getTitle());
        issue.setDescription(this.getDescription());
        issue.setDate(this.getDate());
        issue.setNeighborhood(this.getNeighborhood());
        issue.setStreet(this.getStreet());
        issue.setCategory(this.getCategory());
        issue.setImageLink(this.getImageLink());
        issue.setIssueStatus(IssueStatusEnum.ABERTA);
        User user = new User();
        user.setId(this.getUserId());
        issue.setUser(user);

        return issue;
    }
}

