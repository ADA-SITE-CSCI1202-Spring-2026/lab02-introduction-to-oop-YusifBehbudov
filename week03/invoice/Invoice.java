public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double pricePerItem;

    public Invoice (String number, String description, int quantity, double pricePerItem){
        this.number = number;
        this.description = description;

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        if (pricePerItem == 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }

    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }     
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        }
        else {
            this.pricePerItem = 0.0;
        }
    }

    public String getPartNumber() {
        return number;
    }

    public String getPartDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

}
