
public class Customer extends Person {

    public void withdrawCash(ATM atm, int amount) {


	System.out.println("Current Service status: " + atm.getServiceStatus());
	boolean x = atm.getServiceStatus();
	if(x == false)
	    System.out.println("ATM is not in Service.");

	int y = atm.queryCash();
	if(y < amount)
	    System.out.println("ATM has insufficient cash.");

	else
	    {

		atm.reader.readCard();
		atm.display.PINverification();
		atm.dispenser.dispenseCash(amount);
		atm.printer.printReceipt();
		System.out.println(amount + " successfully withdrawn from ATM.");
			   
		
	    }

    }


}
