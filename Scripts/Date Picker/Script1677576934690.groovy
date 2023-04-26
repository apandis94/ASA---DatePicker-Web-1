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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sribu.com/id/job-offer/detail')

WebUI.maximizeWindow()

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Page_Buat Job Untuk Pekerjaan Private  Publ_263243/label_Industri'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Buat Job Untuk Pekerjaan Private  Publ_263243/img_2'))

WebUI.delay(2)

for (def index : (0..12)) {
    String monthyear = WebUI.getText(findTestObject('Object Repository/Page_Buat Job Untuk Pekerjaan Private  Publ_263243/span_Agustus 2023'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    String data = monthyear

    System.print(data + '     ----     ')

    if (data == bulan) {
        break
    } else {
        WebUI.click(findTestObject('Object Repository/Page_Buat Job Untuk Pekerjaan Private  Publ_263243/Next'))
    }
}

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Baru/Page_Buat Job Untuk Pekerjaan Private  Publ_263243/div_14',  [('date') : tanggal]))

WebUI.closeBrowser()

	
