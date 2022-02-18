package Abstract_Quiz_01;

public class Find_Max_Min_Equal extends Numbers {
	
	Find_Max_Min_Equal()
	{
		
	}

	Find_Max_Min_Equal(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	void max_Min_Equal_Value() {
		if(a>b)
		{
			System.out.println(a + " is greater than " + b);
		}
		else if(a<b)
		{
			System.out.println(b + " is greater than " + a);
		}
		else
		{
			System.out.println(a + " is equal to " + b);
		}
	}

}
