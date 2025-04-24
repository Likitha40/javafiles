class bankaccount {
    public int balance;
    public bankaccount(int balance) {
        this.balance = balance;
    }
    public int deposit(int amount) {
        balance = balance + amount;
        return balance;
    }
}
class savingsaccount extends bankaccount {
    public savingsaccount(int balance) {
        super(balance);
    }
    public void withdraw(int withdraw) {
        int fee = 100;
        int total = withdraw + fee;
        if (balance >= total) {
            balance = balance-total;
            System.out.println("Withdrawing the amount: " + total);
        } else {
            System.out.println("Enter valid amount.");
        }
    }
}
class checkingaccount extends bankaccount {
    checkingaccount(int balance) {
        super(balance);
    }
    public void withdraw(int withdraw) {
        int fee = 150;
        int total = withdraw + fee;
        if (balance >= total) {
            balance = balance-total;
            System.out.println("Withdrawing the amount: " + total);
        } else {
            System.out.println("Enter valid amount.");
        }
    }
}
public class Bank2 {
    public static void main(String[]args) {
        System.out.println("likitha lekhya");
        System.out.println("AV.SC.U4CSE24240");
        System.out.println("CSE-C");
        bankaccount ba = new bankaccount(450000);
        savingsaccount sa = new savingsaccount(450000);
        checkingaccount ca = new checkingaccount(450000);
        System.out.println("depositing the amount: " + ba.deposit(3000));
        sa.withdraw(3000);
        ca.withdraw(3000);
    }
}
