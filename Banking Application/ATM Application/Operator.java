
public class Operator extends Person {


    public void topUpATM(ATM atm) {

	System.out.println("Current Service status: " + atm.getServiceStatus());
	System.out.println("The current cash amount in the ATM is: " + atm.queryCash());
        boolean x = atm.getServiceStatus();
        if(x == true)
          x = false;

        int y = atm.queryCash();
	if(y < 5000)
	   atm.increaseCash(5000);
        System.out.println("The new amount of cash in the machine is: " + atm.queryCash());
	atm.changeServiceStatus();
        System.out.println("inService is now " + atm.getServiceStatus());
    }

}
