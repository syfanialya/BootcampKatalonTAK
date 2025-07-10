import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Blocks/Open_Web'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Homepage_without_Login/Page_Home/Login_Homepage'))

WebUI.click(findTestObject('Login/Button_Register'))

WebUI.verifyElementVisible(findTestObject('Registration/Title_User Registration'))

WebUI.setText(findTestObject('Registration/input_First name'), 'Yaya')

WebUI.setText(findTestObject('Registration/input_Last name'), 'Nana')

WebUI.setText(findTestObject('Registration/input_User name'), 'userbaru000')

WebUI.setEncryptedText(findTestObject('Registration/input_Password'), 'fMhQ7SVMnhlpGWnDFuIlog==')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration/input_Confirm Password'), 'ECbvtbGzG7aMGC8oka7MCs0qyxmNI8Y3')

WebUI.scrollToElement(findTestObject('Registration/Radio_Button_Female'), 0)

WebUI.click(findTestObject('Object Repository/Registration/Radio_Button_Female'))

WebUI.click(findTestObject('Object Repository/Registration/Button_Registration'))

WebUI.callTestCase(findTestCase('Blocks/Close_Web'), [:], FailureHandling.STOP_ON_FAILURE)

