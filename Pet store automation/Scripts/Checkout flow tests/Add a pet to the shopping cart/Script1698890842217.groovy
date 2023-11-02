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

WebUI.click(findTestObject('Home_Page/sidebar_Fish'))

productID = WebUI.getText(findTestObject('ProductInformation_Page/a_ProductID'))

WebUI.click(findTestObject('ProductInformation_Page/a_ProductID'))

itemID = WebUI.getText(findTestObject('ProductInformation_Page/a_itemID'))

WebUI.click(findTestObject('ProductInformation_Page/a_itemID'))

productName = WebUI.getText(findTestObject('ProductInformation_Page/table_ProductName'))

productPrice = WebUI.getText(findTestObject('ProductInformation_Page/table_Price'))

WebUI.click(findTestObject('ProductInformation_Page/button_AddToCart'))

WebUI.verifyElementText(findTestObject('ShoppingCart_Page/cart_ItemID'), itemID, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ShoppingCart_Page/cart_ProductID'), productID, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ShoppingCart_Page/cart_ProductName'), productName, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ShoppingCart_Page/cart_ListPrice'), productPrice, FailureHandling.STOP_ON_FAILURE)

