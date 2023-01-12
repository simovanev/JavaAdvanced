import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        while (!address.equals("Home")) {
            if (address.equals("back")) {
                String currentURL="";
                if (history.size() <= 1) {
                    System.out.println("no previous URLs");
                } else currentURL=history.pop();

            } else {
                history.push(address);
                System.out.println(history.peek());
            }


            address = scanner.nextLine();
        }

    }
}
