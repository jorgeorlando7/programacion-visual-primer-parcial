public class Year2
{
     // Data field
     private int numberOfDays;
     
     // Days elapsed method
     public int daysElapsed(int mon, int day)
     {
         int days = 0;
         int[] daysInMonths = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 
             31, 30, 31 };
         for (int i = 1; i <= mon; i++)
         {
             days += daysInMonths[i - 1];
         }
         return days + day;
     }
   
     // Get methods
     public int getNumberOfDays()
     {
         return numberOfDays;      
     } 
     
     // Constructor
     public Year2() 
     {
         numberOfDays = 365;
     }   
       
}