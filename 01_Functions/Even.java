import java.util.Scanner;

public class Even {
    public static void EvenNumber(int n){
        if (n%2==0){
            System.out.println("This is a even number");
        }
        else{
            System.out.println("this is not a even number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        EvenNumber(n);
        sc.close();
    }
}
