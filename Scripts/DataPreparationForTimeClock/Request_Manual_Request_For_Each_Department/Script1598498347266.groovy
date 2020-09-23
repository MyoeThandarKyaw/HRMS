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
//import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.ahtaroo.com/#/login')

WebUI.setText(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/input_HRMS_username'), 
    'haymarkyawwin')

WebUI.setEncryptedText(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/p_Time entry log'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/button_New manual entries'))

//WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/div_My direct reports_mat-radio-outer-circle'))
CustomKeywords.'custom_keyword_for_raido_button.clickUsingJS.click_radio_button'(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/div_My direct reports_mat-radio-outer-circle'),
	30)

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/input_Filter available_mat-input-3'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/span_ATO Subsidiary'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/div_OfficeBranch'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/span_ATO Branch'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/span_Department'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/div_Admin HR'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/div_My direct reportsAny employees'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/button_All'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/button_Add'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/button_Add time entry'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/input'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/span_QCST DEV Office'))

WebUI.setText(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/textarea_Reason_reason'), 
    '-to attend office at ATO')

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/button_Save'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/div_Delete_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Request_Manual_Request_For_Each_Department/Page_HRMS/button_Save and new'))

