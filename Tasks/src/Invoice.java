// task 3.12
// task 3.12
// task 3.12

public class Invoice {
    private String numberPart;
    private String descriptionPart;
    private int quantity;
    private double price;

    public Invoice(String numberPart, String descriptionPart, int quantity, double price){
        this.numberPart = numberPart;
        this.descriptionPart = descriptionPart;
        if(quantity>0) this.quantity = quantity;
        if(price>0.0) this.price = price;
    }

    public double Amount(){
        if(quantity>0 && price>0) return quantity*price;
        else return 0.00;
    }

    public String getNumberPart(){
        return numberPart;
    }
    public String getDescriptionPart(){
        return descriptionPart;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
}
