import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int c = sc.nextInt();
        int[][] Matrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("Enter the value of (%s,%s):-",i,j);
                Matrix[i][j] = sc.nextInt();
            }
        }
        boolean condition = true;
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (Matrix[i][j] == n){
                    System.out.printf("Value found at location (%s,%s)%n",i,j);
                    condition = false;
                }
            }
        }
        if (condition){
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}
