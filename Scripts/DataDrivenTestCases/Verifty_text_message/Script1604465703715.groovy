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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.ahtaroo.com/#/login')

WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/Verify_text_message/Page_HRMS/input_HRMS_username'), 
    'htunlukhant')

//WebUI.setEncryptedText(findTestObject('Object Repository/DataDrivenTestCases/Verify_text_message/Page_HRMS/input_HRMS_password'), 
//    'tR+yPLK5N5TO48zpsW01Kw==')
WebUI.setText(findTestObject('Object Repository/DataDrivenTestCases/Verify_text_message/Page_HRMS/input_HRMS_password'), 
    'root@123')

WebUI.click(findTestObject('Object Repository/DataDrivenTestCases/Verify_text_message/Page_HRMS/button_Sign in'))

//WebUI.verifyTextPresent("Signed in successfully", false)Incorrect Password!
//if(WebUI.verifyTextPresent("Incorrect Password!", false)){
//	WebUI.comment('Test case passed!!')
//}
//alertText=WebUI.getAlertText()
//
//WebUI.verifyMatch(alertText,'Incorrect Password!',false)
//if(WebUI.verifyTextPresent("User Name is incorrect!", false)){
//	WebUI.comment('Test case passed!!')
//}

//WebUI.verifyTextPresent('Incorrect Password!', false)
assert WebUI.verifyTextPresent('Incorrect Password!',false,FailureHandling.OPTIONAL) || WebUI.verifyTextPresent('User Name is incorrect!',false,FailureHandling.OPTIONAL)
if (WebUI.verifyTextPresent('Incorrect Password!', false,FailureHandling.OPTIONAL)) {
    WebUI.comment('Test case passed!!')

}else if (WebUI.verifyTextPresent('User Name is incorrect!', false,FailureHandling.OPTIONAL)) {
    WebUI.comment('Test case passed!!')
//}
//
WebUI.close()
//if (true) {
//}
//


