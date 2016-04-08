package PaymentApplicationDomain.Invoice;
//Will be used with the bigger project
/**
 * Created by Samkele on 4/2/2016.
 */
/*public class Invoice implements Payable {
    private String id;
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

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

    public double getPaymentAmount(){
        return getQuantity() * getPricePerItem();
    }

    private Invoice(){

    }

    private Invoice(Builder builder){
        this.id = builder.id;
        this.partNumber = builder.partNumber;
        this.partDescription = builder.partDescription;
        this.quantity = builder.quantity;
        this.pricePerItem = builder.pricePerItem;
    }

    public static class Builder {
        private String id;
        private String partNumber;
        private String partDescription;
        private int quantity;
        private double pricePerItem;

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder firstName(String value) {
            this.partNumber = value;
            return this;
        }

        public Builder lastName(String value) {
            this.partDescription = value;
            return this;
        }

        public Builder employeeNumber(int value) {
            this.quantity = value;
            return this;
        }

        public Builder pricePerItem(double value){
            this.pricePerItem = value;
            return this;
        }

        public Builder copy(Invoice value) {
            this.partNumber = value.partNumber;
            this.partDescription = value.partDescription;
            this.quantity = value.quantity;
            this.pricePerItem = value.pricePerItem;
            return this;
        }

        public Invoice build() {
            return new Invoice (this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Invoice invoice = (Invoice) o;

            if (!id.equals(invoice.id)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode(){
            return id.hashCode();
        }
    }

}*/
