//*  print transpose of a matrix

import java.util.Scanner;

public class Transpose{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of matrix");
        int rows = sc.nextInt();
        System.out.println("Enter columns of matrix");
        int columns = sc.nextInt();
        int[][] Transpose = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.printf("Enter value of (%s,%s) ",i,j);
                Transpose[i][j] = sc.nextInt();
            }
        }
        System.out.printf("%nMatrix %n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }
        System.out.printf("%nOutput %n");
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                System.out.print(Transpose[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}