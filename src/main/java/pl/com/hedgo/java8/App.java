package pl.com.hedgo.java8;

import pl.com.hedgo.java8.testclasses.TestComparing;
import pl.com.hedgo.java8.testclasses.TestForEach;
import pl.com.hedgo.java8.testclasses.TestGroupCountSort;
import pl.com.hedgo.java8.testclasses.TestStream;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("JAVA 8 new functions");

        //new TestComparing().execute();
        //new TestForEach().executeMap();
        //new TestForEach().executeList();
        //new TestStream().execute();
        new TestGroupCountSort().execute();
    }

}