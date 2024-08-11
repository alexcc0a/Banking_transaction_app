import java.util.HashMap;
import java.util.Random;

public class Main {
    private static final Random random = new Random();
    public final static int bankAccountQuantity = 5000;
    public final static int numTransfers = 200;
    public static int accountsCreated = 0;
    public static int transfersTotally = 0;
    public static int successfulTransactions = 0;
    public static int blockedTransactions = 0;
    public static int notEnoughMoneyTransactions = 0;

    public static void main(String[] args) {

        HashMap<String, Account> bankAccounts1 = new HashMap<>();
        HashMap<String, Account> bankAccounts2 = new HashMap<>();
        HashMap<String, Account> bankAccounts3 = new HashMap<>();

        Bank bank1 = new Bank(bankAccounts1);
        Bank bank2 = new Bank(bankAccounts2);
        Bank bank3 = new Bank(bankAccounts3);

        bank1.start();
        bank2.start();
        bank3.start();

    }
}