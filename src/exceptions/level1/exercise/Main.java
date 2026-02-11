package exceptions.level1.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List which generates EmptySaleException
        Sale emptySale = new Sale();

        try {
            double priceTotal = emptySale.calculateTotalPrice();
            System.out.println("Total price is " + priceTotal);
        }
        catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        //List which does not generate EmptySaleException
        Sale nonEmptySale = new Sale();
        nonEmptySale.addProduct(new Product("Chocolate bar", 2.99));
        nonEmptySale.addProduct(new Product("Chair", 4.75));

        try {
            double priceTotal2 = nonEmptySale.calculateTotalPrice();
            System.out.println("Total price is " + priceTotal2);
        }
        catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        //Code which generates IndexOutOfBoundsException
        try {
            System.out.println(nonEmptyProducts.get(2));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("No product found in list position");
        }

        //Code which does not generate IndexOutOfBoundsException
        try {
            System.out.println(nonEmptyProducts.get(0));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("No product found in list position");
        }
    }
}
