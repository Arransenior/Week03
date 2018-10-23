package genericMethods;


public class Swap<T> {
    /**
     * Swaps the value at index with the value at index2 in the specified array.
     *
     * @param array
     * @param index
     * @param index2
     * @return
     */
    public static <T> T[] swap(T[] array, int index, int index2) {
        T var = array[index];
        array[index] = array[index2];
        array[index2] = var;
        return array;
    }
}
