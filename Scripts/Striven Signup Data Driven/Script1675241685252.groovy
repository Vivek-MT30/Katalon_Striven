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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.test.striven.com/Security/Signup.aspx')

WebUI.setText(findTestObject('Object Repository/Page_Striven/input_FIRST NAME_ctl00mainContenttxtFirstName'), FirstName)

WebUI.setText(findTestObject('Object Repository/Page_Striven/input_LAST NAME_ctl00mainContenttxtLastName'), LastName)

WebUI.setText(findTestObject('Object Repository/Page_Striven/input_EMAIL_ctl00mainContenttxtEmail'), EmailId)

WebUI.click(findTestObject('Object Repository/Page_Striven/input_EMAIL_ctl00mainContentbtnStart_input'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Company Name_ctl00ctl00mainContentCon_7609b5'), FirstName)

not_run: WebUI.verifyElementText(findTestObject('Page_Striven/Striven link'), 'Pooja1234')

WebUI.click(findTestObject('Object Repository/Page_/input_test.striven.com_ctl00ctl00mainConten_d264b4'))

WebUI.setText(findTestObject('Object Repository/Page_/input_land Islands_ctl00ctl00mainContentCon_c07fc0'), MobileNumber)

WebUI.click(findTestObject('Object Repository/Page_/input_test.striven.com_ctl00ctl00mainConten_d264b4'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Skip and Add Later'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/img_Striven Website_img-circle'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_My Info'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Info/a_Poojaagan.com'), EmailId)

WebUI.closeBrowser()

