public class CabinRental
{
    private int cabinNumber;
    private double rentalRate;
    
    public CabinRental(int num)
    {
        cabinNumber = num;
        if (num == 1 || num == 2 || num == 3)
        {
            rentalRate = 950.00;
        } 
        else 
        {
            rentalRate = 1000.00;
        }
    }
    public int getCabinNumber() 
    {
        return cabinNumber;
    }
    public double getRentalRate() 
    {
        return rentalRate;
    }         
}
