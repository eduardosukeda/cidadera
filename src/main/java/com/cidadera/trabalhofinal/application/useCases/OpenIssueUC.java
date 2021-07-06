package com.cidadera.trabalhofinal.application.useCases;

import com.cidadera.trabalhofinal.application.models.response.IssueResponse;
import com.cidadera.trabalhofinal.application.models.request.OpenIssueRequest;
import com.cidadera.trabalhofinal.application.services.IssueServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class OpenIssueUC {

    private final IssueServiceImpl service;

    public OpenIssueUC(IssueServiceImpl service) {
        this.service = service;
    }

    public IssueResponse run(OpenIssueRequest request) {
        return service.openIssue(request, new IssueResponse());
    }
}
