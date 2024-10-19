public class EmailNotification implements INotify
{
    @Override
    public void sendNotification(String message)
    {
        System.out.println(message);
    }
}
