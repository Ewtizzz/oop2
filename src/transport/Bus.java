package transport;

public class Bus extends Transport{

    public String tyreColor;
    public int wheelCount;
    public int luggageCapacity;

    public Bus(String mark, String model, int year, String country, String color, int maxSpeed,String tyreColor,int wheelCount, int luggageCapacity) {
        super(mark, model, year, country, color, maxSpeed);
        if (tyreColor == null || tyreColor.isEmpty()){
            this.tyreColor = "чёрный";
        }else{
            this.tyreColor = tyreColor;
        }

        if (wheelCount <= 0){
            this.wheelCount = 4;
        }else{
            this.wheelCount = wheelCount;
        }

        if (luggageCapacity <= 0){
            this.luggageCapacity = 20;
        }else{
            this.luggageCapacity = luggageCapacity;
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "tyreColor='" + tyreColor + '\'' +
                ", wheelCount=" + wheelCount +
                ", luggageCapacity=" + luggageCapacity +
                '}';
    }
}
