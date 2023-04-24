import java.util.Scanner;
class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        if (a>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
        sc.close();
    }
}
