import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> bankAccount = new HashMap<>();

        String[] operations = {
                "DEPOSIT Alice 100",
                "DEPOSIT Bob 200",
                "WITHDRAW Alice 30",
                "BALANCE Alice",
                "WITHDRAW Bob 250",
                "BALANCE Bob",
                "DEPOSIT Charlie 50",
                "BALANCE Charlie"
        };

        banAccount(bankAccount, operations);
    }

    public static void banAccount(HashMap<String, Integer> bankAccount, String[] balance) {

        for (String something : balance) {
            String[] parts = something.split(" ");
            String command = parts[0];
            String name = parts[1];

            switch (command) {

                case "DEPOSIT":
                    int add = Integer.parseInt(parts[2]);
                    bankAccount.put(name, bankAccount.getOrDefault(name, 0) + add);
                    System.out.println(name + " balance: " + bankAccount.get(name));
                    break;

                case "WITHDRAW":
                    int sub = Integer.parseInt(parts[2]);

                    if (!bankAccount.containsKey(name)) {
                        System.out.println("Account does not exist");
                        break;
                    }

                    int currentBalance = bankAccount.get(name);
                    int value = currentBalance - sub;

                    if (value > 0) {
                        bankAccount.put(name, value);
                        System.out.println(name + " balance: " + value);
                    } else {
                        bankAccount.remove(name);
                        System.out.println("Account has been removed due to overdraft");
                    }
                    break;

                case "BALANCE":
                    if (bankAccount.containsKey(name)) {
                        System.out.println(name + " balance: " + bankAccount.get(name));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
