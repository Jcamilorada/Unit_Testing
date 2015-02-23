#JUnit Practice
This section concentrates on the development on skills on JUnit. This project contains examples and an exercise regarding 
the usage of JUnit including assertion, annotation and expectedException functionalities but also a common package with
the implementation which will be used to assist in the explanation and realization of examples and exercises.

##Annotation
[`Annotations`][apiAnnotation] are used in Junit to mark methods and to configure the test run.

For a better understanding of each method of the [`Annotations`][apiAnnotation] visit the following [link][detailedAnnotation].

##Assertions
JUnit provides static methods in the [`Assert`][apiAssert] class to test for certain conditions. These assertion methods typically start
with `assert` and allow you to specify the error message, the expected and the actual result. An assertion method compares
the actual value returned by a test to the expected value, and throws an `AssertionException` if the comparison test fails.

For a better understanding of each method of the [`Assert`][apiAssert] class visit the following [link][detailedAssert].

##ExpectedException
The [`ExpectedException`][apiExpectedException] rule allows you to verify that your code throws a specific exception.

For a better understanding of each method of the [`ExpectedException`][apiExpectedException] class visit the following [link][apiExpectedException].

##The problem
A small group of analyst want to try and understand the relations between several different widely known tournaments.
Thus they collect information on six different tournaments that were played and decided to look at the following details:

- **The type of sport played:** sport was then declared a String type. The team decided the collect information of only
3 sports.
- **The name of the tournament:** name was then declared a String type.
- **The quantity of staff member:** quantity of staff (of any type) that assisted the event. Thus the variable quantityOfStaff
was created and declared as an integer.
- **The year in which the tournament took place:** year was then declared as an integer type.
- **List of participating teams:** which was simply declared as a List of Strings.
- **List of Finalist:** Corresponding to the two teams that got to the finals. thus finalMatch was declared as a List od Integers.
- **The score board for the final match:** which corresponds the a list of the scores of the final match in the final game. 
Please note that given the simplistic nature of the application the order in which the scores are given is the same in which
they are placed in the finalist list (i.e. finalMatch = {team1, team2} and scoredBoard = {2,0} then team1 scored 2 and team2 scored 0).

With this they created a list of question they wanted to answer and expect an implementation and proper validation of these
inquiries.

##Example

###Annotations
Given you have read more about annotations what do you think the following execution would show?

```java
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
```

To revise your answer check out the junit.example.annotation package under test followed by java directories and execute JUnitAnnotationExample.
###Assertion

Let us develop this idea by answering some of the simplest questions of the analyst group. Like the following ones:

1. **Who won a specific tournament?**
2. **How much did the winner score?**
3. **Which tournament is this?**
4. **Which tournaments belong to a given sport?**

Now to answer these lets look at what is expected of each.

1. Lets begin with a simple question where we have an expected result. We can assure the patriots won the nfl tournament. 
   Thus we expect that the result of ***getWinnerOfTournament***, if we insert nfl as the tournament, be the string patriots.

2. This example helps to see how the function assertEquals works for other types of data, in this case Integer.
   In our NFL tournament example we can assure that the patriots won with 28 points. Thus we expect to function ***getScoreOfWinner***
   to be 28.
   
3. Assert also supports the revision of objects. Lets try using the ***getTournament*** function a see how it retrieves the same object.  
   
4. Another function of Assert from JUnit is ***assertArrayEquals*** which permits to comparison of arrays of Objects or primitive type (int, short, String, etc).
   In the following example we want to compare to arrays containing Tournament Objects. We will use the function ***getTournamentOfGivenSport*** which return the tournaments,
   that host a specific sport. We know before hand that the tournaments currently registered are {"afl", "asbl", "fifafwc", "fifawc", "nba", "nfl"} and we know that
   their are 3 available sports soccer, basketball and football. For basketball we expect to receive find an array with nba and asbl tournaments.

###ExpectedException

As simple at it may look this it is powerful tool to prove the exceptions created in your code. Here is an example:

```java
//You can find this example at http://www.asjava.com/junit/junit-3-vs-junit-4-comparison/
public class JUnitExpectExceptionExample {
    //Since JUnit 4 al expectedexcpetion test cases use the following notation
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetElement() {
        (new ArrayList()).get(0);
    }
}
```

[apiAssert]: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
[detailedAssert]: http://www.vogella.com/tutorials/JUnit/article.html#usingjunit_asserts
[apiAnnotation]: http://junit.sourceforge.net/javadoc/
[detailedAnnotation]: http://www.vogella.com/tutorials/JUnit/article.html#usingjunit_annotations
[apiExpectedException]: http://junit.org/apidocs/org/junit/rules/ExpectedException.html