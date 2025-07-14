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

WebUI.callTestCase(findTestCase('Blocks/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage_already_Login/Book 1/Book_Harry Potter and the Chamber of Secrets'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 1/Book Details_the Chamber'))

WebUI.click(findTestObject('DetailBook_already_Login/Book 1/Add to Cart_the Chamber'))

WebUI.back()

WebUI.click(findTestObject('Homepage_already_Login/Book 2/Book_Harry Potter and the Prisoner of Azkaban'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 2/Book Details_the Prisoner'))

WebUI.click(findTestObject('DetailBook_already_Login/Book 2/Add to Cart_the Prisoner'))

WebUI.click(findTestObject('DetailBook_already_Login/Book 2/Button_Cart_the Prisoner'))

WebUI.verifyElementVisible(findTestObject('Cart_already_Login/Title_Shopping cart'))

WebUI.scrollToElement(findTestObject('Cart_already_Login/Button_CheckOut'), 0)

WebUI.callTestCase(findTestCase('Blocks/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Close_Web'), [:], FailureHandling.STOP_ON_FAILURE)

