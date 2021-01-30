public class TankFactory{

    public Tank makeTank(String newTankType) {


	Tank newTank = null;

	if(newTankType.equals("Cunningham"))
	   return new CunninghamTank();


        else if(newTankType.equals("Locust"))
	   return new LocustTank();

        else if(newTankType.equals("Sherman"))
	   return new ShermanTank();

	else if(newTankType.equals("KingTiger"))
	    return new KingTigerTank();
	
        else if(newTankType.equals("Wolverine"))
	    return new WolverineTank();

	else
	    return null;

    }


}
