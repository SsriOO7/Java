import java.util.Scanner;
public class Comaprison {
    public static void ComparisonOfTwoNumber(float a, float b){
        if (a==b){
            System.out.println("They both are equal");
            return;
        }
        if (a>b){
            System.out.printf("%s is greater than %s",a,b);
        }
        else{
            System.out.printf("%s is greater than %s",b,a);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        float a = sc.nextFloat();
        System.out.println("Enter second number");
        float b = sc.nextFloat();
        ComparisonOfTwoNumber(a, b);
        sc.close();
    }
}
