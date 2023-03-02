package Product;

public class HotDrink extends Drink {

    private int temperature;

    public HotDrink(String name, double price, double volume, int temperature) {
        super(name, price, volume);

        this.temperature = temperature;

    }

    @Override
    public String toString() {
        String toString = name + " " + "Price: " + price + " Volume: " + volume + " Temperature: " + temperature;
        return toString;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
