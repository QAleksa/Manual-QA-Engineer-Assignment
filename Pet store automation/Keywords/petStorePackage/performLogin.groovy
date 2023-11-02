package petStorePackage
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

class performLogin {

	@Keyword
	def login() {
		WebUI.waitForElementPresent(findTestObject('Navigation_bar/button_Sign In'), 0)

		WebUI.click(findTestObject('Navigation_bar/button_Sign In'))

		WebUI.setText(findTestObject('SignIn_Page/input_Username'), GlobalVariable.validUsername)

		WebUI.setText(findTestObject('SignIn_Page/input_Password'), GlobalVariable.validPassword)

		WebUI.click(findTestObject('SignIn_Page/button_Login'))
	}
}