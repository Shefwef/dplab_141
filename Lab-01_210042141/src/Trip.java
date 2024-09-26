public class Trip
{
    public String id;
    public Rider rider;
    public Driver driver;
    public Location pickupLocation;
    public Location dropOffLocation;
    public RideType rideType;
    public TripStatus status;
    public double fare;
    public double distance;
    public NotificationService notification;

    public Trip(Rider rider, Location pickupLocation, Location dropOffLocation, double distance, RideType rideType, NotificationService notification)
    {
        this.rider = rider;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.distance = distance;
        this.rideType = rideType;
        this.status = TripStatus.PENDING;
        this.fare = calculateFare();
        this.notification = notification;
    }

    public void assignDriver(Driver driver)
    {
        this.driver = driver;
        this.status = TripStatus.CONFIRMED;

        System.out.println("Driver " + driver.getName() + " assigned to the trip.");
        notification.sendNotification(rider, "Your driver is on the way!");
    }

    public void start()
    {
        this.status = TripStatus.IN_PROGRESS;
        System.out.println("Trip has started.");
        notification.sendNotification(rider, "Your trip has started.");
    }

    public void complete()
    {
        this.status = TripStatus.COMPLETED;
        System.out.println("Trip completed.");
        notification.sendNotification(rider, "Your trip has completed.");
        rider.makePayment(this);
    }

    public double calculateFare() {
        return rideType.calculateFare(distance) * driver.getVehicleType().getFareMultiplier();
    }

    public TripStatus getStatus()
    {
        return status;
    }

    public String getId()
    {
        return id;
    }
}

