public class Carpool implements RideType
{
    @Override
    public double calculateFare(double distance)
    {
        return distance * 0.1;
    };
}
