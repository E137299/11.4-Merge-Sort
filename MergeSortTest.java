import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    public void testMergeSort_SortsCorrectly() {
        int[] input = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};

        Main.mergeSort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_EmptyArray() {
        int[] input = {};
        int[] expected = {};

        Main.mergeSort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_SingleElement() {
        int[] input = {42};
        int[] expected = {42};

        Main.mergeSort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_AlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        Main.mergeSort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_Reversed() {
        int[] input = {9, 7, 5, 3, 1};
        int[] expected = {1, 3, 5, 7, 9};

        Main.mergeSort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort_Duplicates() {
        int[] input = {4, 2, 4, 3, 2};
        int[] expected = {2, 2, 3, 4, 4};

        Main.mergeSort(input);

        assertArrayEquals(expected, input);
    }
}
