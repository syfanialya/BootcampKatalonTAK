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

//Switch Case
select_category = Categories

switch (select_category) {
	case 'All Categories':
		WebUI.click(findTestObject('Homepage_already_Login/Page_Home  Filter Books/All Categories'))
		WebUI.click(findTestObject('Homepage_already_Login/AllCategory_Book/Book1/Add to Cart_Harry Potter and the Chamber of Secrets'))
		WebUI.click(findTestObject('Homepage_already_Login/AllCategory_Book/Book2/Add to Cart_Harry Potter and the Prisoner of Azkaban'))
		break
		
	case 'Biography':
		WebUI.click(findTestObject('Homepage_already_Login/Page_Home  Filter Books/Biography'))
		WebUI.waitForElementVisible(findTestObject('Homepage_already_Login/Biography_Book/Book_Rot Ruin'),5)
		WebUI.click(findTestObject('Homepage_already_Login/Biography_Book/Add to Cart_Book'))
		break
		
	case 'Fantasy':
		WebUI.click(findTestObject('Homepage_already_Login/Page_Home  Filter Books/Fantasy'))
		WebUI.waitForElementVisible(findTestObject('Homepage_already_Login/Fantasy_Book/Book_Harry Potter and the Half-Blood Prince'),5)
		WebUI.click(findTestObject('Homepage_already_Login/Fantasy_Book/Add to Cart_Book'))
		break

	case 'Fiction':
		WebUI.click(findTestObject('Homepage_already_Login/Page_Home  Filter Books/Fiction'))
		WebUI.waitForElementVisible(findTestObject('Homepage_already_Login/Fiction_Book/Book_Harry Potter and the Goblet of Fire'),5)
		WebUI.click(findTestObject('Homepage_already_Login/Fiction_Book/Add to Cart_Book'))
		break
		
	case 'Mystery':
		WebUI.click(findTestObject('Homepage_already_Login/Page_Home  Filter Books/Mystery'))
		WebUI.waitForElementVisible(findTestObject('Homepage_already_Login/Mystery_Book/Book_Harry Potter and the Chamber of Secrets'),5)
		WebUI.click(findTestObject('Homepage_already_Login/Mystery_Book/Add to Cart_Book'))
		break
		
	case 'Romance':
		WebUI.click(findTestObject('Homepage_already_Login/Page_Home  Filter Books/Romance'))
		WebUI.waitForElementVisible(findTestObject('Homepage_already_Login/Romance_Book/Book_Harry Potter and the Prisoner of Azkaban'),5)
		WebUI.click(findTestObject('Homepage_already_Login/Romance_Book/Add to Cart_Book'))
		break
		
	default:
		WebUI.click(findTestObject('Homepage_already_Login/Page_Home  Filter Books/All Categories'))
		WebUI.click(findTestObject('Homepage_already_Login/AllCategory_Book/Book1/Add to Cart_Harry Potter and the Chamber of Secrets'))
		WebUI.click(findTestObject('Homepage_already_Login/AllCategory_Book/Book2/Add to Cart_Harry Potter and the Prisoner of Azkaban'))
		break
}



//WebUI.scrollToElement(findTestObject('Homepage_already_Login/AllCategory_Book/Book3/Book_The Ministry of Truth The Biography of George Orwells 1984'), 0)
//
//WebUI.click(findTestObject('Homepage_already_Login/AllCategory_Book/Book3/Add to Cart_The Ministry'))
//
//WebUI.scrollToElement(findTestObject('Homepage_already_Login/AllCategory_Book/Book4/Book_Soul of the Sword'), 0)
//
//WebUI.click(findTestObject('Homepage_already_Login/AllCategory_Book/Book4/Add to Cart_Soul'))

WebUI.click(findTestObject('Homepage_already_Login/Page_Home/Button_Cart'))

WebUI.scrollToElement(findTestObject('Cart_already_Login/Button_CheckOut'), 0)

WebUI.callTestCase(findTestCase('Blocks/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Close_Web'), [:], FailureHandling.STOP_ON_FAILURE)

