//TODO Write a program to toggle a bit a position = “pos” in a number “n”.

import java.util.Scanner;
public class ToggleABit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.println("Enter position");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;

        int ToggleNum = bitMask ^ n;
        System.out.println(ToggleNum);
        sc.close();
    }
}
