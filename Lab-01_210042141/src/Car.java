public class Car implements VehicleType
{
    @Override
    public String getType()
    {
        return "Car";
    }

    @Override
    public double getFareMultiplier()
    {
        return 1.0;
    }
}
