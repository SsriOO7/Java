import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String Name = sc.next();
        String orgName = "";
        for(int i=0;i<Name.length();i++){
            if (Name.charAt(i)=='e'){
                orgName+="i";
            }
            else if(Name.charAt(i)=='a'){
                orgName+="b";
            }
            else{
                orgName += Name.charAt(i);
            }
        }
        System.out.printf("%nOutput is %n%s",orgName);
        sc.close();
    }
}
