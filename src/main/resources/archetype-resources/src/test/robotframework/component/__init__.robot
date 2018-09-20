*** Settings ***
Documentation    Performs required initialisation steps for all test cases in module
Library          OperatingSystem
Suite Setup      Prepare required structures

*** Variables ***
${TARGETDIR}          ${CURDIR}/../../../../target

*** Keywords ***
Prepare required structures
    Create Directory  ${TARGETDIR}/component/