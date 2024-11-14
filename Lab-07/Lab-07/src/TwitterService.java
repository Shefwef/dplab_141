import java.util.List;
import java.util.ArrayList;

public class TwitterService implements NotificationService
{
    public List<Notification> fetchNotifications()
    {
        return new ArrayList<>();
    }

    public void markAsRead(String id)
    {
        //Marking as read using Twitter's mechanism
    }

    public void markAsUnread(String id)
    {
        //Marking as unread read using Twitter's mechanism
    }

    public void deleteNotification(String id)
     {
        // Deleting Twitter's notification
    }
}
