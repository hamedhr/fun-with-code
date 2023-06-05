package searchalg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void existingElement() {
        //Given
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        //When
        int result = BinarySearch.doSearch(array, target);
        //Then
        Assertions.assertEquals(5, result);
    }

    @Test
    void emptyArray() {
        //Given
        int[] array = {};
        int target = 10;
        //When
        int result = BinarySearch.doSearch(array, target);
        //Then
        Assertions.assertEquals(-1, result);
    }

}