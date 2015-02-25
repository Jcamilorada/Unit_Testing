# Unit Testing With Mockito and Junit


The main idea of this project is to provide examples to learn about junit and mockito features and their role in continuous integrations.


#JUnit and its roll in Continuous Integration
##JUnit
JUnit is a simple framework to write repeatable tests. It is a test framework which uses annotations to identify methods that specify a test.
###How to create a JUnit test
Typically a JUnit test is a method contained in a class which is only used for testing. This is called a Test class.

To write a test with the JUnit 4.x framework you annotate a method with the @org.junit.Test annotation.

In this method you use a method provided by the JUnit framework to check the expected result of the code execution versus the actual result.[1][link1]

Here's an example:

```java
@Test
// MyClass is tested
MyClass tester = new MyClass();
// Tests
assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
```

In each test we seek to prove a functionality of a unit which can be a class or a function. For this we ser different function such as [`Assertion`][link2], [`ExpectedException`][link3] and
[`Annotations`][link4].

[link1]: http://www.vogella.com/tutorials/JUnit/article.html#junit_intro
[link2]: http://junit.sourceforge.net/javadoc/org/junit/Assert.html
[link3]: http://junit.org/javadoc/latest/org/junit/rules/ExpectedException.html
[link4]: http://junit.sourceforge.net/javadoc/

###Difference between JUnit 3 and JUnit4
A nice overview of this topic is revised at [asjava.com][asjavalink] in the next [article][articleAsJava].

[asjavalink]: http://www.asjava.com/
[articleAsJava]: http://www.asjava.com/junit/junit-3-vs-junit-4-comparison/

##Continuous Integration
Continuous Integration (CI) is a development practice that requires developers to integrate code into a shared repository several times a day. Each check-in is then verified by an automated build, allowing teams to detect problems early.

By integrating regularly, you can detect errors quickly, and locate them more easily.[2][CiLink]

For further investigation into Continuous Integration (CI) click [here][CiLink].

[CiLink]: http://www.thoughtworks.com/continuous-integration

#What is JUnit's role in Continuous Integration?
Two important driving factors in software issuing and development are the need for more efficient feedback
loops, as well as the reduction of work in progress/process (WIP). WIP is a term from the inventory world,
which is a concept that refers to a company’s partially finished goods waiting for completion and eventual sale;
goods that are unable to reach the market can eat up company resources such as storage and bound capital.
This is why the whole Agile methodology, with sprints and Scrum, was even started in the first place. This led
to the development of continuous integration (CI) to automate build processes, speed up delivery, minimize
human involvement, and prevent error.[3][dzoneLink]

This process of error prevention and minimization of human involvement makes creates de necessity of a framework to 
simplify and organize the testing of code. Thus the creation of JUnit come to life.

The next diagram explains how this idea works in a continuous integration environment and where unit testing occurs:

![click here](https://github.com/Jcamilorada/Unit_Testing/tree/master/img/CI&JUnitDiagram.png)

[dzoneLink]: http://www.dzone.com/research/2015-guide-to-continuous-delivery
