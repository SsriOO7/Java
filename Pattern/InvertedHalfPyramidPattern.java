import java.util.*;
public class InvertedHalfPyramidPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Output");
        // String str = "*";
        // for (int i=n;i>0;i--){
        //     System.out.println(str.repeat(i));
        // }

        // OR
        for (int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        sc.close();
    }
}


// Output
// *****
// ****
// ***
// **
// *