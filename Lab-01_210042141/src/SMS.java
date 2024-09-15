public class SMS implements NotificationService
{
    @Override
    public void sendNotification(User user, String message)
    {
        System.out.println("Sending SMS to " + user.getName() + ": " + message);
    }
}
