
package Tuition;

import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input total tuition cost per year: ");
		double Tuition = 4 * sc.nextDouble();
		
		System.out.println("Input the % increases for the university: ");
		double PercentIncrease = sc.nextDouble();
		
		System.out.println("Input your repayment APR: ");
		double APR = sc.nextDouble();
		
		System.out.println("Input how long you have to pay off the costs: ");
		double Term = sc.nextDouble();
		
		double TotalTuition = TotalTuition(Tuition, PercentIncrease);
		double monthlyPayment = MonthlyPay(TotalTuition, APR, Term);
		
		System.out.printf("The total cost of tuition will be $%7.2f and the monthly payment will be $%4.2f", TotalTuition, monthlyPayment);
		
	}
	
	private static double TotalTuition(double tuition, double percent){
		double total = tuition;
		for(int i = 0; i < 2; i++){
			tuition = tuition * percent;
			total += tuition;
		}
		return total;
	}
	
	private static double MonthlyPay(double principle, double APR, double term){
		double APRm = APR / 12;
		double monthly = principle * (APRm/(1-Math.pow(1+APRm, term * -1)));
		return monthly;
	}
}