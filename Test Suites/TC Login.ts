<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TC Login</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>f24efa59-affb-4acf-ad57-4517d0028496</testSuiteGuid>
   <testCaseLink>
      <guid>2d874e72-f63c-4b29-b4dd-51c9239eaa36</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Blocks/Open_Web</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>c909e2cf-a10d-4a13-bb4d-0c2dad9fec4b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Blocks/Login_Dynamic</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>eff9d75d-83c3-4a29-8204-cbb8b19308de</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Test Data/TestData_Login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>eff9d75d-83c3-4a29-8204-cbb8b19308de</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>aa587279-9114-4456-815f-a81b46aaf82b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>eff9d75d-83c3-4a29-8204-cbb8b19308de</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>70063bd3-970f-4dba-8fb4-c1ce4615a96f</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
