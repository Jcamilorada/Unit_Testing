package examples.ExpectedExceptions;

import org.junit.Test;

import java.util.ArrayList;


/**
 * Created by jolaya on 2/19/2015.
 */

//You can find this example at http://www.asjava.com/junit/junit-3-vs-junit-4-comparison/
public class JUnitExpectExceptionExample {
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetElement() {
        (new ArrayList()).get(0);
    }
}
