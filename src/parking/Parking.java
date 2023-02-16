package parking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Parking {
    //•	type: String
    //•	capacity: int
    private String type;
    private int capacity;
    private List<Car> data;

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car volvo) {
        if (capacity > data.size()) {
            data.add(volvo);
        }
    }

    public boolean remove(String volvo, String xc90) {
        return this.data.removeIf(e -> e.getManufacturer().equals(volvo) && e.getModel().equals(xc90));
    }

    public Car getLatestCar() {
        if (data.isEmpty()) {
            return null;
        }
        return data.stream()
                .sorted(Comparator.comparingInt(Car::getYear).reversed())
                .collect(Collectors.toList())
                .get(0);

    }

    public Car getCar(String audi, String s4) {
        for (Car car:data){
            if (car.getManufacturer().equals(audi) && car.getModel().equals(s4)){
                return car;
            }
        }
        return null;
        // data.stream()

        //        .filter(e -> e.getManufacturer().equals(audi) && e.getModel().equals(s4))
         //       .collect(Collectors.toList())
        //        .get(0);

    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        String currentCars = data.stream().map(e -> e.toString()).collect(Collectors.joining("\n"));

        return String.format("The cars are parked in %s:%n%s", this.type, currentCars);
    }
}
