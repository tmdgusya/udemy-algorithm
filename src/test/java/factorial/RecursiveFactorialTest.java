package factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveFactorialTest {

    RecursiveFactorial recursiveFactorial = new RecursiveFactorial();
    TailRecursiveFactorial tailRecursiveFactorial = new TailRecursiveFactorial();

    @Test
    void test1() {
        // given
        int facNum = 5;
        int expected = 5 * 4 * 3 * 2 * 1;

        // when
        int result = recursiveFactorial.fac(facNum);

        // then
        assertEquals(result, expected);
    }

    @Test
    void test2() {
        // given
        int facNum = 5;
        int expected = 5 * 4 * 3 * 2 * 1;

        // when
        int result = tailRecursiveFactorial.fac(facNum);

        // then
        assertEquals(expected, result);
    }

    @Test
    void test3() {
        // given
        int facNum = 10;

        // when
        int result = tailRecursiveFactorial.fac(facNum);
        int result2 = recursiveFactorial.fac(facNum);

        // then
        assertEquals(result, result2);
    }

    @Test
    void test4() {
        // given
        int facNum = 10000;

        // when
        int result = tailRecursiveFactorial.fac(facNum); // 빠름.
        int result2 = recursiveFactorial.fac(facNum);

        // then
        assertEquals(result, result2);
    }

}