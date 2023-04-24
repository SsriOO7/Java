import java.util.Scanner;

public class Table {
    public static void TableMul(int n){
        for (int i=1;i<11;i++){
            System.out.printf("%s * %s  =  %s%n",n,i,n*i);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        TableMul(n);
        sc.close();
    }
}
