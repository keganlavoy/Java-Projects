public abstract class Robot {

    private String type;
    private String manufacturer;
    private long serialNumber;


    public void setType(String type) {this.type = type;}
    public String getType() {return type;}

    
    public void setManufacturer(String manufacturer)
    {this.manufacturer = manufacturer;}
    public String getManufacturer() {return manufacturer;}

    
    public void setSerialNumber(long serialNumber)
    {this.serialNumber = serialNumber;}
    public long getSerialNumber() {return serialNumber;}

    abstract void fetchParts();
    abstract void doTask();
    abstract void storeParts();
}
