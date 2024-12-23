package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {8, 9, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {9, 11, 14, 1, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 9, 11, 14};
        assertThat(result).containsExactly(expected);
    }
}