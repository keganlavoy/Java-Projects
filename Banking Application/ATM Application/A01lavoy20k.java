
import java.util.Scanner;

public class A01lavoy20k {

  

    
    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("Please enter a value between 0 an 10,000.");
	int startValue = scan.nextInt();
	if(startValue < 0 | startValue > 10000)
	    {
	    System.out.println("Not a valid input try again.");
	    startValue = scan.nextInt();
	    }

	ATM atm1 = new ATM();
	ATM atm2 = new ATM(startValue, true);

	Operator operator1 = new Operator();
	System.out.println("Enter a name for the Operator.");
	String opName = scan.nextLine();
	operator1.setName(opName);

	System.out.println("Processing ATM 1.");
	operator1.topUpATM(atm1);
	System.out.println("Processsing ATM 2.");
	operator1.topUpATM(atm2);


	Customer customer1 = new Customer();
	System.out.println("Enter a name for the customer.");
	String custName = scan.nextLine();
	customer1.setName(custName);

	System.out.println("Enter an amonut of money to withdraw.");
	int withdraw = scan.nextInt();
	customer1.withdrawCash(atm2, withdraw);
	
	    




    }



}
