import java.util.Scanner;

public class username {

    int sal;
    username(int sal){
        this.sal=sal;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email ID");
        String email = sc.nextLine();
        // String UserName = "";
        for (int i=0;i<email.length();i++){
            if (email.charAt(i)=='@'){
                break;
            }
            else{
                // UserName+=email.charAt(i);
                System.out.print(email.charAt(i));
            }
        }
        username obj=new username(5);
        // System.out.printf("%nUsername is %n%s", UserName);
        sc.close();
    }
}
