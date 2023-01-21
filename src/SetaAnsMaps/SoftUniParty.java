package SetaAnsMaps;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<String> guests=new TreeSet<>();
        String invitedGuests= scanner.nextLine();
        while (!invitedGuests.equals("PARTY")){
            guests.add(invitedGuests);
            invitedGuests= scanner.nextLine();
        }
        String arrivedGuests= scanner.nextLine();
        while (!arrivedGuests.equals("END")){
            guests.remove(arrivedGuests);
            arrivedGuests= scanner.nextLine();
        }
        System.out.println(guests.size());
        for (String people:guests){
            System.out.println(people);
        }
    }
}
