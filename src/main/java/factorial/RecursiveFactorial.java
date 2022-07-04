package factorial;

public class RecursiveFactorial {

    public int fac(int n) {
        if (n <= 1) {
            System.out.println("End!");
            return 1;
        }

        return n * fac(n -1);
    }


}
