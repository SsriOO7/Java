import java.util.Scanner;

public class SolidRhombus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n= sc.nextInt();
        System.out.println("Output");
        for (int k=n;k>0;k--){
            for(int i=1;i<=k;i++){
                System.out.print("  ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

        //     OR

        // String blank = " ";
        // for(int i=n;i>0;i--){
        //         System.out.print(blank.repeat(i));
        //     for (int j=1;j<=n;j++){
        //             System.out.print("*");
        //     }
        // System.out.println();
