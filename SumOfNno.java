import java.util.*;
public class SumOfNno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i =1;
        int count=0;
        while (i<n+1){
            count = count+i;
            i++;
        }
        System.out.print(count);
        sc.close();
        }
    }
