public class diamondPattern {
    public static void main(String args[]){
        int n = 8;
        int a=0;
        System.out.println("Output");
        for(int i=(n/2);i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("  ");
            }
            for(int k=0;k<=a;k++){
                System.out.print("*"+" ");
            }
            for(int l=1;l<=a;l++){
                System.out.print("*"+" ");
            }
            a++;
            System.out.println();
        }
        a=1;
        for(int m=(n/2);m>0;m--){
            for(int j=0;j<=a;j++){
                System.out.print("  ");
            }
            for(int k=m;k>1;k--){
                System.out.print("*"+" ");
            }
            for(int l=m;l>2;l--){
                System.out.print("*"+" ");
            }
            a++;
            System.out.println();
        }
    }
}


// Output
//         *
//       * * *
//     * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *