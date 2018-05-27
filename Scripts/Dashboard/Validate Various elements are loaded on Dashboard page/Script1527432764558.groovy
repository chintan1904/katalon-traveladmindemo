import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/admin')

WebUI.setText(findTestObject('Page_Administator Login/input_email'), 'admin@phptravels.com')

WebUI.setText(findTestObject('Page_Administator Login/input_password'), 'demoadmin')

WebUI.click(findTestObject('Page_Administator Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_CMS'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Accounts'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Locations'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/button_Send Newsletter'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Profile'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Bookings'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/div_Revenue Chart'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/div_Booking Summary'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Updates'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/button_Bookings'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/button_ CMS Pages'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Log Out'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/button_Blog'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Blog'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Help'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Newsletter'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Tours'), 30);
WebUI.verifyElementPresent(findTestObject('Page_Dashboard/div_Recent Bookings'), 30);


WebUI.closeBrowser()
