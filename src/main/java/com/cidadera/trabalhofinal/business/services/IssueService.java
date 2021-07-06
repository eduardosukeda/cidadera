package com.cidadera.trabalhofinal.business.services;

import com.cidadera.trabalhofinal.business.entities.Issue;
import com.cidadera.trabalhofinal.business.entities.mappers.IssueInput;
import com.cidadera.trabalhofinal.business.entities.mappers.IssueOutput;
import com.cidadera.trabalhofinal.business.repositories.IssueRepository;

import java.util.Optional;

public abstract class IssueService {
    protected IssueRepository repository;

    public IssueService(IssueRepository repository) {
        this.repository = repository;
    }

    public <T> T openIssue(IssueInput request, IssueOutput<T> response) {
        Issue issue = request.toEntity();
        issue.setId(null);
        Issue save = repository.save(issue);
        return response.fromEntity(save);
    }

    public Optional<Issue> findById(long id) {
        return repository.findById(id);
    }

    public <T> Optional<T> editIssue(IssueInput request, IssueOutput<T> response) {
        Issue issue = request.toEntity();
        return findById(issue.getId())
                .map(entity -> repository.save(issue))
                .map(response::fromEntity);

    }

}