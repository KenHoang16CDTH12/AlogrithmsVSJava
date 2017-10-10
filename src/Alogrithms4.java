import java.util.Scanner;

public class Alogrithms4 {
    public static void main(String[] args) {
        //System.out.println(pow(2, 3));
        //System.out.println(result(2, 3));


        Scanner sc = new Scanner(System.in);
        System.out.println("Import number");
        int number = sc.nextInt();
        int numberSum = sumSplitnumber(number);
        String result = checkDividesionThree(numberSum);
        System.out.println("Devide % 3 ?? " + result);
    }

    /**
     * pow
     */

    public static double pow(int x, int number) {
        return number == 0 ? 1.0 : x * pow(x, number - 1);
    }

    /**
     * S= 1 - x +x^2- x^3+ … (-1)x^n
     */

    public static double result(int x, int number) {
        double result = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0)
                result += pow(x, i);
            else
                result -= pow(x, i);
        }
        return result;
    }

    public static int sumSplitnumber(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number = number / 10;
        }
        return result;
    }

    public static String checkDividesionThree(int number) {
            return number % 3 == 0 ? "% 3 == 0" : "% 3 != 0";
    }
}
