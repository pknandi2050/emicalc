package com.example.emicalc.controller;

import com.example.emicalc.model.LoanRequest;
import com.example.emicalc.model.MonthlyEmiModel;
import com.example.emicalc.service.LoanCalculatorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {
        private final LoanCalculatorService loanService;

        public LoanController(LoanCalculatorService loanService) {
            this.loanService = loanService;
        }

        @PostMapping("/calculate-emi")
        public List<MonthlyEmiModel> calculateEMI(@RequestBody LoanRequest request) {
            return loanService.calculateEMISchedule(request.getPrincipal(), request.getAnnualInterestRate(), request.getTenureMonths());
        }

}
