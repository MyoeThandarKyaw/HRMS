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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.ahtaroo.com/#/login')

WebUI.setText(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/input_HRMS_username'), 
    'haymarkyawwin')

WebUI.setEncryptedText(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/p_Leave pending approval'))

WebUI.click(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/button_Toggle Dropdown'))

WebUI.click(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/a_Advanced adjustment'))

WebUI.click(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/button_Add leave adjustment'))

WebUI.click(findTestObject('LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/svg_From_mat-datepicker-toggle-default-icon ng-star-inserted'))

WebUI.click(findTestObject('LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/td_27'))

WebUI.click(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/svg_To_mat-datepicker-toggle-default-icon n_bde48d'))

WebUI.click(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/div_29'))

WebUI.setText(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/textarea_Duration_note'), 
    'HR Manager would like to adjust the request date for employee. Because the employee\'s request date contains continuous off day leave.')

WebUI.click(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/button_Save'))

WebUI.click(findTestObject('Object Repository/LeaveModule/AdjustFromDateAndToDateByHRManager/Page_HRMS/button_Confirm'))

