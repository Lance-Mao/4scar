package entity;

/**
 * Created by pc on 17-5-23.
 */
public class Car extends Admin {

    private int id;
    private String models;
    private String price;
    private String size;
    private String fuel_consumption;
    private int number;

    public Car() {
    }

    public Car(String models, String price, String size, String fuel_consumption, int number) {
        this.models = models;
        this.price = price;
        this.size = size;
        this.fuel_consumption = fuel_consumption;
        this.number = number;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", models='" + models + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                ", fuel_consumption='" + fuel_consumption + '\'' +
                ", number=" + number +
                '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFuel_consumption() {
        return fuel_consumption;
    }

    public void setFuel_consumption(String fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
