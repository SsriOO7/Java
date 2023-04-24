import java.util.Scanner;

public class TwoDArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of column");
        int c = sc.nextInt();
        int[][] Matrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("Enter the value of (%s,%s):-",i,j);
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                    System.out.print(Matrix[i][j]+" ");
            }
        System.out.println();
        }
        sc.close();
    }
}
