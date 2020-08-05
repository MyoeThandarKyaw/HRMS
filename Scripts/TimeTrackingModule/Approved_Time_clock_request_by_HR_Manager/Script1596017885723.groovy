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

InternalData data = findTestData('Login_Data')

for (def index : (4..data.getRowNumbers() - 3)) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://hrms.ahtaroo.com/#/login')

    WebUI.setText(findTestObject('Object Repository/Approved_Time_clock_request_by_HR_Manager/Page_HRMS/input_HRMS_username'), 
        'wwhHlaing')

    WebUI.setEncryptedText(findTestObject('Object Repository/Approved_Time_clock_request_by_HR_Manager/Page_HRMS/input_HRMS_password'), 
        'tR+yPLK5N5TO48zpsW01Kw==')

    WebUI.click(findTestObject('Object Repository/Approved_Time_clock_request_by_HR_Manager/Page_HRMS/button_Login'))

    WebUI.maximizeWindow()

    WebUI.click(findTestObject('Object Repository/Approved_Time_clock_request_by_HR_Manager/Page_HRMS/p_Time Clock Requests'))

    WebUI.delay(4)

    WebUI.click(findTestObject('Object Repository/Approved_Time_clock_request_by_HR_Manager/Page_HRMS/button_Approve'))
}

