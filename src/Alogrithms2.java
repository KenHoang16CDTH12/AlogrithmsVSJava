public class Alogrithms2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial result: " + factorialS(n));
        System.out.println("Sum result: " + sumS(n));
        System.out.println("S = 1 + 1/1! + 1/2! + 1/3! + .. + 1/n!. Result = " + sumFactorialS(n));
        System.out.println("S = 1 + 1/1! + 1/2! + 1/3! + .. + 1/n!. Result = " + sumFactorialSRecursion(n));
        System.out.println("*************************");
        System.out.println("S =  1/1! +(1+2)/2! + (1+2+3)/3! + … + (1+2+3+…n)/n!. Result = " + sumFactorialAdvance(n));
        System.out.println("S =  1/1! +(1+2)/2! + (1+2+3)/3! + … + (1+2+3+…n)/n!. Result = " + sumFactorialAdvanceRecursion(n));    }

    /**
     * S = n!
     */
    public static long factorialS(int number) {
        return number < 2 ? 1 : (number * factorialS(number - 1));
    }

    /**
     * S = 1 + 2 + 3 + .. + n
     */

    public static long sumS(long number) {
        return number == 0 ? 0 : (number + sumS(number - 1));
    }

    /**
     * Case 1 : No Recursion
     * S = 1 + 1/1! + 1/2! + 1/3! + .. + 1/n!
     */

    public static double sumFactorialS(int number) {
        double result = 0.0;
        for (int i = 0; i <= number; i++) {
            result += 1.0/factorialS(i);
        }
        return result;
    }

    /**
     * Case 2 : Recursion
     * S = 1 + 1/1! + 1/2! + 1/3! + .. + 1/n!
     */
    public static double sumFactorialSRecursion(int number) {
        return number == 0 ? 1 : ((1.0/factorialS(number)) + sumFactorialSRecursion(number - 1));
    }

    /**
     * Case 1 : No Recursion
     *  S = 1/1! +(1+2)/2! + (1+2+3)/3! + … + (1+2+3+…n)/n!
     *  number = 5 ==> Result = 4.041666666666666
     */
    public static double sumFactorialAdvance(int number) {
        double result = 0.0;
        for (int i = 0; i <= number; i++) {
            result += ((double) sumS(i)) / factorialS(i);
        }
        return result;
    }

    /**
     * Case 2 : Recursion
     *  S = 1/1! +(1+2)/2! + (1+2+3)/3! + … + (1+2+3+…n)/n!
     *  number = 5 ==> Result = 4.041666666666666
     */
    public static double sumFactorialAdvanceRecursion(int number) {
        return number == 0 ? 0 : (((double) sumS(number)) / factorialS(number)) + sumFactorialAdvanceRecursion(number - 1);
    }
}
