public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        //not my job then why should i implement this method?
    }

    @Override
    public void serveCustomers() {
        //that's my job and here is my implementation
        System.out.println("Serving customers");
    }

    @Override
    public void cookFood() {
        //not my job then why should i implement this method?
    }
}
