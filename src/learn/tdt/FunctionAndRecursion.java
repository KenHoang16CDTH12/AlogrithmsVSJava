package learn.tdt;

public class FunctionAndRecursion {

    int i = 0; //Global variable

    public static void main(String[] args) {
        //f1f2();
        // test();
        //HaNoi Tower
        //hanoi(5, 1, 3, 2);
        //EXPONENTIAL RECURSION
        //int arr[] = {2, 3, 4, 1, 5, 8, 7};
        //print_permutations(arr, 0);
        //NESTED RECURSION
        System.out.println(ackerman(0, 1));
    }

    /**
     * Recursion
     */
    /**
     * MUTUAL RECURSION
     */
    /*public static int is_even(int n) {
        if (n == 0) return 1;
        else return (is_odd(n-1));
    }

    public static int is_odd(int n) {
        return !is_even(n);
    }*/

    /**
     * NESTED RECURSION
     */
    public static int ackerman(int m, int n) {
        if (m == 0) return n + 1;
        else if (n == 0) return (ackerman(m - 1, 1));
        else return (ackerman(m - 1, ackerman(m, n - 1)));
    }
    /**
     * EXPONENTIAL RECURSION
     */
    public static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.printf(arr[i] + "\t");
        System.out.println();
    }

    public static void print_permutations(int arr[], int i) {
        int swap;
        print_array(arr);
        for (int j = i + 1; j < arr.length; j++) {
            swap = arr[i]; arr[i] = arr[j]; arr[j] = swap;
            print_permutations(arr, i + 1);
            swap = arr[i]; arr[i] = arr[j]; arr[j] = swap;
        }
    }
    public static void testRecursion() {
        //Call itself
        testRecursion();
    }

    // Factorial
    public static long factorial(int number){
        return number < 2 ? 1 : number * factorial(number - 1);
    }

    /**
     * Hanoi Tower
     */
    public static void hanoi(int n, int from, int to, int temp) {
        if (n == 1) {
            System.out.println(from + " -> " + to);
        } else {
            hanoi(n - 1, from, temp, to);
            System.out.println(from + " -> " + to);
            hanoi(n - 1, temp, to, from);
        }
    }

    public static void func1() {
        int i = 0; //Local variable for f1
        i = 50;
    }

    public static void test() {
        int i;
        i = 0;
        System.out.println("value of i in main = " + i);
        func1();
        System.out.println("value of i after call = " + i);
    }


    /**
     * Function f1
     */
    public static void f1() {
        System.out.println("f1 - 5");
        System.out.println("f1 - 6");
        f2();
        System.out.println("f1 - 7");
        System.out.println("f1 - 8");
    }

    /**
     * Function f2
     */
    public static void f2() {
        System.out.println("f2 - 9");
        System.out.println("f2 - 10");
    }

    /**
     * Function f1 & f2
     */
    public static void f1f2() {
        System.out.println("1");
        System.out.println("2");
        f1();
        System.out.println("3");
        System.out.println("4");
    }

}
