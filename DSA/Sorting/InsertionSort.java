public class InsertionSort {
    public static void main(String[] args) {

        System.out.println("Learning Insertion Sort");

        int arr[] = { 7, 8, 3, 1, 2 };

        // time complexity = O(n^2)
        // Selection Sort

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
