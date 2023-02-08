package DefiningClasses.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Engines> enginesMap= new HashMap<>();
        List<Car> carList= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] engineInfo= scanner.nextLine().split("\\s+");
            //"{Model} {Power} {Displacement} {Efficiency}
            String engineModel=engineInfo[0];
            int power=Integer.parseInt(engineInfo[1]);
            Engines engine = new Engines(engineModel,power);
            if (engineInfo.length==4){
                String displacement=engineInfo[2];
                String efficiency=engineInfo[3];
                engine.setDisplacement(displacement);
                engine.setEfficiency(efficiency);
            } else if (engineInfo.length==3) {
                if (Character.isDigit(engineInfo[2].charAt(0))){
                    String displacement=engineInfo[2];
                    engine.setDisplacement(displacement);
                }else {
                    String efficiency=engineInfo[2];
                    engine.setEfficiency(efficiency);
                }
            }
            enginesMap.putIfAbsent(engineModel,engine);
        }
        int m= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] carInfo= scanner.nextLine().split("\\s+");
            //"{Model} {Engine} {Weight} {Color}
            String carMode=carInfo[0];
            String engineMode=carInfo[1];
            Car currentCar= new Car(carMode,enginesMap.get(engineMode));
            if (carInfo.length==4){
                String weight=carInfo[2];
                String color=carInfo[3];
                currentCar.setWeight(weight);
                currentCar.setColor(color);
            } else if (carInfo.length==3) {
                String undefined=carInfo[2];
                if (Character.isDigit(undefined.charAt(0))){
                    currentCar.setWeight(undefined);
                }else {
                    currentCar.setColor(undefined);
                }
            }
            carList.add(currentCar);


        }
        for (Car car: carList){
            System.out.println(car);
        }

    }
}
