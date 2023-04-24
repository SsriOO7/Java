//TODO To find the reverse of the string
import java.util.Scanner;
public class PR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ldigit;
        int sum=0;
        while(n!=0){
            ldigit = n%10;
            sum = sum*10 + ldigit;
            n/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
