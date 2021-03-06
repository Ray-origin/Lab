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

WebUI.openBrowser('')

'web chay được trên trình duyệt egde'
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/?fbclid=IwAR0MrbqGBNCmb0K-VxxPPdGdk1dJSR_ezl316t0a9rVr-5s0lTwjD2qjdfM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment (4)'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username (4)'), 'JohnDoe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password (4)'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.sendKeys(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password (4)'), Keys.chord(
        Keys.ENTER))

WebUI.closeBrowser()

