import java.util.Scanner;
public class PowOfTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        if ((n & n-1)==0){
            System.out.println("Number is power of two");
        }
        else{
            System.out.println("Number is not a power of two");
        }
        sc.close();
    }
}