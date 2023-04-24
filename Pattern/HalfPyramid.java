import java.util.*;
public class HalfPyramid {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Output");
        for (int j=1;j<=n;j++){
            for(int k=1;k<=n-j;k++){
                System.out.print("  ");
            }
            for (int i=1;i<=j;i++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

            // Output
            //       *
            //     * *
            //   * * *
            // * * * *