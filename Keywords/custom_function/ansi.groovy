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
//import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ansi {
	static final String NORMAL          = "\u001B[0m"

	static final String BOLD            = "\u001B[1m"
	static final String ITALIC          = "\u001B[3m"
	static final String UNDERLINE       = "\u001B[4m"
	static final String BLINK           = "\u001B[5m"
	static final String RAPID_BLINK     = "\u001B[6m"
	static final String REVERSE_VIDEO   = "\u001B[7m"
	static final String INVISIBLE_TEXT  = "\u001B[8m"

	static final String BLACK           = "\u001B[30m"
	static final String RED             = "\u001B[31m"
	static final String GREEN           = "\u001B[32m"
	static final String YELLOW          = "\u001B[33m"
	static final String BLUE            = "\u001B[34m"
	static final String MAGENTA         = "\u001B[35m"
	static final String CYAN            = "\u001B[36m"
	static final String WHITE           = "\u001B[37m"

	static final String DARK_GRAY       = "\u001B[1;30m"
	static final String LIGHT_RED       = "\u001B[1;31m"
	static final String LIGHT_GREEN     = "\u001B[1;32m"
	static final String LIGHT_YELLOW    = "\u001B[1;33m"
	static final String LIGHT_BLUE      = "\u001B[1;34m"
	static final String LIGHT_PURPLE    = "\u001B[1;35m"
	static final String LIGHT_CYAN      = "\u001B[1;36m"

	static String color(String text, String ansiValue) {
		ansiValue + text + NORMAL
	}
	public static void main(String []args){
		System.out.println("All result are  ok!")
	}
}
