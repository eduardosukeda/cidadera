package com.cidadera.trabalhofinal.adapters.controllers;

import com.cidadera.trabalhofinal.application.models.response.IssuesPerNeighborhoodResponse;
import com.cidadera.trabalhofinal.application.useCases.ReportUC;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/v1/report")
public class ReportController {
    private final ReportUC reportUC;

    public ReportController(ReportUC reportUC) {
        this.reportUC = reportUC;
    }

    @GetMapping("/issues/neighborhood/category")
    public ResponseEntity<List<IssuesPerNeighborhoodResponse>> issuesPerNeighborhood(@RequestParam(required = false)@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate initialDate, @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate finalDate) {
        return ResponseEntity.ok(reportUC.issuesPerNeighborhoodAndDateRange(initialDate,finalDate));

    }
}
