public class Driver extends User
{
    public VehicleType vehicleType;
    public boolean available;

    public Driver(String id, String name, VehicleType vehicleType, Location location, boolean available)
    {
        super(id, name, location);
        this.vehicleType = vehicleType;
        this.available = available;
    }

    public void acceptRide(Trip trip)
    {
        System.out.println(name + " accepted the ride.");
        trip.assignDriver(this);
    }

    public void startTrip(Trip trip)
    {
        System.out.println(name + " started the trip.");
        trip.start();
    }

    public void completeTrip(Trip trip)
    {
        System.out.println(name + " completed the trip.");
        trip.complete();
    }

    public void rateRider(Rider rider, double rating)
    {
        rider.updateRating(rating);
        System.out.println(name + " rated rider " + rider.getName() + " with a " + rating);
    }

    public void updateLocation(Location location)
    {
        this.location = location;
        System.out.println(name + " updated location to " + location.getAddress());
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public void displayUserInfo()
    {
        System.out.println("Driver Name: " + name + ", Vehicle: " + vehicleType + ", Location: " + location.getAddress());
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
    }

    public boolean isAvailable()
    {
        return available;
    }
}

