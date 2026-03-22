
public class StringBufferExample {

    public static void main(String[] args) {
// Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");
// Append method
        sb.append(" World"); // Appends " World" to the end of the StringBuffer
        System.out.println("After append: " + sb); // Output: "Hello World"
// Insert method
        sb.insert(5, ","); // Inserts a comma at index 5
        System.out.println("After insert: " + sb); // Output: "Hello, World"
// Delete method
        sb.delete(5, 6); // Removes characters from index 5 to 6 (just the comma)
        System.out.println("After delete: " + sb); // Output: "Hello World"
// Reverse method
        sb.reverse(); // Reverses the string
        System.out.println("After reverse: " + sb); // Output: "dlroW olleH"
// Convert StringBuffer to String
        String str = sb.toString(); // Converts StringBuffer to String
        System.out.println("Converted to String: " + str); // Output: "dlroW

    }
}
