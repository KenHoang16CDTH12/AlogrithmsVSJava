package learn.tdt.module1.ex8;

public class AlogrithmsEX9 {
    public static void main(String[] args) {
        //computeMoney(100, 12, 2);
        computeMoneyRecursion(100, 12, 2);
    }

    public static void computeMoney(double money, int numberMonth, double percent) {
        double result = money;
        double convertPercent = percent / 100;
        for (int i = 1; i <= numberMonth; i++) {
            System.out.println("Month " + i + ":" + result);
            result = money + money * convertPercent;
            money = result;
        }
    }

    public static void computeMoneyRecursion(double money, int numberMonth, double percent) {
        double convertPercent = percent / 100;
        if (numberMonth == 0) {
            //System.out.println("Month " + numberMonth + ":" + money);
        } else {
                double result = money;
                System.out.println("Month "  + ":" + result);
                result = money + (money * convertPercent);
                computeMoneyRecursion(result, numberMonth - 1, percent);
        }
    }


}
