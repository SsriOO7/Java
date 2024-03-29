import java.util.*;

public class FloydTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        int a = 1;
        System.out.println("Output");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
        System.out.println();
        }
        sc.close();
    }
}

// Output
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15