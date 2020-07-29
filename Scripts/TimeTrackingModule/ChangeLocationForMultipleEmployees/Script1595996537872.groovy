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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testdata.InternalData as InternalData
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hrms.ahtaroo.com/#/login')

WebUI.setText(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/input_HRMS_username'), 'wwhHlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/a_Attendance'))

WebUI.click(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/p_Company Locations'))

WebUI.click(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/div_Primary Location Assignment'))

WebUI.click(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/div_Unassigned Employees_mat-checkbox-inner_3c96d6'))

WebUI.click(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/div_Display Options_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/td_MIU Office'))

InternalData data = findTestData('Login_Data')

//for (def index : (5..data.getRowNumbers() - 3)) {
    String dynamicId = 2+ ''

    //String xpath = '//div[@id="' + dynamicId + '"]'
    WebUI.comment('Dynamice ID ' + dynamicId)

    String xpath = ('//tr[' + dynamicId) + ']/td[7]/a'

    WebUI.comment('xpath ' + xpath)

    TestObject to = new TestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/a_Change Location')

    to.addProperty('xpath', ConditionType.EQUALS, xpath)

    WebUI.click(to)

    //	CustomKeywords.'custom_keyword_for_raido_button.clickUsingJS.click_radio_button'(findTestObject('ChangeLocationForMultipleEmployees/Page_HRMS/input'),
    //		30)
	
//	WebDriver driver = DriverFactory.getWebDriver()
//	WebElement ele = driver.findElement(By.xpath("//div[2]/input"));
//	JavascriptExecutor executor = (JavascriptExecutor)driver;
//	executor.executeScript("arguments[0].click();", ele);
	
	WebUI.click(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/input'))
	
    WebUI.click(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/span_Strategy First Office'))
//	WebDriver driver1 = DriverFactory.getWebDriver()
//	WebElement ele1 = driver1.findElement(By.xpath("//div[11]/span"));
//	JavascriptExecutor executor1 = (JavascriptExecutor)driver1;
//	executor1.executeScript("arguments[0].click();", ele1);

    WebUI.click(findTestObject('Object Repository/ChangeLocationForMultipleEmployees/Page_HRMS/button_Save'))
//}

