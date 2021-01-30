abstract class CarDecorator {

    private Car car;


    CarDecorator(Car carToDecorate) {
	car = carToDecorate;
    }


    public void sportsMode() {
	System.out.println("Sports Mode");
    }


    public void floorLiners() {
	System.out.println("floor liners");
    }


    public void carStarter() {
	System.out.println("car starter");
    }


    public void sportWheels() {
	System.out.println("sport wheels");
    }


    public void rearSpoiler() {
	System.out.println("rear spoiler");
    }


}
