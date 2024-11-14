import java.util.ArrayList;
import java.util.List;

public class NotificationAggregatorFacade
{
    private List<NotificationService> platforms;

    public NotificationAggregatorFacade()
    {
        platforms = new ArrayList<>();
        platforms.add(new TwitterService());
        platforms.add(new FacebookService());
    }

    public List<Notification> getNotifications()
    {
        List<Notification> allNotifications = new ArrayList<>();
        for (NotificationService platform : platforms)
        {
            allNotifications.addAll(platform.fetchNotifications());
        }
        return allNotifications;
    }

    public void markAsRead(String id)
    {
        for (NotificationService platform : platforms)
        {
            platform.markAsRead(id);
        }
    }

    public void markAsUnread(String id)
    {
        for (NotificationService platform : platforms)
        {
            platform.markAsUnread(id);
        }
    }

    public void deleteNotification(String id)
    {
        for (NotificationService platform : platforms)
        {
            platform.deleteNotification(id);
        }
    }
}
