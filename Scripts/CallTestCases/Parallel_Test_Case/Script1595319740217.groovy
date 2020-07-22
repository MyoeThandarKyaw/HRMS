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
import com.kms.katalon.core.testdata.InternalData as InternalData

InternalData data = findTestData('CompanyData')

for (def index : (0..data.getRowNumbers() - 1)) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://hrms.ahtaroo.com/#/login')

    WebUI.setText(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/input_HRMS_username'), 'wwhHlaing')

    WebUI.setEncryptedText(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/input_HRMS_password'), 'tR+yPLK5N5TO48zpsW01Kw==')

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/button_Login'))

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/p_Time Clock Requests'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/button_New Manual Entry'))

    //WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/div_My Direct Reports_mat-radio-outer-circle'))
    CustomKeywords.'custom_keyword_for_raido_button.clickUsingJS.click_radio_button'(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/div_My Direct Reports_mat-radio-outer-circle'), 
        30)

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/div_SubsidiarySBU'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/span_Good Brothers CoLtd'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/input_SubsidiarySBU_mat-input-6'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/span_Yangon'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/span_Department'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/div_Business to Business - YGN'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/div_All Employees_col-sm-2'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/button_All'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/button_Add'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/button_All'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/div_RemoveDaw Ei Ei MonDaw Mie Mie AungDaw _ef82b5'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/button_Add Time Clock'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/input'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/span_NUS(Singapore) University'))

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/button_Save'))

    WebUI.setText(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/textarea_Comment_comment'), '-To attend NUS university')

    WebUI.click(findTestObject('NewManaulTimeClock(AllEmployees_Clock_In)/Page_HRMS/button_Save_1'))
}