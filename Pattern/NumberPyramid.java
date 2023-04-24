import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        int m = 1;
        System.out.println("Output");
        for(int i=n;i>0;i--){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                System.out.print(m+" ");
            }
        m++;
        System.out.println();
        }
        sc.close();
    }
}

// Output

//      1
//     2 2
//    3 3 3
//   4 4 4 4
//  5 5 5 5 5