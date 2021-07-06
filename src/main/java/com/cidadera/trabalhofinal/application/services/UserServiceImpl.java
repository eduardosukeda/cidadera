package com.cidadera.trabalhofinal.application.services;

import com.cidadera.trabalhofinal.business.repositories.UserRepository;
import com.cidadera.trabalhofinal.business.services.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

}
