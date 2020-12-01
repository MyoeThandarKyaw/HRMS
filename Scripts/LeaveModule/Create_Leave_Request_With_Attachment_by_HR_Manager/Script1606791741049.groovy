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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.ahtaroo.com/#/login')

WebUI.setText(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/input_HRMS_username'), 
    'haymarkyawwin')

WebUI.setEncryptedText(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/button_Sign in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/p_Leave log'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/button_Add new request'))

WebUI.setText(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/input_Employee_mat-input-4'), 
    'Lin Lin')

WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/span_Htet Aung Khant'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/button_Continue'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/div_Casual(2 days available 4 days used)'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/span_Medical(21 days available 9 days used)'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/input_Second half_mat-input-7'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/span_Phyo Yadana Kyaw Win'))

WebUI.setText(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/textarea_Optional_leaveReason'), 
    '-to take care health')

//WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/div_Click or drag images here to upload'))
CustomKeywords.'upload.upload_attachment.uploadFile2'(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/div_Click or drag images here to upload'), 
    'D:\\TESTING\\Testing_Image\\drill-150.png', 'D:\\TESTING\\Testing_Image\\drill-151.png', 'D:\\TESTING\\Testing_Image\\drill-153.png', 
    'D:\\TESTING\\Testing_Image\\drill-156.png', 'D:\\TESTING\\Testing_Image\\drill-157.png')

WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/button_Add leave'))

WebUI.click(findTestObject('Object Repository/LeaveModule/Create_Leave_Request_With_Attachment_by_HR_Manager/Page_HRMS/button_Confirm'))

