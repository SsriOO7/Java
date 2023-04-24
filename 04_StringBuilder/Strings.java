public class Strings {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Tony");
        System.out.println(sc);

        //* CharAt at index 0 */
        System.out.println(sc.charAt(0));

        //* Set character at index */
        sc.setCharAt(0,'P');
        System.out.println(sc);
        sc.setCharAt(0, 'T');

        //* To insert character at any index */
        sc.insert(0, 'H');
        sc.insert(sc.length(), 'S');
        System.out.println(sc);
        //TODO change string to Tonny
        sc.insert(3, 'n');
        System.out.println(sc);

        //* Delete letter from string */
        sc.deleteCharAt(0);
        sc.delete(2, 4); //* It will n=delete up to (5-1) or (end-1) character */
        System.out.println(sc);

        //* To add string at the end */
        sc.append("a");
        System.out.println(sc);

        //* To find length of string builder */
        System.out.println(sc.length());

    }
}
