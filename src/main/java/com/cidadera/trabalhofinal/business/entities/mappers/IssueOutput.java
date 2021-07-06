package com.cidadera.trabalhofinal.business.entities.mappers;

import com.cidadera.trabalhofinal.business.entities.Issue;

public interface IssueOutput<T> {

    T fromEntity(Issue issue);
}
