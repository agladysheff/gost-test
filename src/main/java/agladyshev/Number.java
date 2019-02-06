package agladyshev;

public class Number {

    public void printNumbers() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0 && i % 7 == 0) {
                System.out.println("TwoSeven");
                continue;
            }
            if (i % 2 == 0) {
                System.out.println("Two");
                continue;
            }
            if (i % 7 == 0) {
                System.out.println("Seven");
                continue;
            }
            System.out.println(i);
        }
    }

}
