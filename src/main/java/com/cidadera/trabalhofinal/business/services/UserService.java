package com.cidadera.trabalhofinal.business.services;

import com.cidadera.trabalhofinal.business.repositories.UserRepository;

public abstract class UserService {
    protected UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }


}