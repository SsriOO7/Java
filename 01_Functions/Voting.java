import java.util.Scanner;

public class Voting {
    public static void EligibleToVote(int n ){
        if (n>0){
            if(n==18){
                System.out.println("You are not eligible to vote");
                return;
            }
            if (n>18){
                System.out.println("You are eligible to vote");
            }
            else{
                System.out.println("You are below 18");
            }
        }
        else{
            System.out.println("Please enter a valid age, Try again");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int n = sc.nextInt();
        EligibleToVote(n);
        sc.close();
    }
}
