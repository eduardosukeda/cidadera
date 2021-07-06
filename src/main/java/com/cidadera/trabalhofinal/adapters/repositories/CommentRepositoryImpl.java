package com.cidadera.trabalhofinal.adapters.repositories;

import com.cidadera.trabalhofinal.business.entities.Comment;
import com.cidadera.trabalhofinal.business.repositories.CommentRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepositoryImpl extends CrudRepository<Comment,Long>, CommentRepository {

}
