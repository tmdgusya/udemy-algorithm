package factorial;

public class TailRecursiveFactorial {

    public int fac(int n) {
        return compute(n, 1);
    }
    private int compute(int n, int fac) {
        if (n <= 1) {
            System.out.println("Tail End!");
            return fac;
        }

        return compute(n - 1, n * fac);
    }


}
