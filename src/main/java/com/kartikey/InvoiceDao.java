public class InvoiceDao {
    //let's add one more method to save into the file
    //doing this are we following open closed principle?
    //it says open for extension but closed for modification
    //jo class maybe already live ho use kyu modify krna hai? Extend krlo agr extra capapbility deni ho to
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDb(){
        //logic to save to the db
    }

    public void saveToFile(String filename){
        //logic to save the invoice to the file
    }
}
