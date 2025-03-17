import java.util.ArrayList;
import java.util.List;

public class BankAccount
{
    private double balance;
    private List<String> transactionHistory = new ArrayList<>();

    public void deposit(double amount)
    {
        balance += amount;
        transactionHistory.add("Deposited amount: " + amount);
    }

    public void withdraw(double amount)
    {
        if(balance >= amount)
        {
            balance -= amount;
            transactionHistory.add("Withdrew amount: " + amount);
        }
        else
        {
            transactionHistory.add("Not enough balance in the account!");
        }
    }

    private double getBalance()
    {
        return balance;
    }

    private List<String> getTransactionHistory()
    {
        return transactionHistory;
    }
}
