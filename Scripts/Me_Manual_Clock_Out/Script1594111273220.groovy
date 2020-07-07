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

WebUI.setText(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/input_HRMS_username'), 'wwhHlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/input_HRMS_password'), 'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/li_ME'))

WebUI.click(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/a_Clock In'))

WebUI.click(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/button_Manual'))

WebUI.check(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/div_In_mat-radio-outer-circle'))

WebUI.click(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/input'))

WebUI.click(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/span_Binary Lab'))

WebUI.click(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/div_Binary Lab_mat-checkbox-inner-container'))

WebUI.setText(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/textarea_Reason_reason'), '-To attend meeting')

WebUI.click(findTestObject('Object Repository/Me_Manual_Clock_Out/Page_HRMS/button_Submit'))

