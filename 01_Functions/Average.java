import java.util.Scanner;

public class Average {
    public static float AverageNumber(float a, float b, float c){
        float avg = (a+b+c)/3;
        System.out.println("Output");
        System.out.printf("%.2f",avg);
        return avg;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        float a = sc.nextFloat();
        System.out.println("Enter second number");
        float b = sc.nextFloat();
        System.out.println("Enter third number");
        float c = sc.nextFloat();
        AverageNumber(a, b, c);
        sc.close();
    }
}
