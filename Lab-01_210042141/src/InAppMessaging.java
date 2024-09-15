public class InAppMessaging implements NotificationService
{
    @Override
    public void sendNotification(User user, String message)
    {
        System.out.println("Sending In_App message to " + user.getName() + ": " + message);
    }
}
