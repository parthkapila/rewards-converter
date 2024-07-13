package main.java;

public class RewardValue {
    public main() {
        private double cashValue;
        private double getMilesValue;
        private static final double MilesToCashRate = 0.00035;
        
        // Constructor that accepts a cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.getMilesValue = cashValue / MilesToCashRate;
        }

        // Constructor that accepts a miles value
        public RewardValue(double milesValue) {
            this.getMilesValue = milesValue;
            this.cashValue = milesValue * MilesToCashRate;
        }

        public double getCashValue() {
            return cashValue;
        }

        public double getMilesValue() {
            return getMilesValue;
        }
    }
}
