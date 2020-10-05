public class Vehicle{
    private String name;
    private int numberOfSeats;
    private int fare;

    // public Vehicle(String name, int numberOfSeats, int fare) {
    //     this.name = name;
    //     this.numberOfSeats = numberOfSeats;
    //     this.fare = fare;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
    
    
}