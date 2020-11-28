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

InternalData data = findTestData('Login_Data')

for (def index : (0..data.getRowNumbers() - 1)) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://test.ahtaroo.com/#/login')

    WebUI.setText(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/input_HRMS_username'), 
        data.internallyGetValue('demo_usn', index))

    WebUI.setText(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/input_HRMS_password'), 
        data.internallyGetValue('demo_pwd', index))

    WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/button_Login'))

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/p_My leave'))

    WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/button_Request leave'))

    WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/div_Full day_mat-select-arrow_1'))

    WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/span_Earned(9 days available)'))

    WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/svg_Leave type_mat-datepicker-toggle-defaul_4c1e26'))

    WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/div_19'))

    WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/div_20'))

    WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/input_Second half_mat-input-3'))

    WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/span_Phyo Kyaw'))

    WebUI.setText(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/textarea_Optional_leaveReason'), 
        '-to take care family')

    WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/ChooseDateRange_And_Approve_Employee/Page_HRMS/Page_HRMS/button_Submit'))
	
	WebUI.delay(5)
}

