 public class BikeRide implements RideType
 {
     @Override
     public double calculateFare(double distance)
     {
         return distance * 0.2;
     };
 }
