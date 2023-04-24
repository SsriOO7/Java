import java.util.Scanner;

public class Stringa {
    public static void main(String[] args){
        //* Strings are immutable */

        Scanner sc = new Scanner(System.in);
        String FirstName = "Tony";
        String LastName = "Stark";

        //TODO Concatenation */
        String FullName = FirstName + LastName;
        System.out.println(FirstName + LastName);
        System.out.println(FirstName +" "+LastName );
        System.out.println(FullName);

        //*tony@Stark */
        System.out.println(FirstName+"@"+LastName);

        //TODO To print length of the string  */
        System.out.println(FullName.length());

        //TODO To print every character of the string  */
        for(int i=0;i<FullName.length();i++){
            System.out.println(FullName.charAt(i));
        }

        //TODO Compare two string
        String name1 = "Tony";
        String name2 = "Tony";
        String name3 = "Tony2";

        //*Three cases */
        // *if string1 > string2 it return +ve value  */
        // *if string1 == string2 it returns 0
        // *if string1 < string2 it returns -ve value

        //* Sometimes == fails thats why we use charAt */

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if (name1.compareTo(name3) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        //* Substring */
        //*  substring(Beginning Index, Ending Index)

        String sentence = "My name is tony";
        String name = sentence.substring(11,sentence.length()); //* It will print 11 to length-1
        System.out.println(name);

        String sentence2 = "TonyStark";
        String name02 = sentence2.substring(0,4);
        System.out.println(name02);
        //* It will print Tony */
        String name03 = sentence2.substring(4);
        System.out.println(name03);
        //* It will print stark */

        sc.close();
    }
}
