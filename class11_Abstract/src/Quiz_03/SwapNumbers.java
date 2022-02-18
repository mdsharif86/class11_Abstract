package Quiz_03;

public class SwapNumbers extends Swapping {
	
	SwapNumbers(int a, int b)
	{
		super(a, b);
	}

	@Override
	void swapUsingTwoVariables() {
		System.out.println("Swap using two variables >>>");
		System.out.println("Before swapping: " + a + " " + b);
		
		// a = 7 , b = 8
//		a = a + b; // a = 15
//		b = a - b;// b = 7
//		a = a - b; // a = 8
		
		// a = 7 , b = 8
		a = a * b; // a = 56
		b = a / b; // b = 7
		a = a / b; // a = 8
		
		System.out.println("After swapping: " + a + " " + b);
	}

	@Override
	void swapUsingThreeVariables() {
		System.out.println("Swap using three variables >>>");
		System.out.println("Before swapping: " + a + " " + b);
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping: " + a + " " + b);
	}
	
}
