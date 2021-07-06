package com.cidadera.trabalhofinal.application.services;

import com.cidadera.trabalhofinal.application.models.response.IssuesPerNeighborhoodResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReportService {
    private final IssueServiceImpl issueService;
    private final CommentServiceImpl commentService;
    private final UserServiceImpl userService;

    public ReportService(IssueServiceImpl issueService, CommentServiceImpl commentService, UserServiceImpl userService) {
        this.issueService = issueService;
        this.commentService = commentService;
        this.userService = userService;
    }

    public List<IssuesPerNeighborhoodResponse> issuesPerNeighborhoodAndDateRange(LocalDate initialDate, LocalDate finalDate) {
      return issueService.issuesPerNeighborhoodAndDateRange(initialDate, finalDate);
    }
}
