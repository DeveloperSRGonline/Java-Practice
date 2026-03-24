// import myPackage.MyClass;

// public class Geeks {
//     public static void main(String[] args) {
//         // Initializing the String variable
//         // with a value
//         String s = "GeeksforGeeks";
//         // Creating an instance of class MyClass in
//         // the package. 
//         MyClass o = new MyClass();
//         o.getNames(s);
//     }
// }
// Note static keyword after import. 
import static java.lang.System.*;

class Geeks {

    public static void main(String args[]) {
// We don't need to use 'System.out'
// as imported using static.
        out.println("GeeksforGeeks");
    }
}
