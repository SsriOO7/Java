import java.util.Scanner;
public class NoOfOneInBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int count = 0;
        while (n>0){
            if (n%2==1){
                count+=1;
            }
        n/=2;
        }
        System.out.println(count);
        sc.close();
    }
}
