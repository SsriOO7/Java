import java.util.Scanner;

public class Mull {
    public static int MulOfTwoNumber(int a, int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("The Multiplication of two number is");
        int mull = MulOfTwoNumber(a, b);
        System.out.println(mull);
        sc.close();
    }
}
