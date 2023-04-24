import java.util.Scanner;

public class FormatOutput {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
            }
            System.out.println("================================");
            sc.close();

    }
}

// *Output
// ================================
// java 100
// java           100
// python 87
// python         087
// c++ 70
// c++            070
// ================================