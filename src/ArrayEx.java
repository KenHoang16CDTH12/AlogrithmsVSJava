import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        int arr[] = insertArray(7);
        //Import & Export
        showArray(arr);
        int arrSort[] = sort(arr);
        //Sort
        System.out.println("Array sort: ");
        showArray(arrSort);
        //Count
        System.out.println("Count index array > 0: " + countIndexBiggerThanZero(arrSort));
        showIndexBiggerThanZero(arrSort);
        System.out.println("Count index array < 0: " + countIndexSmallerThanZero(arrSort));
        showIndexSmallerThanZero(arrSort);
        System.out.println("Count index array % 2 == 0: " + countIndexDivisibleTwo(arrSort));
        System.out.println("Count index array % 3 == 0: " + countIndexDivisibleThree(arrSort));
        System.out.println("Count index array % 5 == 0: " + countIndexDivisiblefive(arrSort));
        //Sum
        System.out.println("Sum index array % 2 == 0: " + sumIndexDivisibleTwo(arrSort));
        System.out.println("Sum index array % 3 == 0: " + sumIndexDivisibleThree(arrSort));
        System.out.println("Sum index array % 5 == 0: " + sumIndexDivisiblefive(arrSort));
    }

    /**
     * Sort
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    /**
     * Show array
     * @param arr
     */
    public static void showArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
        System.out.println("");
    }

    /**
     * Insert array
     * @param length
     * @return
     */
    public static int[] insertArray(int length) {
        int arr[] = new int[length];
        Scanner sc = new Scanner(System.in);
        System.out.println("Import array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    /**
     * Count index bigger than zero
     * @param arr
     * @return
     */
    public static int countIndexBiggerThanZero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * show index smaller than zero
     * @param arr
     * @return
     */
    public static int countIndexSmallerThanZero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * show index bigger than zero
     * @param arr
     * @return
     */
    public static void showIndexBiggerThanZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.printf(arr[i] + "\t");
            }
        }
        System.out.println();
    }

    /**
     * Count index smaller than zero
     * @param arr
     * @return
     */
    public static void showIndexSmallerThanZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.printf(arr[i] + "\t");
            }
        }
        System.out.println();
    }

    /**
     * Count index divisible two
     * @param arr
     * @return
     */
    public static int countIndexDivisibleTwo(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Count index divisible three
     * @param arr
     * @return
     */
    public static int countIndexDivisibleThree(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Count index divisible five
     * @param arr
     * @return
     */
    public static int countIndexDivisiblefive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Sum index divisible two
     * @param arr
     * @return
     */
    public static int sumIndexDivisibleTwo(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /**
     * Sum index divisible three
     * @param arr
     * @return
     */
    public static int sumIndexDivisibleThree(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /**
     * Sum index divisible five
     * @param arr
     * @return
     */
    public static int sumIndexDivisiblefive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
