package Programs;
import java.util.Scanner;

public class CalcDisc {
	public static double prices(double a, double b, double c)
	{
	double totalAmount;
	totalAmount= a + b + c;
	double discount=0.0;
	if(totalAmount>5000)
	{
	 discount =totalAmount*0.2;
	 double finalAmount=totalAmount - discount;
	}
	return totalAmount - discount;
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		double c= sc.nextDouble();
		
		
		System.out.println("Enter the total amount : ");
		double totalAmount= sc.nextDouble();
		double finalAmount=prices(5000.0,2550.02,1500.5);
		if(totalAmount>5000)
		{
		System.out.println("You are eligible for a 20% discount!");
		}
		else
		{
		System.out.println("No discount applied");
		}
		System.out.println("Final Amount after discount:" + finalAmount);
		}

	}
	

