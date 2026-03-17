
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type;
        Basket cart = new Basket();

        while (true) {
            System.out.print("Type: ");
            type = scanner.next().trim().toUpperCase();

            if (type.equals("T")) {
                cart.print();
                return; 
            }

            try {
                if (type.equals("U")) { 
                    System.out.print("Description: ");
                    String description = scanner.next();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();

                    cart.addItem(new UtilItem(description, price));
                } 
                else if (type.equals("W")) { 
                    System.out.print("Description: ");
                    String description = scanner.next();
                    System.out.print("Weight: ");
                    double weight = scanner.nextDouble();
                    System.out.print("Price per kilo: ");
                    double pricePerKilo = scanner.nextDouble();

                    cart.addItem(new WeightItem(description, weight, pricePerKilo));
                } 
                else if (type.equals("C")) { 
                    System.out.print("Description: ");
                    String description = scanner.next();
                    System.out.print("Value: ");
                    double value = scanner.nextDouble();

                    cart.addItem(new Coupon(description, value));
                } 
                else {
                    System.out.println("Wrong type. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input. Please try again.");
                scanner.nextLine(); 
            }
        }
    }

    
}
