package sortalg;


public class BubbleSort {
    public static int[] doSort(int[] array) {
        boolean isSorted = false;
        int counter = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1, array);
                    isSorted = false;
                }
            }
            counter++;
        }
        return array;
    }

    private static void swap(int first, int second, int[] array) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
