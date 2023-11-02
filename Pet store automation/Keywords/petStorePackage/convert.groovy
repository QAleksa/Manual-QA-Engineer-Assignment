package petStorePackage
import com.kms.katalon.core.annotation.Keyword



class convert {

	@Keyword
	def stringToDouble(string) {
		// Remove non-numeric characters
		def cleanStr = string.replaceAll(/[^0-9]/, '')

		def result = cleanStr.toFloat()

		return result
	}
}