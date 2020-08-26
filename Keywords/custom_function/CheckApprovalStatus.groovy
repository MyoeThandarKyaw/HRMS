package custom_function

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;
import static ansi.*

public class CheckApprovalStatus {
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";

	def CheckStatus(String msg){
		WebDriver driver = DriverFactory.getWebDriver()

		WebElement Table = driver.findElement(By.xpath('/html/body/app-root/app-main/div/div[1]/app-time-clock-history/section[2]/div/div[2]/div/div/div/table'))

		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

		String ExpectedValue = msg
		int columns_count = 0

		int rows_count = rows_table.size()
		boolean is_ok=false;
		//println('rows_count ' + rows_count)

		//println('ExpectedValue--------- ' + ExpectedValue +"-------")

		if (rows_count > 0) {
			Loop: for (int row = 0; row < rows_count; row++) {
				List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

				columns_count = Columns_row.size()

				//println('columns_count ' + columns_count)

				if (columns_count > 0) {
					//println((('Number of Cells In Row ' + row) + ' are ') + columns_count)
					ColumnLoop: for (int column = 0; column < columns_count; column++) {
						String celltext = Columns_row.get(9).getText()

						//println((((('Cell Value of row number ' + row) + ' and column number ') + column) + ' IS ') + celltext)
						//println(('celltext--------- ' + celltext) + '-------')

						if (celltext.contains(ExpectedValue)) {
							is_ok = true
						} else {
							is_ok = false

							break
						}
					}
				}
			}
		}

		if (!(columns_count > 0)) {
			println('No Data to test!!!')
		} else {
			if (is_ok) {
				println('All results are ok!!!')
			} else {
				println('All results are not ok!!!')
			}
		}
	}
}
