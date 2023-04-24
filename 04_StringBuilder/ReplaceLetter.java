import java.util.Scanner;
public class ReplaceLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.printf("Original String is %n%s",sb);
        for(int i=0;i<sb.length();i++){
            if (sb.charAt(i)=='e'){
                sb.setCharAt(i, 'i');
            }
        }
        System.out.printf("%nOutput is %n%s",sb);
        sc.close();
    }
}
