
import java.util.*;

public class Calculator {
    public static void main (String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter command");
        String str = sc.nextLine();
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Output");
        switch(str){
            case ("+"):
            System.out.println(a+b);
            break;
            case("-"):
            System.out.println(a-b);
            break;
            case ("*"):
            System.out.println(a*b);
            break;
            case("/"):
            System.out.println(a/b);
            break;
            case("%"):
            System.out.println(a%b);
            break;
            default:
            System.out.println("Error");
        }
        sc.close();
    }
}
