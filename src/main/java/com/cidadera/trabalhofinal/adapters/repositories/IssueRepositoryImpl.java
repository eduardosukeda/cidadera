package com.cidadera.trabalhofinal.adapters.repositories;

import com.cidadera.trabalhofinal.business.entities.Issue;
import com.cidadera.trabalhofinal.business.repositories.IssueRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IssueRepositoryImpl extends CrudRepository<Issue,Long>, IssueRepository {

    @Query(value = "select count(*), i.neighborhood, i.category " +
            "from issues i " +
            "where i.date between ?1 and ?2 " +
            "group by i.neighborhood, i.category", nativeQuery = true)
    List<String[]> issuesPerNeighborhoodAndDateRange(LocalDate initialDate, LocalDate finalDate);

}
