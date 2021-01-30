public class Flight {

    private String departureCity;
    private String arrivalCity;
    private String departureTime;
    private int price;

    Flight(String departure, String arrival, String time, int flightPrice) {

	departureCity = departure;
	arrivalCity = arrival;
	departureTime = time;
	price = flightPrice;
    }
	

    public void setDepartureCity(String city) {
	departureCity = city;
    }

    public void setArrivalCity(String city) {
	arrivalCity = city;
    }

    public void setDepartureTime(String time) {
	departureTime = time;
    }

    public void setPrice(int flightPrice) {
	price = flightPrice;
    }

    public String getDepartureCity() {
	return departureCity;
    }

    public String getArrivalCity() {
	return arrivalCity;
    }

    public String getDepartureTime() {
	return departureTime;
    }

    public int getPrice() {
	return price;
    }

}
