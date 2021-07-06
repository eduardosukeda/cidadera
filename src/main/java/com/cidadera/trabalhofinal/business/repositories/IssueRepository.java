package com.cidadera.trabalhofinal.business.repositories;

import com.cidadera.trabalhofinal.business.entities.Issue;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IssueRepository {
    Issue save(Issue issue);

    Optional <Issue> findById(long id);

    List<String[]> issuesPerNeighborhoodAndDateRange(LocalDate initialDate, LocalDate finalDate);
}
