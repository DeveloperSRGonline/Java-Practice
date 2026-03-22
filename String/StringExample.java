
public class StringExample {

    public static void main(String[] args) {
        // creating string using a string literal
        String str1 = "Hello, World!";

        // Creating a string using the new keyword
        String str2 = new String("Hello, Java!");

        // String concatenation
        String str3 = str1 + " " + str2; // Concatenates str1 and str2

        // Using string methods
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Uppercase of str2: " + str2.toUpperCase());
        System.out.println("Substring of str3: " + str3.substring(7, 12));

        // Comparing strings
        if (str1.equals("Hello, World!")) {
            System.out.println("str1 is equal to 'Hello, World!'");
        }
    }
}
