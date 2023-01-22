package SetaAnsMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String info= scanner.nextLine();
        Map<String,String> phoneBook=new HashMap<>();
        while (!info.equals("search")){
            String[] peoplePhone= info.split("-");
            String person= peoplePhone[0];
            String phoneNumber= peoplePhone[1];

            phoneBook.put(person,phoneNumber);

            info= scanner.nextLine();
        }
        String searchName= scanner.nextLine();
        while (!searchName.equals("stop")){
            if (phoneBook.containsKey(searchName)){
                System.out.println(searchName+" -> "+phoneBook.get(searchName));
            }else System.out.printf("Contact %s does not exist.%n",searchName);
            searchName= scanner.nextLine();
        }
    }
}
