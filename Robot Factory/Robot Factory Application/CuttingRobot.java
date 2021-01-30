public class CuttingRobot extends Robot {


    CuttingRobot(String type, String manufacturer, long serialNumber){
	setType(type);
	setManufacturer(manufacturer);
	setSerialNumber(serialNumber);
	System.out.println(type + " Robot created" + "\n" +  manufacturer +
			   " " + serialNumber);
    }

     void fetchParts() {
	System.out.println("Raw materials fetched");
    }

     void doTask() {
	System.out.println("Raw material cut");
    }

     void storeParts() {
	System.out.println("Cut part sent to storage");
    }
}
