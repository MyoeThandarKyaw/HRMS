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

//long ts1 = System.currentTimeMillis()
//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://hrms.ahtaroo.com/#/login')
//
//WebUI.setText(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/input_HRMS_username'), 'wwhHlaing')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/input_HRMS_password'), 
//    'tR+yPLK5N5TO48zpsW01Kw==')
//
//WebUI.click(findTestObject('Object Repository/ManaualClockInRequest(Member)/Page_HRMS/button_Login'))
//
//WebUI.maximizeWindow()
//
//WebUI.click(findTestObject('PerformanceTest/Page_HRMS/p_Time Clock Requests'))
//
//WebUI.click(findTestObject('PerformanceTest/Page_HRMS/button_View History'))
//
//WebUI.click(findTestObject('PerformanceTest/Page_HRMS/Page_HRMS/div_5'))
//
//WebUI.click(findTestObject('PerformanceTest/Page_HRMS/Page_HRMS/span_100'))
//
//long ts2 = System.currentTimeMillis()
//
//println(('Login duration: ' + ((ts2 - ts1) / 1000)) + ' seconds.')
long ts1 = System.currentTimeMillis() / 1000L
WebUI.openBrowser('www.google.com')
WebUI.waitForPageLoad(60) // You can set your max wait time here
long ts2 = System.currentTimeMillis() / 1000L
if ((ts2-ts1)>10){
	  WebUI.comment('Loading takes too long!')
}
WebUI.comment('Loading time!'+(ts2-ts1))
