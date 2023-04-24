import java.util.Scanner;

public class Factorial {
    public static void factorialOfNumber(int a){
        if (a<0){
            System.out.println("Invalid number, Number should not be a negative number");
        }
        else{
            int fact = 1;
            for (int i=1;i<=a;i++){
                fact = fact*i;
            }
        System.out.println("Factorial of number is");
        System.out.println(fact);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        factorialOfNumber(n);
        sc.close();
    }
}
