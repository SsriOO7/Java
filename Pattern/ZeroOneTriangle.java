import java.util.*;

public class ZeroOneTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        int a = 1;
        System.out.println("Output");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                a=0;
            }
            else{
                a=1;
            }
            for (int j=1;j<=i;j++){
                System.out.print(a+" ");
                if (a==1){
                    a=0;
                }
                else{
                    a=1;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
            // OR

            // int a = 0;
            // System.out.println("Output");
            // for(int i=1;i<=n;i++){
            //     for (int j=1;j<=i;j++){
            //         if (a==1){
            //             a=0;
            //         }
            //         else{
            //             a=1;
            //         }
            //         System.out.print(a+" ");
            //     }
            //     if(i%2==0){
            //         a=0;
            //     }
            //     System.out.println();