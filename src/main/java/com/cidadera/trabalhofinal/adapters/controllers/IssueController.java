package com.cidadera.trabalhofinal.adapters.controllers;

import com.cidadera.trabalhofinal.application.models.request.EditIssueRequest;
import com.cidadera.trabalhofinal.application.models.response.IssueResponse;
import com.cidadera.trabalhofinal.application.models.request.OpenIssueRequest;
import com.cidadera.trabalhofinal.application.useCases.EditIssueUC;
import com.cidadera.trabalhofinal.application.useCases.FindIssueUC;
import com.cidadera.trabalhofinal.application.useCases.OpenIssueUC;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/issues")
public class IssueController {
    private final OpenIssueUC openIssueUC;
    private final FindIssueUC findIssueUC;
    private final EditIssueUC editIssueUC;

    public IssueController(OpenIssueUC openIssueUC, FindIssueUC findIssueUC, EditIssueUC editIssueUC) {
        this.openIssueUC = openIssueUC;
        this.findIssueUC = findIssueUC;
        this.editIssueUC = editIssueUC;
    }

    @PostMapping
    public ResponseEntity<IssueResponse> openIssue(@RequestBody OpenIssueRequest request) {
        return new ResponseEntity<>(openIssueUC.run(request), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<IssueResponse> editIssue(@RequestBody EditIssueRequest request) {
        return editIssueUC.run(request)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<IssueResponse> findIssueById(@PathVariable Long userId) {
       return findIssueUC.byId(userId)
               .map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
    }
}
