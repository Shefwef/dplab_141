// Unified Notification Model
public class Notification
{
    private String id;
    private String content;
    private String platform;
    private String status;

    public Notification(String id, String content, String platform, String status)
    {
        this.id = id;
        this.content = content;
        this.platform = platform;
        this.status = status;
    }

    public String getId() { return id; }
    public String getContent() { return content; }
    public String getPlatform() { return platform; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}

