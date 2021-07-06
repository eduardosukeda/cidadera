package com.cidadera.trabalhofinal.application.models.request;

import com.cidadera.trabalhofinal.business.entities.Comment;
import com.cidadera.trabalhofinal.business.entities.Issue;
import com.cidadera.trabalhofinal.business.entities.User;
import com.cidadera.trabalhofinal.business.entities.mappers.CommentInput;

public class OpenCommentRequest implements CommentInput {

    private Long issueId;
    private String comment;
    private String image;
    private Long userId;

    public Long getIssueId() {
        return issueId;
    }

    public void setIssueId(Long issueId) {
        this.issueId = issueId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public Comment toEntity() {
        Comment comment = new Comment();
        Issue issue = new Issue();
        issue.setId(this.getIssueId());
        comment.setIssue(issue);
        comment.setComment(this.getComment());
        comment.setImage(this.getImage());
        User user = new User();
        user.setId(this.getUserId());
        comment.setUser(user);

        return comment;
    }
}

