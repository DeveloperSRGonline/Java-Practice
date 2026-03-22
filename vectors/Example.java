
import java.util.Vector;



class Example{
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();

        Integer s1 = Integer.valueOf(1);
        Integer s2 = Integer.valueOf(2);
        String s3 = "fy";
        String s4 = "sy";
        Float s5 = 1.1f;
        Float s6 = 1.2f;

        v.addElement(s1);
        v.addElement(s2);
        v.addElement(s3);
        v.addElement(s4);
        v.addElement(s5);
        v.addElement(s6);


        System.out.println(v);

        v.removeElement(s2);
        v.removeAllElements();

        System.out.println(v);
    }
}