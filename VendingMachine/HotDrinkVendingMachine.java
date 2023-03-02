package VendingMachine;

import Product.HotDrink;
import Product.Product;

import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine<HotDrink> {

    public ArrayList<HotDrink> getProducts(String name, double volume, double temperature) {
        ArrayList<HotDrink> foundDrinks = new ArrayList<>();
        for (Product prod : products) {
            if (prod instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) prod;
                if (name.equals(hotDrink.getName()) && volume == hotDrink.getVolume()
                        && temperature == hotDrink.getTemperature()) {
                    foundDrinks.add(hotDrink);
                }

            }
        }
        return foundDrinks;
    }
}
