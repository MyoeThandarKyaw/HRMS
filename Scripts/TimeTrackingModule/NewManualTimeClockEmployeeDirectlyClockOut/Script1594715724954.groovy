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

WebUI.navigateToUrl('https://hrms.ahtaroo.com/#/login')

WebUI.setText(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/input_HRMS_username'), 
    'wwhHlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/a_Attendance'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/p_Time Tracking'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/p_Time Clock Requests'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/button_New Manual Entry'))

//WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_My Direct Reports_mat-radio-outer-circle'))
CustomKeywords.'custom_keyword_for_raido_button.clickUsingJS.click_radio_button'(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_My Direct Reports_mat-radio-outer-circle'),
	30)

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/span_Employees'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_Daw Wutt Yi Phyo'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_U Soe Moe Htwe'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_Daw Khaing Zar Lwin'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_Daw Yu Mon Mon Tun'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_U Kyaw Linn Htike'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_U Kyaw Zin Thet'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_U Zar Ni Oo'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_Daw Than Than Cho'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_Daw Thazin Moe'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/button_Add'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/button_All'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/button_Add Time Clock'))

//WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_Clock In_mat-radio-outer-circle'))
CustomKeywords.'custom_keyword_for_raido_button.clickUsingJS.click_radio_button'(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/div_Clock In_mat-radio-outer-circle'),
	30)

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/input'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/span_NUS(Singapore) University'))

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/button_Save'))

WebUI.setText(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/textarea_Comment_comment'), 
    '-Clock out from Singapore')

WebUI.click(findTestObject('Object Repository/NewManualTimeClockEmployeeDirectlyClockOut/Page_HRMS/button_Save_1'))

