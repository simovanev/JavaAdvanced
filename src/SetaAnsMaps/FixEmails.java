package SetaAnsMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,String> userLog=new LinkedHashMap<>();
        String user= scanner.nextLine();
        while (!user.equals("stop")){
            String email= scanner.nextLine();
            if (email.endsWith("us")||email.endsWith("uk")||email.endsWith("com")){
                user= scanner.nextLine();
                continue;
            }
            userLog.put(user,email);

            user= scanner.nextLine();
        }
        userLog.entrySet().forEach(e-> System.out.println(e.getKey()+ " -> "+e.getValue()));
    }
}
