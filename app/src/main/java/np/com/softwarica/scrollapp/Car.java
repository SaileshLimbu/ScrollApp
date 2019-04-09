package np.com.softwarica.scrollapp;

public class Car {
    private String make;
    private String color;
    private int year;
    private float price;
    private float size;

    public Car(String make, String color, int year, float price, float size) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.price = price;
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String createCar() {
        return "<b>Manufacturer</b>: <font color='blue'>" + make +
                " </font><b>Current Value</b>: <font color='blue'>" + price +
                " </font><b>Effective engine size</b>: <font color='blue'>" + size +
                " </font><b>Color</b>: <font color='blue'>" + color + "</font>";
    }
}
