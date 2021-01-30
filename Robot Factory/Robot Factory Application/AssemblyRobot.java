public class AssemblyRobot extends Robot {

    static AssemblyRobot singletonRobot = new AssemblyRobot();

    private AssemblyRobot(){}
    
    public static AssemblyRobot getInstance() {
	return singletonRobot;
    }

     void fetchParts() {
	System.out.println("Drilled part fetched");
    }

     void doTask() {
	System.out.println("Product assembled");
    }

     void storeParts() {
	System.out.println("Product sent to storage");
    }
}
