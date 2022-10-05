public class Bubble {
    public static void main(String[] args) {
        System.out.println("Learning Bubble Sort");

        int arr[] = { 7, 8, 3, 1, 2 };
        
        //time complexity = O(n^2)
        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap the value
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}