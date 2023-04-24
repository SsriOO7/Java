import java.util.Scanner;

public class Prime {
    public static void PrimeNumber(int n){
        if (n>1){
            for (int i=2;i<=n;i++){
                if (n%i==0){
                    if (n==i){
                        System.out.println("This is a prime number");
                    }
                    else{
                        System.out.println("This is a not a prime number");
                        return;
                    }
                }
            }
        }
        else{
            System.out.println("This is not a prime number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        PrimeNumber(n);
        sc.close();
    }
}
