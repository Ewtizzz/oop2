package transport;

public class Transport {
    private String mark;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String mark, String model, int year, String country, String color, int maxSpeed) {
        if (mark != null || mark.isEmpty()){
            this.mark = "BMW";
        }else{
            this.mark = mark;
        }

        if (model != null || model.isEmpty()){
            this.model = "M4";
        }else{
            this.model = model;
        }

        this.year = year;
        this.country = country;

        if (color != null || color.isEmpty()){
            this.color = "белый";
        }else{
            this.color = color;
        }

        if (maxSpeed<=0){
            this.maxSpeed = 100;
        }else{
            this.maxSpeed = maxSpeed;
        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
