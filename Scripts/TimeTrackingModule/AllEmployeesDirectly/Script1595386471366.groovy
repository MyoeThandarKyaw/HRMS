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

WebUI.setText(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/input_HRMS_username'), 'wwhHlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/input_HRMS_password'), 'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/button_Login'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/p_Time Clock Requests'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/button_New Manual Entry'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/div_My Direct Reports_mat-radio-outer-circle'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/span'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/span_Employees'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/span_Employees_dropdown-down'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/span'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/span_Employees_dropdown-down'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/div_Select All'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/button_Add'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/button_All'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/button_Add Time Clock'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/input'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/div_Ahtar Oo CoLtd'))

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/button_Save'))

WebUI.setText(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/textarea_Comment_comment'), 'Clock in From Ahtar Oo')

WebUI.click(findTestObject('Object Repository/AllEmployeesDirectly/Page_HRMS/button_Save  View'))
