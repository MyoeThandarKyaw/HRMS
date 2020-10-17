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

WebUI.setText(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/input_HRMS_username'), 'zwekophyo')

WebUI.setText(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/input_HRMS_password'), 'root@123')

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/p_Request leave'))

WebUI.click(findTestObject('LeaveModule/LeaveRequest/Page_HRMS/Page_HRMS/button_Request leave'))

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/span_'))

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/span_Leave Without Pay(5 days)'))

//WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/input_Leave Type_dateRange'))
//
//WebUI.doubleClick(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/td_3'))
WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/Page_HRMS/input_Second Half_mat-input-3'))

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/span_Kyawt Kalyar Tin'))

//WebUI.setText(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/span_Kyawt Kalyar Tin'), 'Go to SSB Office')
WebUI.setText(findTestObject('Object Repository/LeaveModule/LeaveRequest/Page_HRMS/Page_HRMS/Page_HRMS/textarea_Relieving person_leaveReason'), 
    '-to attend business management')

WebUI.click(findTestObject('LeaveModule/LeaveRequest/Page_HRMS/Page_HRMS/button_Submit'))

