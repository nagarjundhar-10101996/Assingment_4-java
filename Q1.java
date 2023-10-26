import java.util.Scanner;

/**
 * Q1. The following array contains attendance data of a student:
int[] arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
Write a program to find the attendance percentage of this student.
1=When student was present
0=When student was not present
 */
class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
        double percent = 0;
        int total = 0;
        for (int i = 0; i < n.length; i++) {
            total += n[i];
        }
        percent = (double)total*100/n.length;
        System.out.printf("%.2f",percent);
    }
    
}