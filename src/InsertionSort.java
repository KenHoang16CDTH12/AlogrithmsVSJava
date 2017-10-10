public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {8, 9, 5, 4, 6, 1, 7, 22, 99};
        showArray(arr);
        System.out.println("\nSort Array");
        showArray(inserSort(arr));
    }

    /**
     * Insertion Sort
     * @param A
     * @return
     */
    public static int[] sortArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int key = A[i];
            // Insert A[i] into the sorted sequence A[1..i - 1]
            int j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
        }
        return A;
    }

    /**
     * Print array
     */

    public static void showArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.printf(A[i] + "\t");
        }
    }

    public static int[] inserSort(int[] arr) {
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
}
