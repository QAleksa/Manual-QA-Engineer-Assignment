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

CustomKeywords.'petStorePackage.performLogin.login'()

WebUI.verifyElementPresent(findTestObject('Navigation_bar/button_Sign Out'), 0)

WebUI.click(findTestObject('Home_Page/sidebar_Fish'))

WebUI.click(findTestObject('ProductInformation_Page/a_ProductID'))

WebUI.click(findTestObject('ProductInformation_Page/a_itemID'))

WebUI.click(findTestObject('ProductInformation_Page/button_AddToCart'))

WebUI.click(findTestObject('ShoppingCart_Page/button_ProceedToCheckout'))

WebUI.clearText(findTestObject('Checkout_Page/input_CardNumber'))

WebUI.clearText(findTestObject('Checkout_Page/input_ExpiryDate'))

WebUI.clearText(findTestObject('Checkout_Page/input_FirstName'))

WebUI.clearText(findTestObject('Checkout_Page/input_LastName'))

WebUI.clearText(findTestObject('Checkout_Page/input_Address1'))

WebUI.clearText(findTestObject('Checkout_Page/input_Address2'))

WebUI.clearText(findTestObject('Checkout_Page/input_City'))

WebUI.clearText(findTestObject('Checkout_Page/input_State'))

WebUI.clearText(findTestObject('Checkout_Page/input_ZipCode'))

WebUI.clearText(findTestObject('Checkout_Page/input_Country'))

WebUI.click(findTestObject('Checkout_Page/button_Continue'))

WebUI.comment('Test case is passing because there is no field validation for mandatory fields, however after continuing the flow error 500 will be displayed')

WebUI.click(findTestObject('Checkout_Page/button_Confirm'))

