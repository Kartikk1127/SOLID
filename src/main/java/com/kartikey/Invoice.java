public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        return ((marker.price)* this.quantity);
    }

    public void printInvoice(){
        //print the invoice
    }

    public void saveToDB(){
        //save the data to db
    }
}
