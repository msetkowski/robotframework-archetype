package libraries.sample;

import java.util.ArrayList;
import java.util.List;

import org.robotframework.javalib.library.AnnotationLibrary;

/**
 * This class demostrates usage of org.robotframework:javalib-core library.
 *
 * For the detailed description please refer to https://github.com/robotframework/JavalibCore/wiki/AnnotationLibrary
 */
public class SampleAnnotationLibrary extends AnnotationLibrary {

    private static List<String> keywordPatterns = new ArrayList<String>() {

            {
                add("libraries/sample/keyword/*.class");

            }
        };

    public SampleAnnotationLibrary() {
        super(keywordPatterns);
    }

    @Override
    public String getKeywordDocumentation(String keywordName) {
        if (keywordName.equals("__intro__")) {
            return "This is the general library documentation.";
        }
        return super.getKeywordDocumentation(keywordName);
    }
}
