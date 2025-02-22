package com.example.emicalc.model;

public class MonthlyEmiModel {
        private int month;
        private double principalRepaid;
        private double outstandingPrincipal;
        private double interestPaid;
        private double emiPaid;

        public MonthlyEmiModel(int month, double principalRepaid, double outstandingPrincipal, double interestPaid, double emiPaid) {
            this.month = month;
            this.principalRepaid = principalRepaid;
            this.outstandingPrincipal = outstandingPrincipal;
            this.interestPaid = interestPaid;
            this.emiPaid = emiPaid;
        }

        // Getters & Setters
        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public double getPrincipalRepaid() {
            return principalRepaid;
        }

        public void setPrincipalRepaid(double principalRepaid) {
            this.principalRepaid = principalRepaid;
        }

        public double getOutstandingPrincipal() {
            return outstandingPrincipal;
        }

        public void setOutstandingPrincipal(double outstandingPrincipal) {
            this.outstandingPrincipal = outstandingPrincipal;
        }

        public double getInterestPaid() {
            return interestPaid;
        }

        public void setInterestPaid(double interestPaid) {
            this.interestPaid = interestPaid;
        }

        public double getEmiPaid() {
            return emiPaid;
        }

        public void setEmiPaid(double emiPaid) {
            this.emiPaid = emiPaid;
        }

}
