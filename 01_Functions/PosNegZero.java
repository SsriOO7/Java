import java.util.Scanner;

public class PosNegZero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int count1=0;
        int count2=0;
        int count3=0;
        do{
            System.out.println("Enter number");
            int n = sc.nextInt();
            System.out.println("Enter 1 to continue or 0 to end");
            a = sc.nextInt();
            if (a==1 || a==0){
                if (n>0){
                    count1++;
                }
                else if(n<0){
                    count2++;
                }
                else if(n==0){
                    count3++;
                }
                if (a==0){
                    System.out.printf("%nThere is %s Positive number%n",count1);
                    System.out.printf("There is %s Negative number%n",count2);
                    System.out.printf("Number of zero is %s",count3);
                }
            }
            else{
                System.out.println("Enter valid option");
            }
        }while(a==1);
        sc.close();
    }
}
