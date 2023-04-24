public class Sorting {
    public static void solutionOne(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void BubbleSort(int[] arr){
        // * Bubble Sort */
        //* Time complexity = O(n^2) */
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Bubble Sort");
        solutionOne(arr);
        System.out.println();
    }
    public static void SelectionSort(int[] arr){
        //* Selection Sort */
        //* Time complexity = O(n^2) */
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Selection Sort");
        solutionOne(arr);
        System.out.println();
    }
    public static void InsertionSort(int[] arr){
        //* Insertion Sort */
        //* Time Complexity = O() */
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=1 && current < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }

            //* Placement */
            arr[j+1] = current;

        }
        System.out.println("Insertion Sort");
        solutionOne(arr);
    }
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        BubbleSort(arr);
        SelectionSort(arr);
        InsertionSort(arr);
    }
}
