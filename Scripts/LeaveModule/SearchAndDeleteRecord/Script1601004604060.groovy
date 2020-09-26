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

WebUI.setText(findTestObject('Object Repository/LeaveModule/SearchAndDeleteRecord/Page_HRMS/input_HRMS_username'), 'haymarkyawwin')

WebUI.setEncryptedText(findTestObject('Object Repository/LeaveModule/SearchAndDeleteRecord/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/LeaveModule/SearchAndDeleteRecord/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/LeaveModule/SearchAndDeleteRecord/Page_HRMS/a_Leave pending approval'))

WebUI.click(findTestObject('Object Repository/LeaveModule/SearchAndDeleteRecord/Page_HRMS/a_Leave log'))

WebUI.setText(findTestObject('Object Repository/LeaveModule/SearchAndDeleteRecord/Page_HRMS/input_Reset filters_mat-input-5'), 
    'Myoe Thandar Kyaw')

WebUI.click(findTestObject('Object Repository/LeaveModule/SearchAndDeleteRecord/Page_HRMS/div_Clear_mat-checkbox-inner-container mat-_cf1045'))

WebUI.click(findTestObject('Object Repository/LeaveModule/SearchAndDeleteRecord/Page_HRMS/button_Delete 3'))

WebUI.click(findTestObject('Object Repository/LeaveModule/SearchAndDeleteRecord/Page_HRMS/button_Delete'))

