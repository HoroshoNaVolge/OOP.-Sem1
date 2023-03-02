package VendingMachine;

import java.util.ArrayList;

import Product.Product;

public class VendingMachine<T extends Product> {

    protected ArrayList<T> products;

    public ArrayList<T> getGoods() {
        return products;
    }

    public void setGoods(ArrayList<T> goods) {
        this.products = goods;
    }

    public ArrayList<T> getProducts(String search) {
        ArrayList<T> foundProducts = new ArrayList<>();
        for (T prod : products) {
            if (search.equals(prod.getName())) {
                foundProducts.add(prod);
            }
        }
        return foundProducts;
    }

}
