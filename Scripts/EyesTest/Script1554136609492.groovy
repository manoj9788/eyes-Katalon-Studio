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
import com.kms.katalon.core.webui.driver.DriverFactory as DF

import internal.GlobalVariable as GlobalVariable

import com.applitools.eyes.selenium.Eyes as Eyes
import com.applitools.eyes.RectangleSize as RectangleSize

import org.openqa.selenium.WebDriver as WebDriver


WebUI.openBrowser('')

Eyes eyes = new Eyes()

eyes.setApiKey("YOUR-KEY")

WebDriver innerDriver = DF.getWebDriver()

eyes.open(innerDriver,"AppName", "TestName", new RectangleSize(1200,700))

WebUI.navigateToUrl('https://applitools.com/helloworld')

WebUI.click(findTestObject('Object Repository/Page_Applitools/button_Click me'))

eyes.checkWindow()

eyes.close()
eyes.abortIfNotClosed()
WebUI.closeBrowser()

