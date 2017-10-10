public class InsertionSortEx {
    public static void main(String[] args) {
        int[][] array =  { {4, 3, 8, 2, 5}, {2, 1} };
        showArrayTwo(array);
        System.out.println("Sort array 2-D");
        //int[][] arraySort = sort(array);
        //showArrayTwo(arraySort);
    }

    public static void showArrayTwo(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

   /* public static int[][] sort(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int key = arr[i][j];
                int tagI = i - 1;
                int tagJ = j - 1;
                while (tagI >= 0 && arr[tagI][j] > key) {
                    arr[tagI - 1][j] = arr[tagI][j];
                    tagI = tagI - 1;
                    while (tagJ >= 0&& arr[tagI][tagJ] > key) {
                        arr[tagI][tagJ - 1] = arr[tagI][tagJ];
                        tagJ = tagJ - 1;
                    }
                    arr[tagI + 1][tagJ] = key;
                }
                arr[tagI][tagJ + 1] = key;

            }
        }
        return arr;
    }*/
}
