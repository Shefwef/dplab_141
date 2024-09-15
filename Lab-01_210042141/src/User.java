public abstract class User
{
    protected String id;
    protected String name;
    protected Location location;
    protected double rating;

    public User(String id, String name, Location location)
    {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = 5.0;  // Initially (By default)
    }

    public String getName()
    {
        return name;
    }

    public Location getLocation()
    {
        return location;
    }

    public void updateRating(double newRating)
    {
        this.rating = (this.rating + newRating) / 2;
    }

    public abstract void displayUserInfo();
}

