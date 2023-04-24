import java.util.Scanner;

public class Power {
    public static void power(int x, int n){
        System.out.println(Math.pow(x, n));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x=sc.nextInt();
        System.out.println("Enter power");
        int a=sc.nextInt();
        power(x,a);
        sc.close();
    }
}
