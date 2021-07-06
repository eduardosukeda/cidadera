package com.cidadera.trabalhofinal.application.services;

import com.cidadera.trabalhofinal.business.repositories.CommentRepository;
import com.cidadera.trabalhofinal.business.services.CommentService;
import com.cidadera.trabalhofinal.business.services.IssueService;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl extends CommentService {
    public CommentServiceImpl(CommentRepository repository, IssueService issueService) {
        super(repository, issueService);
    }
}
