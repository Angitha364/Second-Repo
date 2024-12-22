package assigSupeKey;

public class DivResult extends AddResult 
{
	public boolean isDivByTen(int a, int b)
	{
		int c =super.add(a, b);
		return c % 10 == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivResult obj =new DivResult();
		int a =15;
		int b =15;
		boolean result = obj.isDivByTen(a,b);
		if(result)
		{
			System.out.println("The addition result of " + a + "and" + b + "is divisible by 10");
		}
		else
		{
			System.out.println("The addition result of " + a + "and" + b + "isnot divisible by 10");	
		}
	}
}

