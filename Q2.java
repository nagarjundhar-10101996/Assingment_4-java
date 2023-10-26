/**
 * Q2.Store the following monthly sales report of a product in an array:
January 125,000 July 105,000
February 93,000 August 120,000
March 80,000 September 90,000
April 75,000 October 115,000
May 84,000 November 123,000
June 110,000 December 150,000
Write a program to store the quarterly sales report in another array and
display the monthly, quarterly and total sales. (Note: January, February,
March form the first quarter)
 */
public class Q2 {
    public static void main(String[] args) {
        String[] month = {"January","February" ,"March","April","May","June","July","August","September","October","November","December"};
        int[] no = {125000 , 93000 , 80000, 75000, 84000, 110000, 105000, 120000, 90000 ,115000 ,123000, 150000};
        long totalsells = 0;
        long q1 = 0;
        long q2 = 0;
        long q3 = 0;
        long q4 = 0;

        for (int i = 0; i < no.length; i++) {
            totalsells += no[i];
            
            if (i<3) {
                q1+=no[i];
                
            } else if(i>3 && i<6) {
                q2+=no[i];
            }else if(i>6 && i<9) {
                q3+=no[i];
            }else
            {
                q4+=no[i];
            }
            
        }
        System.out.println("monthly---------------------------------------------");
        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]+" : "+ no[i]);
        }
        System.out.println("quarterly---------------------------------------------");
        System.out.println("Q1 : "+ q1);
        System.out.println("Q2 : "+ q2);
        System.out.println("Q3 : "+ q3);
        System.out.println("Q4 : "+ q4);
        System.out.println("Total Sales : "+totalsells);


    }
    
}
