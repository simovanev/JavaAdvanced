package SetaAnsMaps;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Map<String, List<String>>> geography =new LinkedHashMap<>();
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input=scanner.nextLine().split(" ");
            String continent=input[0];
            String country=input[1];
            String city=input[2];
            geography.putIfAbsent(continent, new LinkedHashMap<>());
            geography.get(continent).putIfAbsent(country,new ArrayList<>());
            geography.get(continent).get(country).add(city);

        }for (String continent:geography.keySet()){
            System.out.println(continent+":");
            for (String country: geography.get(continent).keySet()){
                System.out.print("  "+country+ " -> ");
                System.out.println(String.join(", ",geography.get(continent).get(country)));

            }

        }


    }
}
