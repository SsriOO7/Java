//TODO Find the sum of length of array */
import java.util.Scanner;

public class CumulativeArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        String[] Name = new String[n];
        int count = 0;
        sc.nextLine();

        for(int i=0;i<n;i++){
            Name[i] = sc.nextLine();
            count+=Name[i].length();
        }
        System.out.println(count);
        sc.close();
    }
}