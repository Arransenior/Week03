package genericMethods;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class SwapTest {
    private Integer[] ints;

    private String[] phoneticAlphabet;

    @BeforeEach
    void setUp() {
        this.ints = new Integer[]{1, 2, 3, 4};
        this.phoneticAlphabet = new String[]{"Alpha", "Bravo", "Charlie", "Delta"};
    }

    @AfterEach
    void tearDown() {
        this.ints = null;
        this.phoneticAlphabet = null;
    }

    @Test
    void swapAlphabet() {
        assertArrayEquals(Swap.swap(this.phoneticAlphabet, 1, 2), new String[]{"Alpha", "Charlie", "Bravo", "Delta"});
    }

    @Test
    void swapInterger() {
        assertArrayEquals(Swap.swap(this.ints, 1, 2), new Integer[]{1, 3, 2, 4});
    }

    @Test
    void swapNegetive(){
        assertArrayEquals(Swap.swap(this.ints, 1, 2), new Integer[]{-1, -3, -2, -4});
    }

    @Test
    void NegetiveIndex(){
        assertArrayEquals(Swap.swap(this.ints, -1, -2), new Integer[]{-1, -3, -2, -4});
    }



}
