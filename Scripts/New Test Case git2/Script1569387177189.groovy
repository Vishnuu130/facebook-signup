import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.airasia.com/')

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/div_Youre going to love our dealsGet low fares to over 150 destinations'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/div_25'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/div_29'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/span_Search_arrow-down'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/span_Above 12 years_plus-icon'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/span_Above 12 years_plus-icon'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/span_Above 12 years_plus-icon'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/span_Above 12 years_plus-icon'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/span_Above 12 years_plus-icon'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/span_Child_plus-icon'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/button_Done'))

WebUI.click(findTestObject('Object Repository/Page_Book Flights Hotels  Activities Online  AirAsia/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Select Cheap Flights Tickets  AirAsia/div_Depart Chennai to Changsha Modify open a new popup'))

WebUI.closeBrowser()

