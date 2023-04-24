import java.util.Scanner;
public class SumOfOdd {
    public static int sumOfOdd(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if (i%2!=0){
                count = count + i;
            }
        }
        System.out.println("Sum of all odd number are");
        System.out.print(count);
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        sumOfOdd(n);
        sc.close();
    }
}
