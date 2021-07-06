package com.cidadera.trabalhofinal.application.useCases;

import com.cidadera.trabalhofinal.application.models.response.CommentResponse;
import com.cidadera.trabalhofinal.application.models.request.EditCommentRequest;
import com.cidadera.trabalhofinal.application.services.CommentServiceImpl;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EditCommentUC {

    private final CommentServiceImpl service;

    public EditCommentUC(CommentServiceImpl service) {
        this.service = service;
    }

    public Optional<CommentResponse> run(EditCommentRequest request) {
        return service.editComment(request, new CommentResponse());

    }
}
