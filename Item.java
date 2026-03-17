public class Item {
   
    private String description;
    private double price;

    public Item(String description, double price){
        this.description = description;
        this.price = price;
    }

    public double value(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    String s = String.format("%-70s %6.2f$\n", description, value());
    public String toString(){
        return getDescription()+"         "+value()+"$";
        

    }

}
