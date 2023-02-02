package DefiningClasses.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCars = Integer.parseInt(scanner.nextLine());
        Map<String , List< Car>> typeMap= new HashMap<>();
        for (int icar = 0; icar < nCars; icar++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String type = input[4];
            double pressure1 = Double.parseDouble(input[5]);
            int age1 = Integer.parseInt(input[6]);
            double pressure2 = Double.parseDouble(input[7]);
            int age2 = Integer.parseInt(input[8]);
            double pressure3 = Double.parseDouble(input[9]);
            int age3 = Integer.parseInt(input[10]);
            double pressure4 = Double.parseDouble(input[11]);
            int age4 = Integer.parseInt(input[12]);
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, type);
            Tires tires = new Tires(pressure1, age1, pressure2, age2, pressure3, age3, pressure4, age4);

            Car car = new Car(model, engine, cargo, tires);

            typeMap.putIfAbsent(type, new ArrayList<>());
            typeMap.get(type).add(car);
        }

            String command= scanner.nextLine();

           typeMap.get(command).forEach(e->e.extract(command));



                

        }
    }

