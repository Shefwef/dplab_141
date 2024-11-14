import java.util.List;

public interface NotificationService
{
    List<Notification> fetchNotifications();
    void markAsRead(String id);
    void markAsUnread(String id);
    void deleteNotification(String id);
}
