package genericMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by u1758442 on 16/10/2018.
 */
public class SwapTest {


    String[] names;
    public void setUp() throws Exception {
        this.names = new String[]{"Sam", "Ben", "Will", "Rich"};


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void swap() throws Exception {
        Swap.swap(names,1,2);
        System.out.println(names);
    }

}