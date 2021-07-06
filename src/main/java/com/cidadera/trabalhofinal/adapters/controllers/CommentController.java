package com.cidadera.trabalhofinal.adapters.controllers;

import com.cidadera.trabalhofinal.application.models.request.EditCommentRequest;
import com.cidadera.trabalhofinal.application.models.request.OpenCommentRequest;
import com.cidadera.trabalhofinal.application.models.response.CommentResponse;
import com.cidadera.trabalhofinal.application.useCases.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/comments")
public class CommentController {
    private final OpenCommentUC openCommentUC;
    private final FindCommentUC findCommentUC;
    private final EditCommentUC editCommentUC;

    public CommentController(OpenCommentUC openCommentUC, FindCommentUC findCommentUC, EditCommentUC editCommentUC) {
        this.openCommentUC = openCommentUC;
        this.findCommentUC = findCommentUC;
        this.editCommentUC = editCommentUC;
    }

    @PostMapping
    public ResponseEntity<CommentResponse> openComment(@RequestBody OpenCommentRequest request) {
        return new ResponseEntity<>(openCommentUC.run(request), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CommentResponse> editComment(@RequestBody EditCommentRequest request) {
        return editCommentUC.run(request)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<CommentResponse> findCommentById(@PathVariable Long userId) {
       return findCommentUC.byId(userId)
               .map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
    }
}
