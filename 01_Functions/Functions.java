import java.util.Scanner;

public class Functions {
    public static void PrintMyName(String name){
        System.out.println(name);  // If you are using void then there's no need to write return.
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Output");
        PrintMyName(name); // Calling a Function
        sc.close();
    }
}
