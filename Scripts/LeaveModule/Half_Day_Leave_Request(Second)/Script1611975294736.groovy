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

WebUI.navigateToUrl('https://test.ahtaroo.com/#/login')

WebUI.setText(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/input_HRMS_username'), 
    'htunlukhant')

WebUI.setEncryptedText(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/div_ME_content-wrapper'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/p_My leave'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/button_Request leave'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/div_Full day'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/span_Half day'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/span_'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/span_Casual(3.5 days available)'))

//WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/div_First half_mat-radio-outer-circle'))
CustomKeywords.'custom_keyword_for_raido_button.clickUsingJS.click_radio_button'(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/Page_HRMS/Page_HRMS/div_First half_mat-radio-outer-circle'), 
    30)

WebUI.click(findTestObject('LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/Page_HRMS/Page_HRMS/Page_HRMS/input_Second half_mat-input-3'))

//WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/Page_HRMS/div_First half_mat-radio-inner-circle'))
WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/span_Phyo Yadana Kyaw Win'))

WebUI.setText(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/textarea_Optional_leaveReason'), 
    '-to go ssb office')

WebUI.click(findTestObject('Object Repository/LeaveModule/Half_Day_Leave_Request(Second)/Page_HRMS/button_Submit'))

