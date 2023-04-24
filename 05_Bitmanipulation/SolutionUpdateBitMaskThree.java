//TODO update the 3rd bit (position=2) of a number n to operation defined by user (n=0101)
import java.util.Scanner;
public class SolutionUpdateBitMaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation 0 or 1");
        int opr = sc.nextInt();
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        if (opr ==1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            int NotBitMask = ~(bitMask);
            int newNumber = NotBitMask & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}