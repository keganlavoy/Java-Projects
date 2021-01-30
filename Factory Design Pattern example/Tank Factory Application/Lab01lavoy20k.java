
public class Lab01lavoy20k{


    public static void main(String[] args)
    {
    TankFactory newTankFactory = new TankFactory();

    Tank tank1 = null;
    Tank tank2 = null;
    Tank tank3 = null;
    Tank tank4 = null;
    Tank tank5 = null;
    

    tank1  = newTankFactory.makeTank("Cunningham");
    tank2  = newTankFactory.makeTank("Locust");
    tank3  = newTankFactory.makeTank("KingTiger");
    tank4  = newTankFactory.makeTank("Sherman");
    tank5  = newTankFactory.makeTank("Wolverine");


    while(tank1.getDestroyed() == false)
	tank1.receiveHit(10, (tank1.getArmor() + 10));
    
    while(tank2.getDestroyed() == false)
	tank2.receiveHit(1, (tank2.getArmor() + 1));

    while(tank3.getDestroyed() == false)
	tank3.receiveHit(1, (tank3.getArmor() + 1));

    while(tank4.getDestroyed() == false)
	tank4.receiveHit(1, (tank4.getArmor() + 1));

    while(tank5.getDestroyed() == false)
	tank5.receiveHit(1, (tank5.getArmor() + 1));
    }
}
