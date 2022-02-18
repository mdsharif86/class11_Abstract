package product;

import class11_Abstract.Account;

public class DebitCard extends Account {
	int pin;
	void sales() {
		id=3;
		name= "joe";  ///here name is accessible and visible
		pin= 1234;  // because DebitCard is a Subclass of Account
					// of different package
		
	}
}
