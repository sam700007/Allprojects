package com.finance;

public abstract class Finance {
	
		private double interestRate;
		
		public double getInterestRate() {
			return interestRate;
		}
		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		
		
		public abstract double calculateInterest(double interestRate, double tenure,double balance);

}
