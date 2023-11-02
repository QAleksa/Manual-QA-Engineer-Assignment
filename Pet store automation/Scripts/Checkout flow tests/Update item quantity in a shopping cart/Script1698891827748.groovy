import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Home_Page/sidebar_Fish'))

WebUI.click(findTestObject('ProductInformation_Page/a_ProductID'))

WebUI.click(findTestObject('ProductInformation_Page/a_itemID'))

WebUI.click(findTestObject('ProductInformation_Page/button_AddToCart'))

WebUI.setText(findTestObject('ShoppingCart_Page/input_Quantity'), quantity)

WebUI.click(findTestObject('ShoppingCart_Page/button_UpdateCart'))

listPrice = WebUI.getText(findTestObject('ShoppingCart_Page/cart_ListPrice'))

singlePrice = CustomKeywords.'petStorePackage.convert.stringToDouble'(listPrice)

totalCost = WebUI.getText(findTestObject('ShoppingCart_Page/cart_TotalCost'))

totalPrice = CustomKeywords.'petStorePackage.convert.stringToDouble'(totalCost)

def expectedTotalPrice = singlePrice * quantity.toInteger()

if (expectedTotalPrice == totalPrice) {
    KeywordUtil.markPassed('Total cost is calculated correctly. Test case is passed.')
} else {
    KeywordUtil.markFailed('Total cost is not calculated correctly. Test case is failed.')
}