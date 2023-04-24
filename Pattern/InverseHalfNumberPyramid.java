import java.util.*;

public class InverseHalfNumberPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Output");
        for (int i=n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        System.out.println();
        }
        sc.close();
    }
}

// Output
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1