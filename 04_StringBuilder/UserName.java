import java.util.Scanner;
public class UserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length();i++){
            if (sb.charAt(i)=='@'){
                sb.delete(i, sb.length());
            }
        }
        System.out.printf("%nUserName is %s",sb);
        sc.close();
    }
}
