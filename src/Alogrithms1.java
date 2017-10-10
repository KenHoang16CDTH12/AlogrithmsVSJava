public class Alogrithms1 {
    public static void main(String[] args) {
        double n = 3;
        System.out.println("Result sum s recursion: " + sumSRecursion(n));
        //sumSPow(2, n);
        System.out.println("Result sum s pow: " + sumSPow(3, 4));
        System.out.println("Result sum s pow recursion: " + sumSPowRecursion(3, 4));
    }

    public static double sumSRecursion(double number) {
        if (number == 0) {
            return 0;
        } else {
            return 1 / number +  sumSRecursion(number - 1);
        }
    }

    public static double sumSPow(double a, double number) {
        double t = 1;
        double sum = 0;
        if (a == 0) {
            return 0.0;
        } else {
            for (int i = 1; i <= number; i++) {
                t =  t * a;
                sum += t;
            }
        }
        return sum;
    }

    public static double sumSPowRecursion(double a, double number) {
        double t = 1;
        if (number == 1) {
            return a;
        } else {
            for (int i = 1; i <= number; i++) {
                t = t * a;
            }
            return t + sumSPowRecursion(a, number - 1);
        }
    }
}
