import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
            String currentURL = "";
        while (!address.equals("Home")) {
            if (address.equals("back")) {
                if (history.size() <= 1) {
                    System.out.println("no previous URLs");
                    address = scanner.nextLine();
                    continue;
                } else{
                    currentURL = history.pop();
                    System.out.println(currentURL);
                }


            } else {
                if (!currentURL.equals("")){
                history.push(currentURL);

                }
                currentURL=address;
            System.out.println(currentURL);
            }



            address = scanner.nextLine();
        }

    }
}
