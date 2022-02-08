import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    private void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else if (0 < amount && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }
    }

    /**
     *addTransaction.
     */
    public void addTransaction(double amount, String operation) {
        if (operation == Transaction.DEPOSIT) {
            deposit(amount);
            Transaction nap = new Transaction(Transaction.DEPOSIT, amount, balance);
            transitionList.add(nap);
        } else if (operation == Transaction.WITHDRAW) {
            withdraw(amount);
            Transaction rut = new Transaction(Transaction.WITHDRAW, amount, balance);
            transitionList.add(rut);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     *printTransaction.
     */
    public void printTransaction() {
        int transitionListLength = transitionList.size();
        DecimalFormat t = new DecimalFormat("##.00");
        for (int i = 0; i < transitionListLength; i++) {

            if (transitionList.get(i).getOperation() == Transaction.DEPOSIT) {
                System.out.println("Giao dich " + (i + 1) + ": Nap tien $"
                        + t.format(transitionList.get(i).getAmount())
                        + ". So du luc nay: $"
                        + t.format(transitionList.get(i).getBalance()) + ".");
            }
            if (transitionList.get(i).getOperation() == Transaction.WITHDRAW) {
                System.out.println("Giao dich " + (i + 1) + ": Rut tien $"
                        + t.format(transitionList.get(i).getAmount())
                        + ". So du luc nay: $"
                        + t.format(transitionList.get(i).getBalance()) + ".");
            }
        }
    }
    /*
    public static void main(String[] args){
        Account acc = new Account();
        acc.addTransaction(2000.255,"deposit");
        acc.addTransaction(1000,"withdraw");
        acc.printTransaction();
    }
    */
}
