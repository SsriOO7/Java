import java.util.Scanner;

public class HalfPyramidNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Output");
        for (int i=1; i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}


            // Output
            //     1
            //    1 2
            //   1 2 3
            //  1 2 3 4
            // 1 2 3 4 5