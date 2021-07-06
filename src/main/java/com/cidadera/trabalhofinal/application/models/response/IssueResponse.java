package com.cidadera.trabalhofinal.application.models.response;

import com.cidadera.trabalhofinal.business.entities.Issue;
import com.cidadera.trabalhofinal.business.entities.enums.IssueCategoryEnum;
import com.cidadera.trabalhofinal.business.entities.enums.IssueStatusEnum;
import com.cidadera.trabalhofinal.business.entities.mappers.IssueOutput;

import java.time.LocalDate;

public class IssueResponse implements IssueOutput<IssueResponse> {
    private Long id;
    private String title;
    private String description;
    private LocalDate date;
    private String neighborhood;
    private String street;
    private IssueCategoryEnum category;
    private String imageLink;
    private IssueStatusEnum issueStatus;
    private Long userId;

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

    public void setCategory(IssueCategoryEnum category) {
        this.category = category;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public IssueResponse fromEntity(Issue issue) {

        this.setId(issue.getId());
        this.setTitle(issue.getTitle());
        this.setDescription(issue.getDescription());
        this.setDate(issue.getDate());
        this.setNeighborhood(issue.getNeighborhood());
        this.setStreet(issue.getStreet());
        this.setCategory(issue.getCategory());
        this.setImageLink(issue.getImageLink());
        this.setIssueStatus(issue.getIssueStatus());
        this.setUserId(issue.getUser().getId());

        return this;
    }
}
