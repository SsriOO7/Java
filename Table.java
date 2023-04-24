import java.util.Scanner;
public class Table{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int counter=1; counter<11; counter++){
            System.out.println(a*counter); // Counter++ = Counter+1
        }
        sc.close();
    }
}