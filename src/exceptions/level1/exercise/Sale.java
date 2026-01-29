package exceptions.level1.exercise;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private double totalPrice;

    public Sale(ArrayList<Product> products) {
        this.products = products;
    }

    public double calculateTotalPrice() {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }

        totalPrice = 0.0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }

        return totalPrice;
    }
}
