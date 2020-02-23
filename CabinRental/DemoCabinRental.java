import java.util.*;
 
 
public class DemoCabinRental
{

    public static void main(String[] args) 
    {
        CabinRental cabinObject001 = new CabinRental(3);
        CabinRental cabinObject002 = new CabinRental(6);
        HolidayCabinRental holidayCabinObject001 = new HolidayCabinRental(1);
        HolidayCabinRental holidayCabinObject002 = new HolidayCabinRental(7);
        
        System.out.println("\nCabin room number: " + cabinObject001.getCabinNumber()
            + "\nWeek rental price: " + cabinObject001.getRentalRate());
            
        System.out.println("\nCabin room number: " + cabinObject002.getCabinNumber()
            + "\nWeek rental price: " + cabinObject002.getRentalRate());
            
        System.out.println("\nHoliday cabin room number: " + cabinObject001.getCabinNumber()
            + "\nWeek rental price: " + holidayCabinObject001.getHolidayRentalRate());
        
        System.out.println("\nHoliday cabin room number: " + cabinObject002.getCabinNumber()
            + "\nWeek rental price: " + holidayCabinObject002.getHolidayRentalRate());
        
    }         
}
