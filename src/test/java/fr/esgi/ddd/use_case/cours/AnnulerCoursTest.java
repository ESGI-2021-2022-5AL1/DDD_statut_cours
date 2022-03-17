package fr.esgi.ddd.use_case.cours;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AnnulerCoursTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AnnulerCoursTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( fr.esgi.ddd.use_case.cours.AnnulerCoursTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void AnnulerCoursTest()
    {
        assertTrue( true );
    }
}
