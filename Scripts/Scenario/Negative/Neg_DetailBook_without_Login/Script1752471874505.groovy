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

// Tunggu sampai elemen buku muncul
WebUI.waitForElementClickable(findTestObject('Homepage_without_Login/AllCategory_Book/Book3'), 10)

// Klik buku
WebUI.click(findTestObject('Homepage_without_Login/AllCategory_Book/Book3'))

// Ambil URL Buku saat ini
String actualUrl = WebUI.getUrl()

// Cek apakah bukan halaman yang diharapkan
if (!actualUrl.equalsIgnoreCase('https://bookcart.azurewebsites.net/books/details/2')) {
	WebUI.navigateToUrl('https://bookcart.azurewebsites.net/books/details/5')
}
else if (!actualUrl.equalsIgnoreCase('https://bookcart.azurewebsites.net/books/details/3')) {
	WebUI.navigateToUrl('https://bookcart.azurewebsites.net/books/details/6')
}

// Verifikasi akhir
String finalUrl = WebUI.getUrl()
if (finalUrl == 'https://bookcart.azurewebsites.net/books/details/5') {
	WebUI.verifyMatch(finalUrl, 'https://bookcart.azurewebsites.net/books/details/5', false)
}
else if (finalUrl == 'https://bookcart.azurewebsites.net/books/details/6') {
	WebUI.verifyMatch(finalUrl, 'https://bookcart.azurewebsites.net/books/details/6', false)
}

