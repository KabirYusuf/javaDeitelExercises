package Chapter10.Question10_16;

public class Invoice implements Payable{

    private final String partNumber;
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {

        if(quantity < 0){
            throw new IllegalArgumentException("Quantity must be >=0");
        }
        if(pricePerItem < 0.0){
            throw new IllegalArgumentException("Price per item must be >= 0");
        }
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    @Override
    public String toString(){
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f","Invoice","Part Number", getPartNumber(),
                getPartDescription(),"Quantity",getQuantity(),"Price Per Item", getPricePerItem());
    }

    @Override
    public double getPaymentAmount(){
        return getQuantity() * getPricePerItem();
    }
}
