import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n = sc.nextInt();
        int i = 2;
        if(n==1){
            System.out.println("This is not a prime neither a composite number");
        }
        while (i<=n){
            if (n%i==0){
                if (i==n){
                    System.out.println("This is Prime Number");
                }
                else{
                    System.out.println("This is not a prime number");
                }
                break;
            }
            else{
                i++;
            }
        }
        sc.close();
    }
}
