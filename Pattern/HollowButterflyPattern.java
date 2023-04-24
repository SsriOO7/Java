import java.util.Scanner;

public class HollowButterflyPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        int a = 2;
        System.out.println("Output");
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=i;j++){
                if (i==1 || j==1 || j==i){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int k=1;k<=(n-a);k++){
                System.out.print("  ");
            }
            a=a+2;
            for(int l=1;l<=i;l++){
                if (i==1 || l==1 || l==i){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        int y = 0;
        for (int x=n/2;x>0;x--){
            for(int j=x;j>0;j--){
                if (x==1 || j==1 || j==x){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int k=1;k<=y;k++){
                System.out.print("  ");
            }
            y=y+2;
            for(int l=x;l>0;l--){
                if (x==1 || l==1 || x==n || l==x){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}



        // Output
        // *                 *
        // * *             * *
        // *   *         *   *
        // *     *     *     *
        // *       * *       *
        // *       * *       *
        // *     *     *     *
        // *   *         *   *
        // * *             * *
        // *                 *