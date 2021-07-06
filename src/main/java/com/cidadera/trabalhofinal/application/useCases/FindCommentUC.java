package com.cidadera.trabalhofinal.application.useCases;

import com.cidadera.trabalhofinal.application.models.response.CommentResponse;
import com.cidadera.trabalhofinal.application.services.CommentServiceImpl;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCommentUC {

    private final CommentServiceImpl service;

    public FindCommentUC(CommentServiceImpl service) {
        this.service = service;
    }

    public Optional<CommentResponse> byId(long id){

        return service.findById(id).map(comment -> new CommentResponse().fromEntity(comment));
    }
}
