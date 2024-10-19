public class SMSNotification implements INotify
{
    @Override
    public void sendNotification(String message)
    {
        System.out.println(message);
    }
    
}
