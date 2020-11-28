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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.ahtaroo.com/#/clockin')

WebUI.setText(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/input_HRMS_username'), 'kophyo')

WebUI.setEncryptedText(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/a_Clock In'))

//WebUI.focus(findTestObject('ManaualClockInRequest(Member)/Page_HRMS/button_Manual'))
WebUI.click(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/button_Manual'))

WebUI.click(findTestObject('ManaualClockInRequest(Member)/Page_HRMS/input'))

WebUI.click(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/span_Binary Lab'))

WebUI.setText(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/textarea_Reason_reason'), 'To attend meeting at Binary Lab Office')

WebUI.scrollToElement(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/button_Submit'), 4)

WebUI.click(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/button_Submit'))

