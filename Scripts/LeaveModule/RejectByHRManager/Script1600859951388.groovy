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
import com.kms.katalon.core.testdata.InternalData as InternalData

InternalData data = findTestData('Reject_Data')

//for (def index : (0..data.getRowNumbers() - 1)) {
WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.ahtaroo.com/#/login')

WebUI.setText(findTestObject('Object Repository/LeaveModule/RejectByHRManager/Page_HRMS/Page_HRMS/Page_HRMS/input_HRMS_username'), 
    'haymarkyawwin')

WebUI.setEncryptedText(findTestObject('Object Repository/LeaveModule/RejectByHRManager/Page_HRMS/Page_HRMS/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/LeaveModule/RejectByHRManager/Page_HRMS/Page_HRMS/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/LeaveModule/RejectByHRManager/Page_HRMS/Page_HRMS/Page_HRMS/p_Leave pending approval'))

WebUI.mouseOver(findTestObject('Object Repository/LeaveModule/RejectByHRManager/Page_HRMS/Page_HRMS/Page_HRMS/a_Reject'))

WebUI.click(findTestObject('Object Repository/LeaveModule/RejectByHRManager/Page_HRMS/Page_HRMS/Page_HRMS/a_Reject'))

WebUI.setText(findTestObject('Object Repository/LeaveModule/RejectByHRManager/Page_HRMS/Page_HRMS/Page_HRMS/textarea_concat(id(  mat-input-3  ))_mat-input-3'), 
    'check leave type')

WebUI.click(findTestObject('Object Repository/LeaveModule/RejectByHRManager/Page_HRMS/Page_HRMS/Page_HRMS/button_Confirm'))

