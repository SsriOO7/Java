//* without stringBuilder */
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter String");
        String str = sc.nextLine();
        for(int i =str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}

//* OR */
//*with property of stringBuilder */
//*time complexity is half of the above program */
// public static void main(String[] args) {
//     StringBuilder sb = new StringBuilder("Tony");
//     for(int i=0; i<sb.length()/2;i++){
//         int front = i;
//         int back = sb.length-1-i;

//         char frontchar = sb.charAt(front);
//         char backchar = sb.charAt(back);

//         sb.setchar(front,backchar);
//         sb.setchar(back,frontchar);
//     }
//     System.out.println(sb);
// }