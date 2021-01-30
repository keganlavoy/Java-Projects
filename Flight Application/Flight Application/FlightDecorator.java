abstract class FlightDecorator {

    private Flight flight;

    FlightDecorator(Flight flightToDecorate) {
	flight = flightToDecorate;
    }

    public void extraLegroomSeats() {
	System.out.println("extra legroom");
    }
    
    public void inFlightMeals() {
	System.out.println("in-flight meals");
    }
    
    public void excessBaggage() {
	System.out.println("excess baggage");
    }
    


}
