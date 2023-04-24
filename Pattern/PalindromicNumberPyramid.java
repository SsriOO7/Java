import java.util.Scanner;

public class PalindromicNumberPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        int a = 1;
        System.out.println("Output");
        for(int i=n;i>0;i--){
            for(int k=1;k<=i*2;k++){
                System.out.print(" ");
            }
            for(int l=a;l>0;l--){
                System.out.print(l+" ");
            }
            for(int j=1;j<=a;j++){
                if(j!=1){
                    System.out.print(j+" ");
                }
            }
            a++;
            System.out.println();
        }
        sc.close();
    }
}

// Output
//           1
//         2 1 2
//       3 2 1 2 3
//     4 3 2 1 2 3 4
//   5 4 3 2 1 2 3 4 5