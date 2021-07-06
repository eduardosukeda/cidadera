package com.cidadera.trabalhofinal.business.repositories;

import com.cidadera.trabalhofinal.business.entities.Comment;

import java.util.Optional;

public interface CommentRepository {
    Comment save(Comment comment);

    Optional<Comment> findById(long id);
}
