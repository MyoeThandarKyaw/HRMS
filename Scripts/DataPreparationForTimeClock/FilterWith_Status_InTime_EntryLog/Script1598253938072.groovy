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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.ahtaroo.com/#/login')

WebUI.setText(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Check_Approval_Status/Page_HRMS/input_HRMS_username'), 
    'miemie')

WebUI.setEncryptedText(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Check_Approval_Status/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Check_Approval_Status/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Check_Approval_Status/Page_HRMS/p_Time entry log'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/span_Select'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/div_Approved'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/div_New manual entries'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/button_Apply filters'))

CustomKeywords.'custom_function.CheckApprovalStatus.CheckStatus'('Approved')

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/a_x'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/span_Select'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/div_Rejected'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/div_New manual entries'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/button_Apply filters'))

CustomKeywords.'custom_function.CheckApprovalStatus.CheckStatus'('Rejected')

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/a_x'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/span_Select'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/div_Pending'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/div_New manual entries'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/button_Apply filters'))

CustomKeywords.'custom_function.CheckApprovalStatus.CheckStatus'('Pending')

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/a_x'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/span_Select'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/div_-'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/div_New manual entries'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/FilterWith_Status_InTime_EntryLog/Page_HRMS/button_Apply filters'))

CustomKeywords.'custom_function.CheckApprovalStatus.CheckStatus'('-')