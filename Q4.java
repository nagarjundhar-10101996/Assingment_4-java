
import java.util.Scanner;

/**
 * Q4 Write a program to input an array from the user and reverse the order of
elements in an array in place i.e. without using any additional arrays.
Note: Please make the changes in array and not print the array in reverse.
 */
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element n : ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        int tr = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the number %d : ",i);
           arr[i] = sc.nextInt();
           
        }
        for (int i = 0; i < n/2; i++) {
            tr=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=tr;
        }
    }
}
