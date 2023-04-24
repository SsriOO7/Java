import java.util.Scanner;

public class cumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int length = 0;
        String[] arrays = new String[n];
        for(int i=0;i<n;i++){
            arrays[i] = sc.next();
            length+=arrays[i].length();
        }
        System.out.println(length);
        sc.close();
    }
}
