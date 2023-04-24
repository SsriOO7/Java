import java.util.Scanner;
public class PrintIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of string");
        int n = sc.nextInt();
        System.out.println("Input");
        int[] Numbers = new int[n];
        for(int i=0;i<n;i++){
            Numbers[i] = sc.nextInt();
        }
        System.out.println("Enter number ");
        int a = sc.nextInt();
        for(int i=0;i<n;i++){
            if (Numbers[i]==a){
                System.out.println("No. found at index "+i);
            }
        }
        sc.close();
    }
}
