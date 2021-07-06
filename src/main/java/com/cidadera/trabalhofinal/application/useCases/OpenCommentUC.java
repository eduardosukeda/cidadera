package com.cidadera.trabalhofinal.application.useCases;

import com.cidadera.trabalhofinal.application.models.response.CommentResponse;
import com.cidadera.trabalhofinal.application.models.request.OpenCommentRequest;
import com.cidadera.trabalhofinal.application.services.CommentServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class OpenCommentUC {

    private final CommentServiceImpl service;

    public OpenCommentUC(CommentServiceImpl service) {
        this.service = service;
    }

    public CommentResponse run(OpenCommentRequest request) {
        return service.openComment(request, new CommentResponse());
    }
}
