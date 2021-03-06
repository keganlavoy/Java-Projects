public class ConcreteFlightDecorator extends FlightDecorator {


    private boolean legroomSeats;
    private boolean inflightMeals;
    private boolean excessBags;


    ConcreteFlightDecorator(Flight flightToDecorate) {
	super(flightToDecorate);
    }

    public void  extraLegroomSeats(char x) {
	if(x == 'N' || x == 'n')
	legroomSeats = false;
	else
	    legroomSeats = true;
    }

    

    public void inFlightMeals(char x) {
	if(x == 'N' || x == 'n')
	    inflightMeals = false;
	else
	    inflightMeals = true;
	
    }
        
    public void excessBaggage(char x) {
	if(x == 'N' || x ==  'n')
	    excessBags = false;
	else
	    excessBags = true;
	
    }



    public boolean getLegroomSeats() {
	return legroomSeats;
    }


    public boolean getInFlightsMeals() {
	return inflightMeals;
    }

    public boolean getExcessBaggage() {
	return excessBags;
    }

    
}
