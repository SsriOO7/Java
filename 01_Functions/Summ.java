import java.util.Scanner;

public class Summ {
    public static int SumOfTwoNumber(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter number");
        int b = sc.nextInt();
        System.out.println("The sum of two number is");
        int sum = SumOfTwoNumber(a,b);
        System.out.println(sum);
        sc.close();
    }
}
