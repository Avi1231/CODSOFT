import java.util.Scanner;
import java.util.HashMap;
public class ATM {
    public static void main(String[] args) {
        ATM_Operations obj = new ATM_Operations();
    }
}

class BankAccount {
    float balance;
}
class ATM_Operations {
    Scanner sc = new Scanner(System.in);

    ATM_Operations() {
        System.out.println("==============================================================================");
        System.out.println("Welcome To Our ATM");
        System.out.println("==============================================================================");
        operations();
    }
    HashMap<Integer, BankAccount> map = new HashMap<>();
    public void menu(BankAccount obj) {

        System.out.println("Please choose valid number.");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Another Account");
        System.out.println("5. Exit");
        System.out.println("==============================================================================");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                checkBalance(obj);
                break;
            case 2:
                depositMoney(obj);
                break;
            case 3:
                withdrawMoney(obj);
                break;
            case 4:
                operations();
                break;
            case 5:
                exit();
                break;
            default:
                System.out.println("Please choose valid number !");
                break;
        }
    }

    public void checkBalance(BankAccount obj) {
        System.out.println("==============================================================================");
        System.out.println("Your Available Balance is "+ obj.balance);
        System.out.println("==============================================================================");
        menu(obj);
    }

    public void depositMoney(BankAccount obj) {
        System.out.println("==============================================================================");
        System.out.println("Please enter the amount you want to deposit.");
        float amount = sc.nextFloat();
        obj.balance += amount;
        System.out.println(amount+" deposited successfully !");
        System.out.println("==============================================================================");
        checkBalance(obj);
        System.out.println("==============================================================================");
        menu(obj);
    }

    public void withdrawMoney(BankAccount obj) {
        System.out.println("==============================================================================");
        System.out.println("Please enter the amount you want to withdraw.");
        float amount = sc.nextFloat();
        if (obj.balance >= amount) {
            obj.balance -= amount;
            System.out.println(amount+" withdrawal successfully !");
            System.out.println("==============================================================================");
            checkBalance(obj);
            System.out.println("==============================================================================");
        } else {
            System.out.println("==============================================================================");
            System.out.println("Insufficient Fund to withdraw !");
            System.out.println("==============================================================================");
        }
        menu(obj);
    }

    public void operations() {
        System.out.println("Please enter your pin code.");
        int pin = sc.nextInt();
        if (map.containsKey(pin)) {
            BankAccount obj = map.get(pin);
            System.out.println("==============================================================================");
            menu(obj);
        } else {
            System.out.println("Please create account first");
            System.out.println("Set your pin code");
            int pin1 = sc.nextInt();
            BankAccount obj = new BankAccount();
            map.put(pin1, obj);
            System.out.println("==============================================================================");
            menu(obj);
        }
    }

    public void exit() {
        System.out.println("Thank you !!");
    }
}
