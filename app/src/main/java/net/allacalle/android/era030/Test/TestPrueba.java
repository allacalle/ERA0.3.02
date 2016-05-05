package net.allacalle.android.era030.Test;

import android.test.InstrumentationTestCase;

/**
 * Created by Alfonso on 27/04/2016.
 */
public class TestPrueba extends InstrumentationTestCase {

    public void test () throws Exception
    {
        //final int expected = 1;
        //final int reality = 5;
        String expected = "hola";
        String reality = "hola";

        assertEquals(expected, reality);
    }
}

/*
/**
 * Created by Alfonso on 27/04/2016.

public class ExampleTest extends InstrumentationTestCase {
    public void test() throws Exception {
        final int expected = 1;
        final int reality = 5;
        assertEquals(expected, reality);
    }
}

*/