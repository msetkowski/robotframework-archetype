# Robot Framework tests 

## Running tests
As not all test cases are prepared to re-run please use call:

`mvn clean install`

If you want to run selected test cases using tags please run 

`mvn -Dincludes=Smoke clean install`

If you want to exclude test cases using tags please run

`mvn -Dexcludes=Smoke clean install`
 
## Results
 
You will find report and log file after in folder `target/robotframework-reports`
Robot Framework generates always report file with summary and detailed log file with keywords details. 