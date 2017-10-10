public class Alogrithms3 {
    public static void main(String[] args) {
        System.out.println(factorical(5));
        System.out.println(pow(2, 5));
        System.out.println(sumS(3, 2));
    }

    /**
     * S= 1 + x/1! +x2/2! + x3/3! + … + xn/n!
     */
    public static double sumS(int number, int x) {
       return number == 0 ? 1 : ((pow(x, number)) / factorical(number)) + sumS(number - 1, x);
    }

    /**
     * Pow
     */

    public static double pow(int number, int count) {
        return count == 1 ? number : number * pow(number, count - 1);
    }
    /**
     * n!
     */
    public static double factorical(int number) {
        return number < 2 ? 1.0 : number * factorical(number - 1);
    }
}
