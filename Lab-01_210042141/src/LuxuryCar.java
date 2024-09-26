public class LuxuryCar implements VehicleType
{
    @Override
    public String getType()
    {
        return "Luxury Car";
    }

    @Override
    public double getFareMultiplier()
    {
        return 2.0;
    }
}