public class Bicycle implements Bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("There is no engine");
    }

    @Override
    public void accelerate() {
        //increase the speed maybe
    }
}
