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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
WebUI.openBrowser('')

WebUI.navigateToUrl('https://hrms.ahtaroo.com/#/login')

WebUI.setText(findTestObject('Object Repository/ToGetRowCountFromDynamicTable/Page_HRMS/input_HRMS_username'), 'wwhHlaing')

WebUI.setEncryptedText(findTestObject('Object Repository/ToGetRowCountFromDynamicTable/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/ToGetRowCountFromDynamicTable/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ToGetRowCountFromDynamicTable/Page_HRMS/p_Leave Requests'))

WebUI.click(findTestObject('Object Repository/ToGetRowCountFromDynamicTable/Page_HRMS/a_Show Filters'))

WebUI.click(findTestObject('Object Repository/ToGetRowCountFromDynamicTable/Page_HRMS/input'))

WebUI.click(findTestObject('Object Repository/ToGetRowCountFromDynamicTable/Page_HRMS/span_Rejected'))

WebUI.click(findTestObject('Object Repository/ToGetRowCountFromDynamicTable/Page_HRMS/button_Apply Filters'))
WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('/html/body/app-root/app-main/div/div[1]/app-approval-list-by-hr/section[2]/div/div[3]/div/div[1]/table'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

String ExpectedValue = 'Approved'

int rows_count = rows_table.size()
boolean is_ok=false;
println('rows_count ' + rows_count)

 Loop:for (int row = 0; row < rows_count; row++) {
	List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

	int columns_count = Columns_row.size()
   
	//println((('Number of Cells In Row ' + row) + ' are ') + columns_count)

	for (int column = 0; column < columns_count; column++) {
		String celltext = Columns_row.get(6).getText()

		//println((((('Cell Value of row number ' + row) + ' and column number ') + column) + ' IS ') + celltext)

		if (celltext == ExpectedValue) {
			is_ok=true;
			
			println('Text present Manager Approval is ' + celltext)
		   // println('Text present in row number 3 is: ' + Columns_row.get(2).getText())

			
		}else{
		is_ok=false;
		Loop: break
		
		}
		
	}
}
 if(is_ok){
	 println('All result are ok!')
 }else{
 	 println('All result are not ok!')
 }