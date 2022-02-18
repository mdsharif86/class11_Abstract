package Quiz02_Abstract;

public class Find_even_Value extends Number {
	
	Find_even_Value()
	{
		
	}
	
	Find_even_Value(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	void odd_even_Value() {
		if(a%2 == 0 && b%2 == 0)
		{
			System.out.println(a + " is even and " + b + " is also even");
		}
		else if(a%2 != 0 && b%2 != 0)
		{
			System.out.println(a + " is odd and " + b + " is also odd");
		}
		else if(a%2 == 0 && b%2 != 0)
		{
			System.out.println(a + " is even and " + b + " is odd");
		}
		else if(a%2 != 0 && b%2 == 0)
		{
			System.out.println(a + " is odd and " + b + " is even");
		}
		
		// 99 / 2 = 49 = remainder = 1
	}
	
	
}
