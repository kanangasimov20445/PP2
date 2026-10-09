package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("12", "Jumper wires", 5, 7.99);
        print("inv1 (valid)", inv1);

        Invoice inv2 = new Invoice("56", "Microcontroller", -3, -29.90);
        print("inv2 (invalid values)", inv2);

        inv1.setQuantity(10);
        inv1.setPricePerItem(12.5);
        inv1.setPartDescription("Resistor");
        print("inv1 after valid setters", inv1);

        inv1.setQuantity(0);
        inv1.setPricePerItem(-5);
        print("inv1 after invalid setters", inv1);
    }
    private static void print(String label, Invoice inv) {
        System.out.println(label + " :");
        System.out.println("Part number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.printf("Price per item: %.2f%n", inv.getPricePerItem());
        System.out.printf("Invoice amount: %.2f%n%n", inv.getInvoiceAmount());
    }
}