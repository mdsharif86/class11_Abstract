package example_Abstract;

public class CheckingAccount extends Account {
	double accFee;

	void CalculateFee() {
		System.out.println("fee is $10");
	}

	@Override
	void calculateFee() {
		// TODO Auto-generated method stub

	}
}