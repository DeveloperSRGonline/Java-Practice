public class AllConcepts
{
    public static void main(String[] args) {
        final int CONST = 10; // constant

        int a = 5;
        double b = a; // widening

        int c = (int) 9.8;

        // decision
        if(a > 3){
            System.out.println("A is greater");
        }

        // loop
        for(int i = 1; i <= 3; i++){
            System.out.println(i);
        }

        // operators
        int result = a + CONST;

        System.out.println("Result = " + result);
    }
}