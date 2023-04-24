import java.util.Scanner;
public class Circumference {
    public static float CircumferenceOfCircle(float r){
        float cir = (float) (2*3.14*r);
        System.out.printf("Circumference of a circle is %s",cir);
        return cir;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle in cm");
        float r = sc.nextFloat();
        CircumferenceOfCircle(r);
        sc.close();
    }
}
