public class DigitalWallet implements PaymentMethod
{
    @Override
    public void processPayment(double amount)
    {
        System.out.println("An amount of $" + amount + "is being processed through Digital Wallet");
    }
}
