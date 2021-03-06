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
import java.lang.String as String
import java.util.Date
import java.text.DateFormat
import java.text.SimpleDateFormat

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.ahtaroo.com/#/login')

WebUI.setText(findTestObject('Object Repository/DataPreparationForTimeClock/Check_Entry_Date_Range_at_Time_Pending_Approval/Page_HRMS/input_HRMS_username'), 
    'miemie')

WebUI.setEncryptedText(findTestObject('Object Repository/DataPreparationForTimeClock/Check_Entry_Date_Range_at_Time_Pending_Approval/Page_HRMS/input_HRMS_password'), 
    'tR+yPLK5N5TO48zpsW01Kw==')

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Check_Entry_Date_Range_at_Time_Pending_Approval/Page_HRMS/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Check_Entry_Date_Range_at_Time_Pending_Approval/Page_HRMS/p_Time entry pending approval'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Check_Entry_Date_Range_at_Time_Pending_Approval/Page_HRMS/input_Me_dateRange'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Check_Entry_Date_Range_at_Time_Pending_Approval/Page_HRMS/button_Custom range'))

WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Check_Entry_Date_Range_at_Time_Pending_Approval/Page_HRMS/td_26'))
WebUI.click(findTestObject('Object Repository/DataPreparationForTimeClock/Check_Entry_Date_Range_at_Time_Pending_Approval/Page_HRMS/td_27'))

WebUI.waitForPageLoad(4)

String Search_Date = WebUI.getAttribute(findTestObject('Object Repository/CheckEntryDate_at_Time_Entry_Pending_Approval/Page_HRMS/input_Me_dateRange'),
	'value')

println('Search Date' + Search_Date)

String[] words = Search_Date.split('-')

String From_Date = words[0]

String To_Date = words[1]

//println((('From Date ' + From_Date) + ' To Date ') + To_Date)

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('/html/body/app-root/app-main/div/div[1]/app-time-clock-request-list/section[2]/div/div[2]/div/div/div/table'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
int columns_count = 0

		int rows_count = rows_table.size()
		boolean is_ok=false;
		println('rows_count ' + rows_count)
		Date date = new SimpleDateFormat("dd-MM-yyyy").parse('9 Apr 1980');

		println('date--------- ' + date +"-------")

//		if (rows_count > 0) {
//			Loop: for (int row = 0; row < rows_count; row++) {
//				List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))
//
//				columns_count = Columns_row.size()
//
//				println('columns_count ' + columns_count)
//
//				if (columns_count > 0) {
//					//println((('Number of Cells In Row ' + row) + ' are ') + columns_count)
//					ColumnLoop: for (int column = 0; column < columns_count; column++) {
//						String celltext = Columns_row.get(7).getText().trim()
//						//DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
//						//Date date = format.parse(celltext);
//
//						//println((((('Cell Value of row number ' + row) + ' and column number ') + column) + ' IS ') + celltext)
//						println(('celltext--------- ' + celltext) + '--From_Date-----'+From_Date)
//						if(!celltext.equals('')){
//							if (celltext.trim().equals(From_Date.trim())) {
//								is_ok = true
//							} else {
//								is_ok = false
//
//								break
//							}
//						}
//					}
//				}
//			}
//		}
//
//		if (!(columns_count > 0)) {
//			println('No Data to test!!!')
//		} else {
//			if (is_ok) {
//				println('All results are ok!!!')
//			} else {
//				println('All results are not ok!!!')
//			}
//		}

		
		