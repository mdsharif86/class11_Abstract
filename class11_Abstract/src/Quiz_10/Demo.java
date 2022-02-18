package Quiz_10;

public class Demo extends Sum {
	

	@Override
	public int sumOfTwo(int n1, int n2) {
		int sum;
		sum = n1 + n2;
		return sum;
	}

	@Override
	public int sumOfThree(int n1, int n2, int n3) {
		
		return (n1 + n2 + n3);
	}
}
