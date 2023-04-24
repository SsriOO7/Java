//TODO Clear the 3rd bit(position = 2) of a number n(n=0101)
public class SolutionClearBit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;

        int notbitMask = ~(bitMask);

        int newNumber = notbitMask & n;
        System.out.println(newNumber);
    }
}
