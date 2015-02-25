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

To revise your answer check out the com.cafeto.junit.example.annotation package under test followed by src directories and execute JUnitAnnotationExample.
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
   
To revise te implementation check out the com.cafeto.junit.example.assertion package under src directory to find the AssertionExample.java file, and for JUnit tests
check out the junit.example.assertion package under test followed by src directories and execute TestAssertionExample.

###ExpectedException

As simple at it may look this it is powerful tool to prove exceptions to the normal execution of the code. Here is an example:

```java
//You can find this example at http://www.asjava.com/junit/junit-3-vs-junit-4-comparison/
public class JUnitExpectExceptionExample {
    //Since JUnit 4 all expectedexcpetion test cases use the following notation
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetElement() {
        (new ArrayList()).get(0);
    }
}
```

##Exercise
The analyst have come to like the features currently implemented (those in the example). But they have gathered a couple of new inquiries
which are:

1. Implement and validate a function that retrieves the sports registered in the system. Check that there are just these 
three types of sports: football, basketball and soccer.
2. Implement and validate a function that returns the winner of a tournament given the name of the tournament that should belong
to one matching the current available tournaments which are: {"afl", "asbl", "fifafwc", "fifawc", "nba", "nfl"}.
3. Validate that no tournament "mlb" hasn't been yet registered in the system (if it's not registered it has no winner, right?).
4. Implement and validate a function that retrieves all the winners of a given sport. Validate for each sport so that: winners in football
were {"pros fl", "patriots"}, winners in soccer were {"colombia", "germany"} and winners in basketball were {"west", "heats"}.
5. Implement and validate a function that retrieves all the winners of the system. Validate that the answer is an array containing
all the winners of each sport. Thus expect {{"pros fl", "patriots"}, {"colombia", "germany"}, {"west", "heats"}}.
6. Validate there is no more than the expect winners int the system. Thus if a 4th set of winners there should be no index available.
7. Implement and validate a method to check if the teams who played the finals were registered in the provided teams list.

Finally the analyst want to revise the process of validation and understand when the test class is starting and ending. 
Also they want to know when a specific test starts and ends, thus they want to know the time it starts, the time it ends 
and calculate the duration the test takes.

The exercise will consist of two aspects. First, the implementation of a class to responds to th requirements of the analyst group.
Second, the implementation of unit tests to validate the implemented methods.

[apiAssert]: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
[detailedAssert]: http://www.vogella.com/tutorials/JUnit/article.html#usingjunit_asserts
[apiAnnotation]: http://junit.sourceforge.net/javadoc/
[detailedAnnotation]: http://www.vogella.com/tutorials/JUnit/article.html#usingjunit_annotations
[apiExpectedException]: http://junit.org/apidocs/org/junit/rules/ExpectedException.html