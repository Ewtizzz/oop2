package transport;

public class Car extends Transport{

    public Car(String mark, String model, int year, String country, String color, int maxSpeed) {
        super(mark, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{}";
    }
}
