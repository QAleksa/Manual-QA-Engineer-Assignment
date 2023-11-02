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

int RN = ((Math.random() * 30000000) as int)

userID = ('tester' + RN)

WebUI.waitForElementPresent(findTestObject('Navigation_bar/button_Sign In'), 0)

WebUI.click(findTestObject('Navigation_bar/button_Sign In'))

WebUI.click(findTestObject('SignIn_Page/button_RegisterNow'))

WebUI.setText(findTestObject('Register_Page/input_UserID'), userID)

WebUI.setText(findTestObject('Register_Page/input_NewPassword'), GlobalVariable.password)

WebUI.setText(findTestObject('Register_Page/input_RepeatPassword'), GlobalVariable.password)

WebUI.setText(findTestObject('Register_Page/input_FirstName'), GlobalVariable.firstName)

WebUI.setText(findTestObject('Register_Page/input_LastName'), GlobalVariable.lastName)

WebUI.setText(findTestObject('Register_Page/input_Email'), GlobalVariable.email)

WebUI.setText(findTestObject('Register_Page/input_Phone'), GlobalVariable.phone)

WebUI.setText(findTestObject('Register_Page/input_Address1'), GlobalVariable.address1)

WebUI.setText(findTestObject('Register_Page/input_Address2'), GlobalVariable.address2)

WebUI.setText(findTestObject('Register_Page/input_City'), GlobalVariable.city)

WebUI.setText(findTestObject('Register_Page/input_State'), GlobalVariable.state)

WebUI.setText(findTestObject('Register_Page/input_ZipCode'), GlobalVariable.zipCode)

WebUI.setText(findTestObject('Register_Page/input_Country'), GlobalVariable.country)

WebUI.click(findTestObject('Register_Page/button_SaveAccountInformation'))

WebUI.verifyElementPresent(findTestObject('Home_Page/img_MainImage'), 0)

WebUI.click(findTestObject('Navigation_bar/button_Sign In'))

WebUI.click(findTestObject('SignIn_Page/button_RegisterNow'))

WebUI.setText(findTestObject('Register_Page/input_UserID'), userID)

WebUI.setText(findTestObject('Register_Page/input_NewPassword'), GlobalVariable.password)

WebUI.setText(findTestObject('Register_Page/input_RepeatPassword'), GlobalVariable.password)

WebUI.click(findTestObject('Register_Page/button_SaveAccountInformation'))

WebUI.verifyElementNotPresent(findTestObject('Home_Page/img_MainImage'), 0)

WebUI.comment('Test case is passing because user is not successfully registered, however error message "User ID already exists" should be displayed.')

