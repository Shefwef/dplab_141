public class Location
{
    public String address;
    public double latitude;
    public double longitude;

    public Location(String address, double latitude, double longitude)
    {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getAddress()
    {
        return address;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public String toString()
    {
        return "Location: " + address + " (Latitude: " + latitude + ", Longitude: " + longitude + ")";
    }
}


