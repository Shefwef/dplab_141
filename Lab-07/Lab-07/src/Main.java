import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        NotificationAggregatorFacade aggregator = new NotificationAggregatorFacade();

        List<Notification> notifications = aggregator.getNotifications();
        for (Notification notification : notifications)
        {
            System.out.println(notification.getContent() + " from " + notification.getPlatform());
        }


        aggregator.markAsRead("some-id");
    }
}