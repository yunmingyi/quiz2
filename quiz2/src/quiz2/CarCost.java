package quiz2;

public class CarCost {
	private int TotalCost, DownPayment, LengthOfLoan;
	private double interestrate;

	public CarCost(int TotalCost,int  DownPayment,int LengthOfLoan, double interestrate) {
		this.TotalCost  = TotalCost;
		this.DownPayment = DownPayment;
		this.LengthOfLoan = LengthOfLoan;
		this.interestrate  =interestrate; 	
	}
	public double MonthlyPay() {
		float Loan = TotalCost - DownPayment;

		float avgInterest = (float) ((interestrate / 12) * Loan); 

		float equationDivisor = (float)(1 - Math.pow((1 + (interestrate / 12)), (-1) * LengthOfLoan));

		float monthlyPayment = avgInterest / equationDivisor;
		
		return monthlyPayment;
	}
	public double TotalInterest() {
		double allPay=MonthlyPay()*	LengthOfLoan;
		double TotalInterest =0;
		TotalInterest = allPay-(TotalCost-DownPayment);
		return TotalInterest;
	}

	public static void main(String args[]) {
		CarCost Acar  = new CarCost(35000,0,60,0.1);
		System.out.println(Acar.MonthlyPay());
		System.out.println(Acar.TotalInterest());
		
	}
}
