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

WebUI.callTestCase(findTestCase('Blocks/Login'), [('username') : 'userbaru10', ('password') : 'fMhQ7SVMnhlpGWnDFuIlog=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Homepage_already_Login/Page_Home/Button_Cart'))

WebUI.click(findTestObject('Object Repository/Cart_already_Login/Button_CheckOut'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Title_Check Out'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Title_Order Summary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Title'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Quantity'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Price'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Total'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Checkout/Grand Total'))

WebUI.setText(findTestObject('Object Repository/Checkout/input_Name'), 'Alya')

WebUI.setText(findTestObject('Object Repository/Checkout/input_Address Line 1'), 'Jalan Ahmad Yani No 1')

WebUI.setText(findTestObject('Object Repository/Checkout/input_Address Line 2'), 'Jakarta Selatan ')

WebUI.setText(findTestObject('Object Repository/Checkout/input_Pincode'), 'JD12')

WebUI.setText(findTestObject('Object Repository/Checkout/input_State'), 'IND')

WebUI.scrollToElement(findTestObject('Checkout/Button_Order'), 0)

WebUI.click(findTestObject('Checkout/Button_Order'))

WebUI.callTestCase(findTestCase('Blocks/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Close_Web'), [:], FailureHandling.STOP_ON_FAILURE)

