public class ConcreteCarDecorator extends CarDecorator {


    private boolean addSportsMode;
    private boolean addFloorLiners;
    private boolean addCarStarter;
    private boolean addSportsWheels;
    private boolean addRearSpoiler;


    ConcreteCarDecorator(Car carToDecorate) {
	super(carToDecorate);
    }


    public void sportsMode(char x) {
	if(x == 'N' || x == 'n')
	    addSportsMode = false;
	else
	    addSportsMode = true;
    }


    public void floorLiners(char x) {
	if(x == 'N' || x == 'n')
	    addFloorLiners = false;
	else
	    addFloorLiners = true;
    }


    public void carStarter(char x) {
	if(x == 'N' || x == 'n')
	    addCarStarter = false;
	else
	    addCarStarter = true;
    }


    public void sportWheels(char x) {
	if(x == 'N' || x == 'n')
	    addSportsWheels = false;
	else
	    addSportsWheels = true;
    }


    public void rearSpoiler(char x) {
	if(x == 'N' || x == 'n')
	    addRearSpoiler = false;
	else
	    addRearSpoiler = true;
    }


    public boolean getSportsMode() {
	return addSportsMode;
    }

    public boolean getFloorLiners() {
	return addFloorLiners;
    }

    public boolean getCarStarter() {
	return addCarStarter;
    }

    public boolean getSportsWheels() {
	return addSportsWheels;
    }

    public boolean getRearSpoiler() {
	return addRearSpoiler;
    }

    
}
