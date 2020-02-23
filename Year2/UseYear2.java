import java.util.*; 
 
 
public class UseYear2
{
     
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Year2 year2Object = new Year2();
        LeapYear leapYearObject = new LeapYear();
        
        System.out.println("A year has " + year2Object.getNumberOfDays() + " days. Please enter a month number: ");
        int inputMonth = in.nextInt();
        System.out.println("Enter day number: ");
        int inputDay = in.nextInt();
        System.out.println("Number of days elapsed: " + year2Object.daysElapsed(inputMonth, inputDay));
        
        System.out.println("A leap year has " + leapYearObject.getNumberOfDays() + " days. Please enter a month number: ");
        inputMonth = in.nextInt();
        System.out.println("Enter day number: ");
        inputDay = in.nextInt();
        System.out.println("Number of days elapsed: " + leapYearObject.daysElapsed(inputMonth, inputDay));
    }     
}
