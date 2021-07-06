package com.cidadera.trabalhofinal.business.entities.mappers;

import com.cidadera.trabalhofinal.business.entities.Comment;

public interface CommentOutput<T> {

    T fromEntity(Comment comment);
}
