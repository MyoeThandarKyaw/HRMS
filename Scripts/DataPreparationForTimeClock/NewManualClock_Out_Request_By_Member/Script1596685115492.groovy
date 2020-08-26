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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.ahtaroo.com/')

WebUI.setText(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/input_HRMS_username'), 'thawdarlwin')

//WebUI.setText(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/input_HRMS_username'), 'eieiPhyo')
//WebUI.setText(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/input_HRMS_username'), 'khinlay')
//WebUI.setText(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/input_HRMS_username'), 'phuengonphwe')
WebUI.setText(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/input_HRMS_password'), 'root@123')

WebUI.click(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/a_Clock In'))

WebUI.click(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/button_Manual'))

//WebUI.click(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/div_In_mat-radio-outer-circle'))
CustomKeywords.'custom_keyword_for_raido_button.clickUsingJS.click_radio_button'(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/div_In_mat-radio-outer-circle'), 
    30)

WebUI.click(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/input'))

WebUI.click(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/span_MCB Office (10 Miles Pyay)'))

WebUI.setText(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/textarea_Reason_reason'), 
    '-To attend another meeting')

WebUI.click(findTestObject('Object Repository/NewManualClock_Out_Request_By_Member/Page_HRMS/button_Submit'))

