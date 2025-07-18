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

WebUI.click(findTestObject('Homepage_without_Login/AllCategory_Book/Book1/Book_Harry Potter and the Chamber of Secrets'))

WebUI.verifyElementVisible(findTestObject('DetailBook_without_Login/Book 1/Book Details'))

WebUI.verifyElementVisible(findTestObject('DetailBook_without_Login/Book 1/Image_Book'))

WebUI.verifyElementVisible(findTestObject('DetailBook_without_Login/Book 1/Title Name'))

WebUI.verifyElementVisible(findTestObject('DetailBook_without_Login/Book 1/Author Name'))

WebUI.verifyElementVisible(findTestObject('DetailBook_without_Login/Book 1/Category Name'))

WebUI.verifyElementVisible(findTestObject('DetailBook_without_Login/Book 1/Price of Book'))

WebUI.click(findTestObject('DetailBook_without_Login/Book 1/Button_Add to Cart'))

WebUI.back()

WebUI.delay(2)

WebUI.click(findTestObject('Homepage_without_Login/AllCategory_Book/Book2/Book_Harry Potter and the Prisoner of Azkaban'))

WebUI.verifyElementVisible(findTestObject('DetailBook_without_Login/Book 2/Header_Book Details'))

WebUI.verifyElementVisible(findTestObject('DetailBook_without_Login/Book 2/Title_Name'))

WebUI.verifyElementVisible(findTestObject('DetailBook_without_Login/Book 2/Author_Name'))

WebUI.verifyElementVisible(findTestObject('DetailBook_without_Login/Book 2/Category Name'))

WebUI.verifyElementVisible(findTestObject('DetailBook_without_Login/Book 2/Price of Book'))

WebUI.click(findTestObject('DetailBook_without_Login/Book 2/Button_Add to Cart'))

WebUI.click(findTestObject('DetailBook_without_Login/Book 2/Button_Cart'))

WebUI.scrollToElement(findTestObject('Cart_without_Login/Button_CheckOut'), 0)

WebUI.callTestCase(findTestCase('Blocks/Close_Web'), [:], FailureHandling.STOP_ON_FAILURE)

