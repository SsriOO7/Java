//TODO Update the 2nd bit(position = 1) of a number n to 1 (n= 0101)
public class SolutionUpdateBit {
    public static void main(String[] args) {
        int n =5; //0101
        int pos = 1;
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
