public class InvoiceTest{

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("A101", "Hammer", 5, 12.5);
        Invoice invoice2 = new Invoice("B202", "Screwdriver", -3, 15.0);

        System.out.println("Invoice 1:");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: " + invoice1.getPricePerItem());
        System.out.println("Total Amount: " + invoice1.getInvoiceAmount());

        System.out.println("\nInvoice 2 (Invalid Quantity Example):");
        System.out.println("Part Number: " + invoice2.getPartNumber());
        System.out.println("Description: " + invoice2.getPartDescription());
        System.out.println("Quantity: " + invoice2.getQuantity()); 
        System.out.println("Price per Item: " + invoice2.getPricePerItem());
        System.out.println("Total Amount: " + invoice2.getInvoiceAmount());
    }
}