public class HolidayCabinRental extends CabinRental
{
    private double holidayRentalRate;
    public HolidayCabinRental(int num)
    {
         super(num);
         if (num == 1 || num == 2 || num == 3)
         {
             holidayRentalRate = 950.00 + 150.00;
         } 
         else 
         {
             holidayRentalRate = 1000.00 + 150.00;
         }
    }
    public double getHolidayRentalRate() 
    {
        return holidayRentalRate;
    }         
}