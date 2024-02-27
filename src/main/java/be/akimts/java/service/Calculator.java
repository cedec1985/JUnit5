package be.akimts.java.service;
public interface Calculator {
     /**
     * Returns the result of an addition of a and b.
     * The result should be memorized.
     *
     * @param a
     * @param b
     * @return a + b
     */
    int add(int a, int b);

    /**
     * Returns the results of the addition of the last memorized value and a.
     *
     * @param a
     * @throws RuntimeException if there is no memorized value
     * @return mem + a
     */
    int add(int a);

    /**
     * @return the last memorized value or null if there is none.
     */
    Integer getMem();

    /**
     * Reset the memorized value at null.
     */
    void resetMem();

    /**
     * @param a
     * @param b
     * @throws DivisionException if b is 0
     * @return the division of a by b
     */
    int divide(int a, int b);

    /**
     * @param a
     * @throws DivisionException if a is 0
     * @throws RuntimeException if there is no memorized value
     * @return the divide of the last memorized value by a
     */
    int divide(int a);

}
