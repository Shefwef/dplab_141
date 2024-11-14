import java.util.List;
import java.util.ArrayList;

public class FacebookService implements NotificationService
{
    public List<Notification> fetchNotifications()
    {
        return new ArrayList<>();
    }

    public void markAsRead(String id)
    {
        //Marking as read using Facebook's mechanism
    }

    public void markAsUnread(String id)
    {
        // Marking as unread using Facebook's mechanism
    }

    public void deleteNotification(String id)
    {
        // deleting notification
    }
}
