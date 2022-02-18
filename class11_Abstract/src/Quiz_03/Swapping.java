package Quiz_03;

public abstract class Swapping {
	 
	protected int a;
	protected int b;
	
	Swapping(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	abstract void swapUsingTwoVariables();
	abstract void swapUsingThreeVariables();

}
