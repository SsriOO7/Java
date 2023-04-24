public class Infiiniteloop {
    public static void infiniteLoop(int n){
        int a = 1;
        do{
            System.out.println("Infinite loop");
        }while(a==1);
    }
    public static void main(String args[]){
        int n = 1;
        infiniteLoop(n);
    }
}
