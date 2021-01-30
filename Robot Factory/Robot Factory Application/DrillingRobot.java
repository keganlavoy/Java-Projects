public class DrillingRobot extends Robot {


    DrillingRobot(String type, String manufacturer, long serialNumber){
	setType(type);
	setManufacturer(manufacturer);
	setSerialNumber(serialNumber);
	System.out.println(type + " Robot created" + "\n" + manufacturer +
			   " " + serialNumber);
    }

     void fetchParts() {
	System.out.println("Cut part fetched");
    }

      void doTask() {
	System.out.println("Holes drilled");
    }

      void storeParts() {
	System.out.println("Drilled part sent to storage");
    }
}
