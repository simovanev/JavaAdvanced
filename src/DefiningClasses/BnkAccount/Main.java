package DefiningClasses.BnkAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public final static String END_COMMAND = "End";
    public final static String CREATE = "Create";
    public final static String DEPOSIT = "Deposit";
    public final static String SET_INTEREST = "SetInterest";
    public final static String GET_INTEREST = "GetInterest";
    public static Map<Integer, BankAccount> accounts;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        accounts = new HashMap<>();
        while (!input.equals(END_COMMAND)) {

            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            String result = null;
            switch (command) {
                case CREATE:
                    result = createAccount();
                    break;
                case DEPOSIT:
                    result = depositInAccount(commandParts);
                    break;
                case SET_INTEREST:
                    result = setInterest(commandParts);
                    break;
                case GET_INTEREST:
                    result = getInterest(commandParts);
                    break;
            }
            if (!result.isEmpty()) {
                System.out.println(result);

            }


            input = scanner.nextLine();
        }
    }

    private static String getInterest(String[] commandParts) {
        int id = Integer.parseInt(commandParts[1]);
        int years = Integer.parseInt(commandParts[2]);
        BankAccount bankAccount = accounts.get(id);
        if (bankAccount == null) {
            return "Account does not exist";
        }
        double interest = bankAccount.getInterest(years);
        return String.format("%.2f", interest);
    }

    private static String setInterest(String[] commandParts) {
        double interest = Double.parseDouble(commandParts[1]);
        BankAccount.setInterestRate(interest);
        return "";
    }

    private static String depositInAccount(String[] commandParts) {
        int accountId = Integer.parseInt(commandParts[1]);
        int amount = Integer.parseInt(commandParts[2]);

        BankAccount bankAccount = accounts.get(accountId);
        if (bankAccount == null) {
            return "Account does not exist";
        }
        bankAccount.deposit(amount);
        return String.format("Deposited %d to ID%d", amount, accountId);


    }

    private static String createAccount() {
        BankAccount bankAccount = new BankAccount();
        int id = bankAccount.getId();

        accounts.put(id, bankAccount);
        return String.format("Account ID%d created", id);
    }
}
