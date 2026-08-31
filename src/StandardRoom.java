public class StandardRoom extends Room{

    private double discount;

    // set the room type and price, set the discount = 0
    public StandardRoom(double price){
        super("Standard", price);
    }

    // get type of the room
    public String getType(){
        return "Standard";
    }

    // set the value of the discount
    public void setDiscount(double discount){
        this.discount = discount;
    }

    // calculate the discounted price
    public double applyDiscount(){
        return getPrice()-(discount*getPrice());
    }

    // standard room info (class definition)
    @Override
    public String toString(){
        return super.toString() +
                "\n\t-Discount: " + discount + "\n\n";
    }



}
