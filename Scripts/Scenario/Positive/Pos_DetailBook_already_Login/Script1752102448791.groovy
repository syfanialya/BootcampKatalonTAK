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

WebUI.click(findTestObject('Homepage_without_Login/Page_Home  Filter Books/Mystery'))

WebUI.waitForElementVisible(findTestObject('Homepage_already_Login/AllCategory_Book/Book1/Book_Harry Potter and the Chamber of Secrets'), 
    5)

WebUI.click(findTestObject('Homepage_already_Login/AllCategory_Book/Book1/Book_Harry Potter and the Chamber of Secrets'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 1/Book Details_the Chamber'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 1/img_the Chamber'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 1/Title Name_the Chamber'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 1/Author Name_the Chamber'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 1/Category Name_the Chamber'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 1/Price of Book_the Chamber'))

WebUI.scrollToElement(findTestObject('DetailBook_already_Login/Book 1/Similar Books_the Chamber'), 2)

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 1/Similar Books_the Chamber'))

WebUI.back()

WebUI.click(findTestObject('Homepage_without_Login/Page_Home  Filter Books/Romance'))

WebUI.waitForElementVisible(findTestObject('Homepage_already_Login/AllCategory_Book/Book2/Book_Harry Potter and the Prisoner of Azkaban'), 
    5)

WebUI.click(findTestObject('Homepage_already_Login/AllCategory_Book/Book2/Book_Harry Potter and the Prisoner of Azkaban'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 2/Book Details_the Prisoner'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 2/img_the Prisoner'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 2/Title Name_the Prisoner'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 2/Author Name_the Prisoner'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 2/Category Name_the Prisoner'))

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 2/Price of Book_the Prisoner'))

WebUI.scrollToElement(findTestObject('DetailBook_already_Login/Book 2/Similar Books_the Prisoner'), 2)

WebUI.verifyElementVisible(findTestObject('DetailBook_already_Login/Book 2/Similar Books_the Prisoner'))

WebUI.callTestCase(findTestCase('Blocks/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Close_Web'), [:], FailureHandling.STOP_ON_FAILURE)

