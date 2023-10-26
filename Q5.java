/**
 * Q5 The following arrays shows the profits of a company from 2001 to 2010:
int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
Write a program to find which year the decline in profits began.
 */
public class Q5 {
    public static void main(String[] args) {
        int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
        int b = 0;
        for (int i = 1; i < profits.length; i++) {
            if(profits[i] <= profits[i-1] )
            {
                 b = i;
                break;
            }
        }
        if(b != 0)
        {
            System.out.println("decline begains in yr :"+(2001+b));
        }
        else
        {
            System.out.println("not be decline");
        }
    }
    
}
