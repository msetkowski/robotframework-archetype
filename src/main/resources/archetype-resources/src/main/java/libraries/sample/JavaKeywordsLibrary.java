package libraries.sample;


/**
 * The simplest Java style keyword implementation example.
 */
public class JavaKeywordsLibrary {

    /** Possible values are: TEST CASE, TEST SUITE, GLOBAL */
    public static final String ROBOT_LIBRARY_SCOPE = "TEST CASE";
    public static final String ROBOT_LIBRARY_VERSION = "0.0.1";

    public int calculateSum(int a, int b) {
        return a + b;
    }

    public int calculateMul(int a, int b) {
        return a * b;
    }
}
