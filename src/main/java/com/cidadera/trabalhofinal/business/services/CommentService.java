package com.cidadera.trabalhofinal.business.services;

import com.cidadera.trabalhofinal.business.entities.Comment;
import com.cidadera.trabalhofinal.business.entities.Issue;
import com.cidadera.trabalhofinal.business.entities.mappers.CommentInput;
import com.cidadera.trabalhofinal.business.entities.mappers.CommentOutput;
import com.cidadera.trabalhofinal.business.repositories.CommentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

public abstract class CommentService {
    protected CommentRepository repository;
    protected IssueService issueService;

    public CommentService(CommentRepository repository, IssueService issueService) {
        this.repository = repository;
        this.issueService = issueService;
    }

    public <T> T openComment(CommentInput request, CommentOutput<T> response){
        Comment comment = request.toEntity();
        comment.setId(null);
        Issue issue = issueService.findById(comment.getIssue().getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY));
        comment.setIssue(issue);
        Comment save = repository.save(comment);
        return response.fromEntity(save);
    }

    public Optional<Comment> findById(long id){
        return repository.findById(id);
    }

    public <T> Optional<T> editComment(CommentInput request, CommentOutput<T> response){
        Comment comment = request.toEntity();
        return findById(comment.getId())
                .map(entity -> repository.save(comment))
                .map(response::fromEntity);

    }
}
