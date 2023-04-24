import java.util.*;

public class JavEndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNext()){
            String Name = sc.nextLine();
            System.out.printf("%s %s%n",i,Name);
            i++;
        }
        sc.close();
    }
}