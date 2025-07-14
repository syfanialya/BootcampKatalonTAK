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
WebUI.waitForElementClickable(findTestObject('Homepage_without_Login/Book1/Book_Harry Potter and the Chamber of Secrets'), 
    10)

// Klik buku Harry Potter
WebUI.click(findTestObject('Homepage_without_Login/Book1/Book_Harry Potter and the Chamber of Secrets'))

// Tambahkan delay agar halaman sempat load
WebUI.delay(2)

// Cek URL saat ini
String actualUrl = WebUI.getUrl()

// Jika sudah di halaman detail buku yang benar, kita paksa arahkan ke URL yang salah
if (actualUrl == 'https://bookcart.azurewebsites.net/books/details/2') {
    WebUI.comment('Berhasil ke detail buku yang benar, sekarang akan diarahkan ke halaman yang salah.')

    WebUI.navigateToUrl('https://bookcart.azurewebsites.net/books/details/4')
}

// Ambil URL final dan verifikasi
String finalUrl = WebUI.getUrl()

WebUI.verifyMatch(finalUrl, 'https://bookcart.azurewebsites.net/books/details/4', false)

