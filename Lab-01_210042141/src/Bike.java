public class Bike implements VehicleType
{
    @Override
    public String getType()
    {
        return "Bike";
    }

    @Override
    public double getFareMultiplier()
    {
        return 0.5;
    }
}
