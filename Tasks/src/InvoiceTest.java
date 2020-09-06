// task 3.12
// task 3.12
// task 3.12

public class InvoiceTest {
    public static void main(String[] args){
        Invoice invoice1 = new Invoice("0847","Mop", 2, 5);
        Invoice invoice2 = new Invoice("4756", "Slippers", -2, -4);

        System.out.printf("Info for invoice1: \nNumberPart  %s\nDescriptionPart  %s\nQuantity  %d\nPriceForOne  %.2f\n",invoice1.getNumberPart(),invoice1.getDescriptionPart(),invoice1.getQuantity(),invoice1.getPrice());
        System.out.printf("AllPrice for invoice1: %.2f\n\n", invoice1.Amount());


        System.out.printf("Info for invoice2: \nNumberPart  %s\nDescriptionPart  %s\nQuantity  %d\nPriceForOne  %.2f\n",invoice2.getNumberPart(),invoice2.getDescriptionPart(),invoice2.getQuantity(),invoice2.getPrice());
        System.out.printf("AllPrice for invoice2: %.2f\n\n", invoice2.Amount());
    }
}
