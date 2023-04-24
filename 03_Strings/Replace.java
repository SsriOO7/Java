import java.util.Scanner;

public class Replace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String Name = sc.nextLine();
        String ret = "";
        for(int i=0;i<Name.length();i++){
            if(Name.charAt(i)=='e'){
                ret+='i';
            }
            else{
                ret+=Name.charAt(i);
            }
        }
        System.out.println(ret);
        sc.close();
    }
}
