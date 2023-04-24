public class ButterflyPattern {
    public static void main(String args[]){
        int n = 8;
        System.out.println("Output");
        for (int i=1;i<=n/2;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int k=n-(i*2);k>0;k--){
                System.out.print("  ");
            }
            for (int l=1;l<=i;l++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        int a = 0;
        for(int x=(n/2);x>0;x--){
            for (int j=1;j<=x;j++){
                System.out.print("*"+" ");
            }
            for(int k=1;k<=a;k++){
                System.out.print("  ");
            }
            for (int l=x;l>0;l--){
                System.out.print("*"+" ");
            }
            a=a+2;
            System.out.println();
        }
    }
}

            // Output

            // *             *
            // * *         * *
            // * * *     * * *
            // * * * * * * * *
            // * * * * * * * *
            // * * *     * * *
            // * *         * *
            // *             *