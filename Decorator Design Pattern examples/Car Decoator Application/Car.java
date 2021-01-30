public class Car {

    private String carName;
    private int carPrice;

    Car(String name, int price) {

	carName = name;
	carPrice = price;
    }


    public String getCarName() {
	return carName;

    }

    public void setCarName(String name) {
	carName = name;
    }

    public int getCarPrice() {
	return carPrice;
    }
    
    public void setCarPrice(int price) {
	carPrice = price;
    }
}
