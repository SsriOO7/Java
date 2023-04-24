import java.util.Scanner;

public class Ques1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the string");
        int size = sc.nextInt();
        String[] strings = new String[size];
        sc.nextLine();
        System.out.println("Enter strings");
        int count = 0;
        for(int i=0;i<size;i++){
            strings[i] = sc.nextLine();
            count+=strings[i].length();
        }
        System.out.printf("The length of the string is %s %n",count);
        sc.close();
    }
}