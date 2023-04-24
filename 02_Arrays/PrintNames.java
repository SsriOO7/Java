
import java.util.Scanner;

public class PrintNames {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of arrays");
        int n = sc.nextInt();
        String[] names = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter name");
            String a = sc.next();
            names[i] = a;
        }
        System.out.println();
        System.out.println("Output");
        for(int i=0;i<n;i++){
            System.out.println(names[i]);
        }
        sc.close();
    }
}
