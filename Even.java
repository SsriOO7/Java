import java.util.Scanner;

public class Even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("This is even number");
        }
        else{
            System.out.println("This is not even number");
        }
        sc.close();
    }
}
