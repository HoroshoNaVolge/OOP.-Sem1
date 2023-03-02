import Product.Drink;
import Product.HotDrink;
import Product.Product;
import VendingMachine.HotDrinkVendingMachine;
import VendingMachine.VendingMachine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HotDrink> hotDrinks = new ArrayList<>();

        hotDrinks.add(new HotDrink("Capuccino", 250, 300, 90));
        hotDrinks.add(new HotDrink("Capuccino", 200, 200, 90));
        hotDrinks.add(new HotDrink("Espresso", 150, 70, 90));
        hotDrinks.add(new HotDrink("Tea", 120, 350, 80));

        HotDrinkVendingMachine hvm = new HotDrinkVendingMachine();
        hvm.setGoods(hotDrinks);

        System.out.println("Запрос Cappucino объёмом 300, температура 90.\nРезультат:");

        ArrayList<HotDrink> hdrss = hvm.getProducts("Capuccino", 300, 90);
        for (Product prod : hdrss) {
            System.out.println(prod.toString());
        }

    }
}