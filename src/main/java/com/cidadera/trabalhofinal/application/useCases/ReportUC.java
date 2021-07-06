package com.cidadera.trabalhofinal.application.useCases;

import com.cidadera.trabalhofinal.application.models.response.IssuesPerNeighborhoodResponse;
import com.cidadera.trabalhofinal.application.services.ReportService;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class ReportUC {
    private final ReportService reportService;

    public ReportUC(ReportService reportService) {
        this.reportService = reportService;
    }

    public List<IssuesPerNeighborhoodResponse> issuesPerNeighborhoodAndDateRange(LocalDate initialDate, LocalDate finalDate) {
        return reportService.issuesPerNeighborhoodAndDateRange(initialDate,finalDate);

    }
}
