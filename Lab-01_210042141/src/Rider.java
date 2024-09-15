public class Rider extends User
{
    public PaymentMethod preferredPaymentMethod;

    public Rider(String id, String name, Location location, PaymentMethod paymentMethod)
    {
        super(id, name, location);
        this.preferredPaymentMethod = paymentMethod;
    }

    public Trip requestRide(Location pickup, Location dropOff, double distance, RideType rideType, NotificationService notification)
    {
        System.out.println(name + " has requested a " + rideType.getClass().getSimpleName() + " ride.");
        return new Trip(this, pickup, dropOff, distance, rideType, notification);
    }

    public void rateDriver(Driver driver, double rating)
    {
        driver.updateRating(rating);
        System.out.println(name + " rated driver " + driver.getName() + " with a " + rating);
    }

    public void makePayment(Trip trip)
    {
        double fare = trip.calculateFare();
        preferredPaymentMethod.processPayment(fare);
        System.out.println(name + " made payment of $" + fare + " using " + preferredPaymentMethod.getClass().getSimpleName());
    }

    @Override
    public void displayUserInfo()
    {
        System.out.println("Rider Name: " + name + ", Location: " + location.getAddress());
    }
}
