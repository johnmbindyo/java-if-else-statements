package devsought.ifelse;

public class JavaIfExample4 {

    public static void main(String... args) {
        int a = 82;
        int b = 4;
        int mid = 50;
        int upper = 80;
        int lower = 15;
        if (a < b) {
            System.out.println(a + " is less than " + b);
        } else if (a < lower) {
            System.out.println(a + " is less than " + lower);
        } else if (a < mid) {
            System.out.println(a + " is less than " + mid);
        } else if (a < upper) {
            System.out.println(a + " is less than " + upper);
        } else {
            System.out.println(a + " is greater than " + b);
        }

    }
}
