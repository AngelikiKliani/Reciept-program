public  class WeightItem extends Item {

    private double weight;

    public WeightItem(String description, double price, double weight){
        super(description, price);
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    @Override
    public double value(){
        return getPrice()*weight;
    }

    

    @Override
    public String toString(){
        return getDescription()+" ("+getPrice()+" x "+getWeight()+")         "+value()+"$";

    }



    
}
