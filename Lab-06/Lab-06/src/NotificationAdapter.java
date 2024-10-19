public class NotificationAdapter implements INotify
{
    AddressService as;
    EPostalMail epm;

    public NotificationAdapter(AddressService as, EPostalMail epm)
    {
        this.as = as;
        this.epm = epm;
    }

    @Override
    public void sendNotification(String name, String id)
    {
        String address = as.getAddress();
        epm.sendPostalMailNotification(name, id, address);
    }
}
