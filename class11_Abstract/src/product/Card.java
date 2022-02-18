package product;

import class11_Abstract.Account;

public class Card { //it is a class
	long cardId;
	Card() {
		Account p =new Account();
		p.id=3;
		cardId=12345;
	}   //p.name Her is not accessible and visible
		// because it is a class of different package
}
