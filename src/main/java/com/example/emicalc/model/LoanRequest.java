package com.example.emicalc.model;

import org.springframework.web.bind.annotation.RequestBody;

public class LoanRequest {

        private double principal;
        private double annualInterestRate;
        private int tenureMonths;

        // Constructors
        public LoanRequest() {}

        public LoanRequest(double principal, double annualInterestRate, int tenureMonths) {
            this.principal = principal;
            this.annualInterestRate = annualInterestRate;
            this.tenureMonths = tenureMonths;
        }

        // Getters & Setters
        public double getPrincipal() {
            return principal;
        }

        public void setPrincipal(double principal) {
            this.principal = principal;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public int getTenureMonths() {
            return tenureMonths;
        }

        public void setTenureMonths(int tenureMonths) {
            this.tenureMonths = tenureMonths;
        }

}
