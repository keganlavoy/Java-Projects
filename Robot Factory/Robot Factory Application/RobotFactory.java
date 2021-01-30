public class RobotFactory{

    public Robot makeRobot(String newRobotType, String newManufacturer, long newSerialNumber) {



	Robot newRobot = null;

	if(newRobotType.equals("Cutting"))
	    return new CuttingRobot(newRobotType, newManufacturer, newSerialNumber);

	else if(newRobotType.equals("Drilling"))
	    return new DrillingRobot(newRobotType, newManufacturer, newSerialNumber);

	else if(newRobotType.equals("Assembly"))
            return AssemblyRobot.getInstance();
	else
	    return null;
}
}
