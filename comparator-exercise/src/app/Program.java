package app;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();

        product.add(new Product("caneta", 2.00));
        product.add(new Product("caderno", 6.00));
        product.add(new Product("papel", 10.00));

        Comparator<Product> comp = (p1,p2)-> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        product.sort(comp);

        for (Product p : product) {
            System.out.println(product);
        }
    }
}
