import java.util.Map;
import java.util.HashMap;

public class BankApp
{
    private Map<Integer, BankAccount> accounts = new HashMap<>();

    public void executeCommand(Command command)
    {
        command.execute();
    }

    public BankAccount getAccount(int accountId)
    {
        return accounts.get(accountId);
    }

    public Map<Integer, BankAccount> getAccounts()
    {
        return accounts;
    }
}
