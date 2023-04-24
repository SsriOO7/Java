//TODO update the 3rd bit (position =2) of a number n to 0 (n=0101)
public class SolutionUpdateBitTwo {
    public static void main(String[] args) {
        int n =5; //0101
        int pos = 2;
        int bitMask = 1<<pos;

        int notbitMask = ~(bitMask);
        int NewNumber = notbitMask & n;
        System.out.println(NewNumber);
    }
}
