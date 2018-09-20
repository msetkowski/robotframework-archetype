*** Settings ***
Documentation    Basic test cases
Library          PythonKeywordsLibrary
Library          libraries.sample.JavaKeywordsLibrary
Library          libraries.sample.SampleAnnotationLibrary
Resource         ../../resources/configuration.robot
Test Setup       Initilaise test
Test Teardown    Cleanup test

*** Variables ***
${RESOURCEDIR}          ${CURDIR}/../../../test/resources
${TARGETDIR}          ${CURDIR}/../../../../target

*** Test Cases ***
Perform calculations are verify results using python extension
    [Tags]    Sample    python
    ${sum}    ${mul}=    Do Calculations    5    7
    Should Be Equal As Integers    ${sum}    12
    Should Be Equal As Integers    ${mul}    35

Perform calculations are verify results using java extension    
    [Tags]    Sample    java
    ${sum}=    Calculate Sum    5    7
    ${mul}=    Calculate Mul    5    7
    Log Given Value    ${sum}
    Log Given Value    ${mul}
    Should Be Equal As Integers    ${sum}    12
    Should Be Equal As Integers    ${mul}    35
    
    
*** Keywords ***
Reusable Keyword 
    No operation
    
Initilaise test
    No Operation
    
Cleanup test
    No Operation