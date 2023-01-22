package SetaAnsMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int entryNumber= Integer.parseInt(scanner.nextLine());
        Set<String> entrySet=new LinkedHashSet<>();
        for (int i = 0; i < entryNumber; i++) {
            String entry= scanner.nextLine();
            entrySet.add(entry);
        }
        for (String item: entrySet){
            System.out.println(item);
        }
    }
}
