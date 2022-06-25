package devsought.ifelse;

public class JavaIfExample5 {

    public static void main(String... args) {
        int a = 22;
        int b = 24;
        int mid = 50;
        int upper = 80;
        int lower = 15;
        if (a < b) {
            if (a < lower) {
                System.out.println(a + " is less than " + b + " and less than" + lower);
            } else {
                System.out.println(a + " is less than " + b + " and greater than" + lower);
            }
        } else if (a < mid) {
            System.out.println(a + " is less than " + mid);
        } else if (a < upper) {
            System.out.println(a + " is less than " + upper);
        } else {
            System.out.println(a + " is greater than " + b);
        }

    }
}
