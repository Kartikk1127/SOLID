import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Motorcycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle()); //this is where the code breaks since the child classes aren't able to substitute each other and hence not following liskov substitution principle
        for (Vehicle vehicle : vehicleList){
            System.out.println(vehicle.hasEngine().toString());
        }
    }
}
