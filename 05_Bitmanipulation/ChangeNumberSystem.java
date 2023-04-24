import java.lang.Math;
import java.util.Scanner;
public class ChangeNumberSystem {
    public static void DecimalToBinary(int n){
        int count = 0;
        int x = 0;
        while(n>0){
            if (n%2==1){
                count+=1*Math.pow(10,x);
            }
            x+=1;
            n/=2;
        }
        System.out.println("Output");
        System.out.printf("%04d%n",count);
    }
    public static void BinaryToDecimal(int n){
        int count = 0;
        int x = 0;
        String Count = String.valueOf(n);
        int length = Count.length();
        for (int i=length-1;i>=0;i--){
            if (Count.charAt(x)== '1'){
                count+=1*Math.pow(2,i);
            }
            x+=1;
        }
        System.out.println("Output");
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        DecimalToBinary(n);
        System.out.println("Enter any binary number");
        int m = sc.nextInt();
        BinaryToDecimal(m);
        sc.close();
    }
}
