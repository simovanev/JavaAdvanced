package DefiningClasses.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCars = Integer.parseInt(scanner.nextLine());
        Map<String, List<Car>> carsByCargoType = new LinkedHashMap<>();
        for (int i = 0; i < nCars; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            //"{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType} {Tire1Pressure} {Tire1Age} {Tire2Pressure}
            // {Tire2Age} {Tire3Pressure} {Tire]’3Age} {Tire4Pressure} {Tire4Age}
            String model = input[0];
            Engine engine = new Engine(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            Cargo cargo = new Cargo(Integer.parseInt(input[3]), input[4]);
            List<Tires> tireList = new ArrayList<>();
            for (int j = 5; j <= 12; j += 2) {
                Tires tire = new Tires(Double.parseDouble(input[j]), Integer.parseInt(input[j + 1]));
                tireList.add(tire);
            }
            String cargoType = input[4];
            Car car = new Car(model, engine, cargo, tireList);
            carsByCargoType.putIfAbsent(cargoType, new ArrayList<>());
            carsByCargoType.get(cargoType).add(car);
        }

        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            carsByCargoType.get(command).forEach(Car::ifFragile);

        } else if (command.equals("flamable")) {
            carsByCargoType.get(command).forEach(Car::ifFlamable);

        }


    }
}


