package Quiz02_Abstract;

public abstract class Number {
	protected int a;
	protected int b;
	
	Number()
	{
		
	}
	
	Number(int num1, int num2){
		a= num1;
		b = num2;
	}
	
	abstract void odd_even_Value();
}
