import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int count=0;
        int count1=1;
        int a=1;
        System.out.printf("%s %s ",count,count1);
        for (int i=2;i<=n;i++){
            a = count+count1;
            System.out.printf("%s ",a);
            count = count1;
            count1 = a;
        }
        sc.close();
    }
}
