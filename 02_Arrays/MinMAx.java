import java.util.Scanner;

public class MinMAx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println();
        System.out.println("Enter value");
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }
        int MinValue = numbers[0];
        int MaxValue = numbers[0];
        for (int i=1;i<n;i++){
            if (MinValue>numbers[i]){
                MinValue=numbers[i];
            }
            if (MaxValue<numbers[i]){
                MaxValue = numbers[i];
            }
        }
        System.out.println("Output");
        System.out.println("Smallest value is "+MinValue);
        System.out.println("Largest value is "+MaxValue);
        sc.close();
    }
}
