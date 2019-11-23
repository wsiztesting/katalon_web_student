<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Zestaw testów dla strony WSIZ Elearning</description>
   <name>TS_WSIZ_ELEARNING</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>896257db-7390-42ef-976f-3e645a144240</testSuiteGuid>
   <testCaseLink>
      <guid>74faad04-7f39-402f-94fe-e957d377b0eb</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_WSIZ_LOGOWANIE/TC01_WSIZ_Elearning_logowanie_bledne_dane</testCaseId>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>448f7ecb-35bc-4e62-abfd-8062900dec97</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>1a0a3f79-ab1a-4a08-8432-00227004e542</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_WSIZ_LOGOWANIE/TC02_WSIZ_Elearning_logowanie_bledne_dane2</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>90f0882e-0850-4798-9ff4-d28a9ec249e3</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/WSIZ/WSIZ_DATA_Logowanie_elearning</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>f2732855-7bd5-41fb-bae0-1435b096d36b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>90f0882e-0850-4798-9ff4-d28a9ec249e3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>user_name</value>
         <variableId>fd7a9177-6dbe-4045-8759-d76b65131d6e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>90f0882e-0850-4798-9ff4-d28a9ec249e3</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>9adebba8-eab1-4f5e-8d7e-576c8ebddbbd</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
