import java.util.*;

public class menu1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        do{
            System.out.println("Enter marks");
            int marks = sc.nextInt();
            if(marks>=0 && marks<=100){
                if (marks>=90){
                    System.out.println("This is Good");
                }else if(marks >= 60){
                    System.out.println("This is also Good");
                }
                else{
                    System.out.println("This is Good as well");
                }
            }
            else{
                System.out.println("Invalid Number");
            }
            System.out.println();
            System.out.println("Enter 1 to Continue or 0 to Stop");
            a = sc.nextInt();
            if(a==0){
                System.out.println("Thank you");
            }
            System.out.println();
        }while(a==1);
        sc.close();
    }
}
