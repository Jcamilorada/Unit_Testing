package examples.Annotations;

/**
 * Created by jolaya on 2/19/2015.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


//The following example was taken from http://www.javabeat.net/junit-4-annotation-example/#sthash.7VA6deth.dpuf
//Check the link above to verify your answers.
public class JUnitAnnotationExample {

    private ArrayList<String> list;

    @BeforeClass
    public static void oneTimeSetUp() {
        //Initialization code goes here
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void oneTimeTearDown() {
        //Release your resources here
        System.out.println("@AfterClass");
    }

    @Before
    public void setUp() {
        list = new ArrayList<String>();
        System.out.println("@Before - setup()");
    }

    @After
    public void tearDown() {
        list.clear();
        System.out.println("@After - teardown()");
    }

    @Test
    public void testEmptyCollection() {
        assertTrue(list.isEmpty());
        System.out.println("@Test Method 1");
    }

    @Test
    public void testOneItemCollection() {
        list.add("String1");
        assertEquals("String1", list.get(0));
        System.out.println("@Test Method 2");
    }
}
