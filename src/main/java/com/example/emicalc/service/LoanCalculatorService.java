package com.example.emicalc.service;

import com.example.emicalc.model.MonthlyEmiModel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoanCalculatorService {


        public List<MonthlyEmiModel> calculateEMISchedule(double principal, double annualInterestRate, int tenureMonths) {
            List<MonthlyEmiModel> emiSchedule = new ArrayList<>();

            // Convert annual interest rate to monthly and fraction
            double monthlyInterestRate = (annualInterestRate / 100) / 12;

            // Calculate fixed EMI using formula: EMI = [P * r * (1+r)^n] / [(1+r)^n - 1]
            double emi = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, tenureMonths)) /
                    (Math.pow(1 + monthlyInterestRate, tenureMonths) - 1);

            double outstandingPrincipal = principal;

            for (int month = 1; month <= tenureMonths; month++) {
                double interestPaid = outstandingPrincipal * monthlyInterestRate;
                double principalRepaid = emi - interestPaid;
                outstandingPrincipal -= principalRepaid;

                emiSchedule.add(new MonthlyEmiModel(month, principalRepaid, Math.max(outstandingPrincipal, 0), interestPaid, emi));
            }

            return emiSchedule;
        }


}
