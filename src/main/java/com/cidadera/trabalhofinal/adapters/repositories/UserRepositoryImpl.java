package com.cidadera.trabalhofinal.adapters.repositories;

import com.cidadera.trabalhofinal.business.entities.User;
import com.cidadera.trabalhofinal.business.repositories.UserRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryImpl extends CrudRepository<User, Long>, UserRepository {


}
