import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int n = sc.nextInt();
        int[] marks = new int[n];

        System.out.println("Input");
        for (int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Output");
        for (int i=0;i<n;i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
