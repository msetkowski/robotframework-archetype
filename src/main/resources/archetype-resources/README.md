# Robot Framework tests 

This module contains integration/system/acceptance tests built with Robot Framework.  

## Preparation
Before you will run them please adjust (if needed) addresses in file `/src/test/resources/hosts.robot`.
When configuration of installed instance was heavily modified (user names, passwords, ports, etc.) more changes might be needed to apply in `/src/test/resources/configuration.robot` 

## Running tests
As not all test cases are prepared to re-run please use call:

`mvn clean install`

If you want to run selected test cases using tags please run 

`mvn -Dincludes=PDF clean install`

If you want to exclude test cases using tags please run

`mvn -Dexcludes=PDF clean install`
 
## Results
 
You will find report and log file after in folder `target/robotframework-reports`
Robot Framework generates always report file with summary and detailed log file with keywords details. 