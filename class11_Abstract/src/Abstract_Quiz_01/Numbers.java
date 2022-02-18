package Abstract_Quiz_01;

public abstract class Numbers {
	protected int a;
	protected int b;
	
	Numbers()
	{
		
	}
	
	Numbers(int num1, int num2)
	{
		a = num1;
		b = num2;
	}
	
	abstract void max_Min_Equal_Value();
}
