package agladyshev;

public class Factorial {

    private int factDiv(int m, int r) {
        if (m <= r) return 1;
        return m * factDiv(m - 1, r);
    }


    private int fact(int n) {

        if (n < 1) return 1;
        return (n) * fact(n - 1);
    }

    public int foo(int m, int r) {

        return factDiv(m, r) / fact(m - r);
    }
}
