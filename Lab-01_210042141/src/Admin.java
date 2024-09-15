public class Admin
{
    public String id;
    public String name;
    public String role;

    public Admin(String id, String name, String role)
    {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public void manageDriver(Driver driver, boolean isActive)
    {
        driver.setAvailable(isActive);
        System.out.println("Admin " + name + " has " + (isActive ? "activated" : "deactivated") + " driver " + driver.getName());
    }

    public void manageRider(Rider rider, boolean isActive)
    {
        System.out.println("Admin " + name + " has " + (isActive ? "activated" : "deactivated") + " rider " + rider.getName());
    }

    public void viewTripHistory(Trip[] trips)
    {
        System.out.println("Trip History:");
        for (Trip trip : trips)
        {
            System.out.println("Trip ID: " + trip.getId() + ", Status: " + trip.getStatus());
        }
    }


    public void handleDispute(Trip trip, String issueDescription)
    {
        System.out.println("Admin " + name + " is handling a dispute for Trip ID " + trip.getId() + ". Issue: " + issueDescription);
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getRole()
    {
        return role;
    }
}
