package sortalg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BubbleSortTest {

    @Test
    void withSingleElementArray() {
        int[] array = {5};
        int[] expected = {5};
        int[] result = BubbleSort.doSort(array);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void withUnSortedArray() {
        int[] array = {5, 4, 2, 1, 10};
        int[] expected = {1, 2, 4, 5, 10};
        int[] result = BubbleSort.doSort(array);
        Assertions.assertArrayEquals(expected, result);
    }


}