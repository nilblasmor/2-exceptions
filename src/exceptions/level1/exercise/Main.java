package exceptions.level1.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Llista que provoca EmptySaleException
        ArrayList<Product> emptyProducts = new ArrayList<>();
        Sale emptySale = new Sale (emptyProducts);

        double priceTotal = emptySale.calculateTotalPrice();
        System.out.println("El preu total és " + priceTotal);

        //Llista que no provoca EmptySaleException
        ArrayList<Product> nonEmptyProducts = new ArrayList<>(List.of(
                new Product("Chocolate bar", 2.99),
                new Product("Chair", 4.75)
        ));
        Sale nonEmptySale = new Sale (nonEmptyProducts);

        double priceTotal2 = nonEmptySale.calculateTotalPrice();
        System.out.println("El preu total és " + priceTotal2);

        //Codi que provoca IndexOutOfBoundsException
        try {
            System.out.println(nonEmptyProducts.get(2));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("No hi ha cap producte en aquesta posició de la llista");
        }

        //Codi que no provoca IndexOutOfBoundsException
        try {
            System.out.println(nonEmptyProducts.get(0));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("No hi ha cap producte en aquesta posició de la llista");
        }
    }
}
