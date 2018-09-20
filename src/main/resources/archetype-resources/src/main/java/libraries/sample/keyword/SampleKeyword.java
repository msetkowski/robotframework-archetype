package libraries.sample.keyword;

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;


@RobotKeywords
public class SampleKeyword {

    public SampleKeyword() {
        // nop
    }

    @RobotKeyword("A veri naive demo of keyrd implmented using annotations")
    @ArgumentNames({ "value" })
    public void LogGivenValue(String val) {
        System.out.println("*INFO* just for demo purpose we log a given value on INFO level: " + val);
    }

}
