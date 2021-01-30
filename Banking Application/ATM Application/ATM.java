
public class ATM {

    private int cash;
    private boolean inService;


     ATM() {

	cash = 0;
	inService = false;
	
    }


     ATM(int x, boolean y) {

	cash = x;
	inService = y;
    }


    public int queryCash() {

	return cash;
    }


    public void increaseCash(int x) {


	cash = cash + x;
    }


    public void reduceCash(int x) {

	cash = cash - x;
	
    }


    public boolean getServiceStatus() {

	return inService;
    }


    public void changeServiceStatus() {

	if(inService == false)
	    inService = true;
	else
	    inService = false;
    }


    

    public class CashDispenser {

	public void dispenseCash(int x) {

	    reduceCash(x);
	    System.out.println(x + " dollars has been dispensed.");
	    
	}
    }
	


    public class ReceiptPrinter {

	public void printReceipt() {
	    
	    System.out.println("Receipt has been printed");
	    
	}
    }


    public class CardReader {

	public void readCard() {

	    System.out.println("Card has been read");
	}    
    }



	public class KeypadDisplay {

	    public void PINverification() {

		System.out.println("PIN has been verified.");
	    }
	}



	CashDispenser dispenser = new CashDispenser();
	ReceiptPrinter printer = new ReceiptPrinter();
	CardReader reader = new CardReader();
	KeypadDisplay display = new KeypadDisplay();
	
    
    
}
