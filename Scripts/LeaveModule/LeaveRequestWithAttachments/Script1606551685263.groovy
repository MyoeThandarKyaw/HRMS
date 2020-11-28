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

WebUI.setText(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/input_HRMS_username'), 
    'maymyatnoe')

WebUI.setEncryptedText(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/button_Sign in'))

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/p_My leave'))

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/button_Request leave'))

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/span_'))

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/span_Medical(28 days available)'))

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/input_Second half_mat-input-3'))

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/span_Zay Yar Lin'))

WebUI.setText(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/textarea_Optional_leaveReason'), 
    '-to take care health')

//WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/div_Click or drag images here to upload'))

//WebUI.scrollToElement('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/div_Click or drag images here to upload', 2)

//WebUI.click('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/div_Click or drag images here to upload')

CustomKeywords.'upload.upload_attachment.uploadFile2'(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/div_Click or drag images here to upload'),
	'D:\\TESTING\\Testing_Image\\drill-150.png',
	'D:\\TESTING\\Testing_Image\\drill-151.png',
	'D:\\TESTING\\Testing_Image\\drill-153.png',
	'D:\\TESTING\\Testing_Image\\drill-156.png',
	'D:\\TESTING\\Testing_Image\\drill-157.png')

WebUI.click(findTestObject('Object Repository/LeaveModule/LeaveRequestWithAttachments/Page_HRMS/button_Submit'))

