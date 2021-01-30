import java.util.Scanner;

public class Lab03lavoy20k {


    public static void main(String[] args) {

	
	char sportModeInput;
	char floorLinerInput;
	char carStarterInput;
	char sportsWheelsInput;
	char rearSpoilerInput;
	Scanner scanner = new Scanner(System.in);


	Car testCar = new Car("IS 300", 41000);

	System.out.println("You can customize your own lexus IS 300 right here. The starting price of the car is $41000.");
	
	System.out.println("Do you want to add Sports Mode? (Y/N): ");
	sportModeInput = scanner.next().charAt(0);

	System.out.println("Do you want to add floor liners? (Y/N): ");
	floorLinerInput = scanner.next().charAt(0);
	
	System.out.println("Do you want to add a car starter? (Y/N): ");
	carStarterInput = scanner.next().charAt(0);
	
	System.out.println("Do you want to add sport wheels? (Y/N): ");
	sportsWheelsInput = scanner.next().charAt(0);
	
	System.out.println("Do you want to add a rear spoiler? (Y/N): ");
	rearSpoilerInput = scanner.next().charAt(0);
	
	ConcreteCarDecorator carDecorator = new ConcreteCarDecorator(testCar);

	carDecorator.sportsMode(sportModeInput);
	carDecorator.floorLiners(floorLinerInput);
	carDecorator.carStarter(carStarterInput);
	carDecorator.sportWheels(sportsWheelsInput);
	carDecorator.rearSpoiler(rearSpoilerInput);

	
	if(carDecorator.getSportsMode() == true)
	    testCar.setCarPrice(testCar.getCarPrice() + 3800);

	if(carDecorator.getFloorLiners() == true)
	    testCar.setCarPrice(testCar.getCarPrice() + 185);

	if(carDecorator.getCarStarter() == true)
	    testCar.setCarPrice(testCar.getCarPrice() + 935);

	if(carDecorator.getSportsWheels() == true)
	    testCar.setCarPrice(testCar.getCarPrice() + 1670);

	if(carDecorator.getRearSpoiler() == true)
	    testCar.setCarPrice(testCar.getCarPrice() + 520);


	System.out.println("The final cost of the car is: " + testCar.getCarPrice());
			   

	
    }


}
