package SetaAnsMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class parkingLot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        Set<String> parking=new LinkedHashSet<>();
        while (!input.equals("END")){
            String [] cars= input.split(", ");
            String command= cars[0];
            String plate= cars[1];
            input= scanner.nextLine();
            switch (command){
                case "IN":
                    parking.add(plate);
                    break;
                case "OUT":
                    parking.remove(plate);
                    break;
            }
        }if (!parking.isEmpty()){

        for (String item:parking){
            System.out.println(item);
        }
        }else System.out.println("Parking Lot is Empty");
    }
}
