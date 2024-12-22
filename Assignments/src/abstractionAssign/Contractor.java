package abstractionAssign;

public class Contractor extends Employee {
	private double paymentPerHour;
	private int workingHours;
	public Contractor(double paymentPerHour, int workingHours  )
	{
		this.paymentPerHour = paymentPerHour;
		this.workingHours = workingHours;
	}

	@Override
	public double calculatesSalary() {
		// TODO Auto-generated method stub
		return paymentPerHour * workingHours ;
	}

}
