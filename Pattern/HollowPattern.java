import java.util.*;
public class HollowPattern {
    public static void main(String[] args){
        Scanner sc =   new Scanner(System.in);
        System.out.println("Enter number of row");
        int a = sc.nextInt();
        System.out.println("Enter number of column");
        int b = sc.nextInt();
        System.out.println("Output");
        for (int i=1;i<=a;i++){
            for (int j=1;j<=b;j++){
                if (i==1 || j==1 || i==a || j==b ){ // For outer star i=1 or j=1 or i=a or j=b
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }
            System.out.println();
            }
            sc.close();
        }
    }

//      if a=4 and b=5
//      OUTPUT

//      *****
//      *   *
//      *   *
//      *****