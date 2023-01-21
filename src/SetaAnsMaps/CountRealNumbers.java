package SetaAnsMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] input= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer> doubleAppear=new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            doubleAppear.putIfAbsent(input[i],0 );
            doubleAppear.put(input[i],doubleAppear.get(input[i])+1 );
        }
        for (Double item:doubleAppear.keySet()){
            System.out.printf("%.1f -> %d%n",item,doubleAppear.get(item));
        }
    }
}
