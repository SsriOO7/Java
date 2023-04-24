import java.util.*;
class comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a!=b){
            if (a<b){
                System.out.println("B is Greater number");
            }
            else{
                System.out.println("A is Greater number");
            }
        }
        else{
            System.out.println("Both are Equal");
        }
        sc.close();
    }
}
