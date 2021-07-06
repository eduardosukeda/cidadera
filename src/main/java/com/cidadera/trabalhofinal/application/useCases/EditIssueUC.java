package com.cidadera.trabalhofinal.application.useCases;

import com.cidadera.trabalhofinal.application.models.request.EditIssueRequest;
import com.cidadera.trabalhofinal.application.models.response.IssueResponse;
import com.cidadera.trabalhofinal.application.services.IssueServiceImpl;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EditIssueUC {

    private final IssueServiceImpl service;

    public EditIssueUC(IssueServiceImpl service) {
        this.service = service;
    }

    public Optional<IssueResponse> run(EditIssueRequest request) {
        return service.editIssue(request, new IssueResponse());

    }
}
