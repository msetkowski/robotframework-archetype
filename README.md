# robotframework-archetype
Maven archetype for robotframework with configuration and custom keywords examples (java and python)

# Intro

One may ask why another archetype for robotframework tests. I created this one to have Java optimised and tuned self containing module which I also use to teach robotframework.
This archetype will generate module which contains
* the execution and report configuration via argument file (e.g. flatteing FOR loop keyword)
* a sample python based keyword implementation
* a sample Java based keywords (including usage of javalib-core library)
* usage of variables defined in pom file
* sharing the configuration between robot files
* suite initialisation with _\_\_init\_\_.robot_ files
* pre-defined tags to skip selected tests 




# Usage

```
mvn -B archetype:generate                         \
 -DarchetypeGroupId=com.github.msetkowski         \
 -DarchetypeArtifactId=robotframework-archetype   \
 -DarchetypeVersion=1.0.0                         \
 -DgroupId=com.github.test                        \
 -DartifactId=module-tests                        \
 -Dversion=1.0.0-SNAPSHOT

cd module-tests

mvn clean install

 ```


# Links

[Robot Framework Maven Plugin](http://robotframework.org/MavenPlugin/)
[Robot Framework User Guide](http://robotframework.org/robotframework/latest/RobotFrameworkUserGuide.html)
[Annotation Library](https://github.com/robotframework/JavalibCore/wiki/AnnotationLibrary)

