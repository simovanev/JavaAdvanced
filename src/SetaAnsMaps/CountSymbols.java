package SetaAnsMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        char[] symbols=input.toCharArray();
        Map<Character,Integer> data= new TreeMap<>();
        for (int i = 0; i < symbols.length; i++) {

        data.putIfAbsent(symbols[i],0);
        data.put(symbols[i],data.get(symbols[i])+1);
        }
        data.entrySet().forEach(e-> System.out.printf("%s: %d time/s%n",e.getKey(),e.getValue()));
    }
}
