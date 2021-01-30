public class A02lavoy20k {


    public static void main(String[] args) {


	RobotFactory newRobotFactory = new RobotFactory();

	Robot cutRobot1 = newRobotFactory.makeRobot("Cutting", "Regina Machines", 100200300401L);

        Robot cutRobot2 = newRobotFactory.makeRobot("Cutting", "Regina Machines", 100200300402L);

	Robot drillRobot1 = newRobotFactory.makeRobot("Drilling", "Regina Machines", 200200300401L);

	Robot drillRobot2 = newRobotFactory.makeRobot("Drilling", "Regina Machines", 200200300402L);

	Robot assemblyRobot = AssemblyRobot.getInstance();

	assemblyRobot.setType("Assembly");
	assemblyRobot.setManufacturer("SK Robotics");
	assemblyRobot.setSerialNumber(300200300401L);
	
	
	System.out.println(assemblyRobot.getType() + " Robot created" + "\n" + assemblyRobot.getManufacturer() +  " " + assemblyRobot.getSerialNumber());
	

	cutRobot1.fetchParts();
	cutRobot1.fetchParts();
	cutRobot1.doTask();
	cutRobot1.doTask();
	cutRobot1.storeParts();
	cutRobot1.storeParts();

	cutRobot2.fetchParts();
	cutRobot2.fetchParts();
	cutRobot2.doTask();
	cutRobot2.doTask();
	cutRobot2.storeParts();
	cutRobot2.storeParts();

	drillRobot1.fetchParts();
	drillRobot1.fetchParts();
	drillRobot1.doTask();
	drillRobot1.doTask();
	drillRobot1.storeParts();
	drillRobot1.storeParts();

	drillRobot2.fetchParts();
	drillRobot2.fetchParts();
	drillRobot2.doTask();
	drillRobot2.doTask();
	drillRobot2.storeParts();
	drillRobot2.storeParts();

	assemblyRobot.fetchParts();
	assemblyRobot.fetchParts();
	assemblyRobot.doTask();
	assemblyRobot.doTask();
	assemblyRobot.storeParts();
	assemblyRobot.storeParts();
	
    }
}
