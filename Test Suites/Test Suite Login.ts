<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>TS Login</description>
   <name>Test Suite Login</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>true</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>10d31cbd-3231-452c-bd56-f8c25b0fe30c</testSuiteGuid>
   <testCaseLink>
      <guid>9a5cb095-e240-49d3-b0d4-20afc3b1a03f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Blocks/Open_Web</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>c432adaa-24a6-4592-bccc-48601d6d15d5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Blocks/Login_Dynamic</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>22ddc11a-1583-4cd9-a8db-1efdceeb1ec7</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Test Data/Data Test</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>22ddc11a-1583-4cd9-a8db-1efdceeb1ec7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>aa587279-9114-4456-815f-a81b46aaf82b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>22ddc11a-1583-4cd9-a8db-1efdceeb1ec7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>70063bd3-970f-4dba-8fb4-c1ce4615a96f</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
