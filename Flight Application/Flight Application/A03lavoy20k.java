
import java.util.Scanner;

public class A03lavoy20k {


	public static void main(String[] args) {

	     int flightChoice;
	     char legroomInput;
	     char mealsInput;
	     char baggageInput;
	     String depCity;
	     String arrCity;
	     Flight[] flightsDatabase = new Flight[3];
	     Flight[] matchingFlights = new Flight[3];
	     int numMatchingFlights = 0;
             Scanner scanner = new Scanner(System.in);
	    
	    
	     flightsDatabase[0] = new Flight("Regina", "Vancouver", "0900H", 300);
	     
	     flightsDatabase[1] = new Flight("Regina", "Vancouver", "1500H", 350);

	     flightsDatabase[2] = new Flight("Regina", "Toronto", "1300H", 500);



	     System.out.println("Enter Departure City:");
	     depCity = scanner.nextLine();
	     System.out.println("\n Enter Arrival City:");
	     arrCity = scanner.nextLine();

	     for(int i = 0; i < 3; i++)
		 {
		     if(flightsDatabase[i].getDepartureCity().equals(depCity) && flightsDatabase[i].getArrivalCity().equals(arrCity))
			 {
			     matchingFlights[numMatchingFlights] = new Flight(depCity, arrCity, flightsDatabase[i].getDepartureTime(), flightsDatabase[i].getPrice()); 
			     numMatchingFlights++;
			     
			 }

		 }


	     System.out.println("Flights Found: ");

	     for(int i = 0; i < numMatchingFlights; i++)
		 {
		     System.out.println("(" + (i + 1) + ") " + matchingFlights[i].getDepartureCity() + " " + matchingFlights[i].getArrivalCity() + " " + matchingFlights[i].getDepartureTime() + " " + matchingFlights[i].getPrice() + "\n");

		 }


	     System.out.println("Which flight do you want? \n");
	     flightChoice = scanner.nextInt();
             ConcreteFlightDecorator flightDecorator = new ConcreteFlightDecorator(matchingFlights[flightChoice - 1]);
	     
	     System.out.println("Do you want to add extra legroom seats? (Y/N): \n");
	     legroomInput = scanner.next().charAt(0);

	     flightDecorator.extraLegroomSeats(legroomInput);

	     System.out.println("Do you want to add in flight meals? (Y/N): \n");
	     mealsInput = scanner.next().charAt(0);

	     flightDecorator.inFlightMeals(mealsInput);


	     System.out.println("Do you want to add excess baggage? (Y/N): \n");
	     baggageInput = scanner.next().charAt(0);

	     flightDecorator.excessBaggage(baggageInput);
	     

	     if(flightDecorator.getLegroomSeats() == true)
		 matchingFlights[flightChoice - 1].setPrice(matchingFlights[flightChoice - 1].getPrice() + 30);

	     if(flightDecorator.getInFlightsMeals() == true)
		 matchingFlights[flightChoice - 1].setPrice(matchingFlights[flightChoice - 1].getPrice() + 10);

	     if(flightDecorator.getExcessBaggage() == true)
		 matchingFlights[flightChoice - 1].setPrice(matchingFlights[flightChoice - 1].getPrice() + 20);





	     System.out.println("Your final flight information is:");
	     System.out.println("Departure City: " + matchingFlights[flightChoice - 1].getDepartureCity());
	     System.out.println("Arrival City: " + matchingFlights[flightChoice - 1].getArrivalCity());
	     System.out.println("Time: " + matchingFlights[flightChoice - 1].getDepartureTime());
	     System.out.println("Extra Legroom: " + legroomInput);
	     System.out.println("In-Flight meals: " + mealsInput);
	     System.out.println("Excess baggage: " + baggageInput);
	     System.out.println("Total price: " + matchingFlights[flightChoice - 1].getPrice());

	     
	    
	     
	     
	}
}
