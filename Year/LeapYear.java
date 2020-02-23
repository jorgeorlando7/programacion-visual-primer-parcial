public class LeapYear extends Year2
{
    private int leapNumberOfDays;
     
     // Constructor
     public void Year() 
     {
         leapNumberOfDays = 366;
     } 
     
     // Days elapsed method
     public int daysElapsed(int mon, int day)
     {
         int days = 0;
         int[] daysInMonths = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 
             31, 30, 31 };
         for (int i = 1; i <= mon; i++)
         {
             days += daysInMonths[i - 1];
         }
         return days + day;
     }
  
       
}