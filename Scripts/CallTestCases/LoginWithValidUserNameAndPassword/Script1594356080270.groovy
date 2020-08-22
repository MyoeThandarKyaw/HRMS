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
import com.kms.katalon.core.testdata.InternalData

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://hrms.ahtaroo.com/#/login')
//
//WebUI.setText(findTestObject('Object Repository/LoginWithValidUserNameAndPassword/Page_HRMS/input_HRMS_username'), demo_usn)
//
//WebUI.setText(findTestObject('Object Repository/LoginWithValidUserNameAndPassword/Page_HRMS/input_HRMS_password'), demo_pwd)
//
//WebUI.click(findTestObject('Object Repository/LoginWithValidUserNameAndPassword/Page_HRMS/button_Login'))

InternalData data = findTestData("TestLogin_Data")  
for(def index : (0..data.getRowNumbers()-1)) {
	 WebUI.openBrowser('')
	 WebUI.navigateToUrl('https://hrms.ahtaroo.com/#/login')	 
	 WebUI.setText(findTestObject('Object Repository/LoginWithValidUserNameAndPassword/Page_HRMS/input_HRMS_username'),data.internallyGetValue("demo_usn", index)) 
	 WebUI.setText(findTestObject('Object Repository/LoginWithValidUserNameAndPassword/Page_HRMS/input_HRMS_password'), data.internallyGetValue("demo_pwd", index))
	 WebUI.click(findTestObject('Object Repository/LoginWithValidUserNameAndPassword/Page_HRMS/button_Login'))
	 WebUI.maximizeWindow()
	 }