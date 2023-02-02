package DefiningClasses.CarSalesman;

import FunctionalPrograming.FindTheSmallestElement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
         int n= Integer.parseInt(scanner.nextLine());
         List<Engine5> engineList=new ArrayList<>();
        Set<Car> carSet= new LinkedHashSet<>();
        for (int engine = 0; engine < n; engine++) {
            String[] engineCharacter= scanner.nextLine().split("\\s+");
            //"{Model} {Power} {Displacement} {Efficiency}
            String model=engineCharacter[0];
            int power= Integer.parseInt(engineCharacter[1]);
            int displacement= Integer.parseInt(engineCharacter[2]);
            Engine5 currentEngine= new Engine5(model,power,displacement);
            if (engineCharacter.length==4){
                String efficiency= engineCharacter[3];
                currentEngine.setEfficiency(efficiency);
            }
            engineList.add(currentEngine);

        }
        int m= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] carCharacter= scanner.nextLine().split("\\s+");
            //"{Model} {Engine} {Weight} {Color}
            String carModel=carCharacter[0];
            String engineModel= carCharacter[1];
            Engine5 engine=null;
            for (Engine5 engin: engineList){
                if (engin.getModel().equals(engineModel)){

                engine=engin;
                }
            }

            Car currentCar= new Car(carModel,engine);
            if (carCharacter.length==4){
                String weight=carCharacter[2];
                String colour=carCharacter[3];

            } else if (carCharacter.length == 3) {
                String optional=carCharacter[2];
                if (Character.isDigit(optional.charAt(0))){
                    currentCar.setWeight(optional);
                }else currentCar.setColour(optional);
            }
            carSet.add(currentCar);

        }
        for (Car car: carSet){
            System.out.println(car.toString());
        }

    }
}
