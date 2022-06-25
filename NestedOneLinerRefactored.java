package devsought.ifelse;

public class NestedOneLinerRefactored {

    public static void main(String... args) {
        if (3 < 5) {
            if (4 > 10) {
                System.out.println("Statement1");
            } else {
                System.out.println("Statement2");
            }
        } else {
            System.out.println("Statement3");
        }

    }
}
