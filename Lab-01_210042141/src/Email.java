public class Email implements NotificationService
{
    @Override
    public void sendNotification(User user, String message)
    {
        System.out.println("Sending Email to " + user.getName() + ": " + message);
    }
}
