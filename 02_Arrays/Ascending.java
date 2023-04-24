// TODO Check whether the program is in ascending order.
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter values");
        boolean condition = true;
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }
        int MinValue = numbers[0];
        for(int i=1;i<n;i++){
            if(MinValue>numbers[i]){
                condition = false;
            }
            else{
                MinValue = numbers[i];
            }
        }
        if(condition){
            System.out.println("Array is sorted in ascending order");
        }
        else{
            System.out.println("Array is not sorted in ascending order");
        }
        sc.close();
    }
}
