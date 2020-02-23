public class UseYear
{
     
    public static void main(String[] args) 
    {
        Year yearObject = new Year();
        LeapYear leapYearObject = new LeapYear();
        
        System.out.println("A year has " + yearObject.getNumberOfDays() + " days.");
        System.out.println("A leap year has " + leapYearObject.getNumberOfDays() + " days.");
    }     
}