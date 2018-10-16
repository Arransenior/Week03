package genericMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by u1758442 on 16/10/2018.
 */
public class Swap {

    public static String[] swap(String[] array,int index1, int index2){

        String var = array[index1];
        array[index1] = array[index2];
        array[index2] = var;

        return array;




    }
}
