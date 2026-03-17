import java.util.ArrayList;

public class Basket {
    ArrayList<Item> basket = new ArrayList<Item>();

    public void addItem(Item i){
        basket.add(i);
    }

    private double total = 0;

    public double totalValue(){
        for (Item item : basket) {
            total += item.value();
        }
        return total;
    }

    public void print() {
        System.out.println("\nReceipt");
        System.out.println("--------------------------------------");

        for (Item item : basket) {
            System.out.println(item.toString());
            
        }

        System.out.println("--------------------------------------");
        System.out.printf("Total: %.2f\n", totalValue());
    }
}

