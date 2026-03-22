public class StringExample {

    public static void main(String[] args) {
        // Creating a string using a string literal
        String str1 = "Hello, World!";

        // Creating a string using the new keyword
        String str2 = new String("Hello, Java!");

        // String concatenation
        String str3 = str1 + " " + str2; // Concatenates str1 and str2

        // Using string methods
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Uppercase of str2: " + str2.toUpperCase());
        System.out.println("Substring of str3: " + str3.substring(7, 12));
        System.out.println("Substring of str3: " + str3.substring(2));
        System.out.println("String contains entered character or not: " + str1.contains("Hello"));

        System.out.println(" character at defined index position is : " + str1.charAt(4));

        String result = String.format("Hello %s, you are %d years old", "Alex", 15);
        System.out.println(result);
        String msg = String.format("Hello %s", "John");
        System.out.println(msg);
        String result1 = String.format("Name: %s, Age: %d", "Alice", 16);
        System.out.println(result1);
        String result2 = String.join("-", "2025", "12", "29");
        System.out.println("string join is:" + result2);
        System.out.println("string empty or not :" + str1.isEmpty());
        System.out.println("string concat is:" + str1.concat("     welcome"));
        String s = "banana";
        System.out.println(s.replace('a', 'o'));
        System.out.println("replace strin:" + str1.replace('H', 'p'));
        String a = "Java";
        String b = "java";

        System.out.println(a.equalsIgnoreCase(b));

        String sentence = "Java is very easy";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        String s1 = new String("Java"); // new object
        String s2 = "Java";             // string literal (in pool)

        System.out.println(s1 == s2); // false

        s1 = s1.intern();              // interned string intern(), the string is added to the pool if it doesn’t exist already.
        System.out.println(s1 == s2); // true
        System.out.println("trim string:" + str1.trim());
        System.out.println("index Of:" + str1.indexOf('W'));
        System.out.println("index Of:" + str1.indexOf('o', 7));

        int num = 100;
        String str = String.valueOf(num);
        System.out.println(str); // Output: "100"

        // Comparing strings
        if (str1.equals("Hello, World!")) {
            System.out.println("str1 is equal to 'Hello, World!'");
        }
    }
}
