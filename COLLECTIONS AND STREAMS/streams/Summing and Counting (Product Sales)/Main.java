import java.util.*;
/*
 * 
 * You have a list of Product objects, each with a name, price, 
 * and quantitySold. Calculate the 
 * total revenue from all products that have sold more than 100 units.
 */

class Product {
    String name;
    double price;
    int quantitySold;

    public Product(String name, double price, int quantitySold) {
        this.name = name;
        this.price = price;
        this.quantitySold = quantitySold;
    }

    public double getRevenue() {
        return price * quantitySold;
    }

    public int getQuantitySold() {
        return quantitySold;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1000, 150),
            new Product("Phone", 500, 80),
            new Product("Tablet", 300, 120),
            new Product("Smartwatch", 200, 95)
        );

        double totalRevenue = products.stream()
            .filter(p -> p.getQuantitySold() > 100) // Filter products with sales > 100
            .mapToDouble(Product::getRevenue) // Calculate revenue for each product
            .sum();

        System.out.println("Total Revenue: $" + totalRevenue); // Output: Total Revenue: $225000.0
    }
}
