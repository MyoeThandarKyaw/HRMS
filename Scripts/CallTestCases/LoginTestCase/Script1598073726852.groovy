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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.testdata.InternalData as InternalData

WebUI.openBrowser('')

InternalData data = findTestData('Login_Data')

//long ts1=0;
long ts1 = System.currentTimeMillis()

for (def index : (0..data.getRowNumbers() - 1)) {
    //Robot robot = new Robot()
    //robot.keyPress(KeyEvent.VK_CONTROL)
    //robot.keyPress(KeyEvent.VK_T)
    //robot.keyRelease(KeyEvent.VK_CONTROL)
    //robot.keyRelease(KeyEvent.VK_T)
    //WebUI.openBrowser('https://hrms.ahtaroo.com/#/login')
    WebUI.executeJavaScript('window.open();', [])

    WebUI.maximizeWindow()

    currentWindow = WebUI.getWindowIndex()

    //Go in to new tab
    WebUI.switchToWindowIndex(currentWindow + 1)

    WebUI.navigateToUrl('https://test.ahtaroo.com/#/login')

    WebUI.setText(findTestObject('Object Repository/CallTestCases/LoginTestCase/Page_HRMS/input_HRMS_username'), data.internallyGetValue(
            'demo_usn', index))

    WebUI.setText(findTestObject('Object Repository/CallTestCases/LoginTestCase/Page_HRMS/input_HRMS_password'), data.internallyGetValue(
            'demo_pwd', index))

    WebUI.click(findTestObject('Object Repository/CallTestCases/LoginTestCase/Page_HRMS/button_Login')) //WebUI.click(findTestObject('Object Repository/CallTestCases/LoginTestCase/Page_HRMS/i_MY COMPANY_right fas fa-angle-left'))
}

long ts2 = System.currentTimeMillis()

println(('Loading time ' + ((ts2 - ts1) / 1000)) + ' seconds.')

WebUI.comment(('Loading time ' + ((ts2 - ts1) / 1000)) + '!')






