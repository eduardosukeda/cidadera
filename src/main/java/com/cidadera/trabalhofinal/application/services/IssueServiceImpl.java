package com.cidadera.trabalhofinal.application.services;

import com.cidadera.trabalhofinal.application.models.response.IssuesPerNeighborhoodResponse;
import com.cidadera.trabalhofinal.business.repositories.IssueRepository;
import com.cidadera.trabalhofinal.business.services.IssueService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class IssueServiceImpl extends IssueService {
    public IssueServiceImpl(IssueRepository repository) {
        super(repository);
    }

    public List<IssuesPerNeighborhoodResponse> issuesPerNeighborhoodAndDateRange(LocalDate initialDate, LocalDate finalDate){
        return repository.issuesPerNeighborhoodAndDateRange(initialDate, finalDate).stream()
        .map(obj-> new IssuesPerNeighborhoodResponse(Long.valueOf(obj[0]),obj[1],obj[2]))
        .collect(Collectors.toList());
    }

}
