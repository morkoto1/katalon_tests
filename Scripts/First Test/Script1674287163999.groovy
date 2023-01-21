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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon.com/')

WebUI.rightClick(findTestObject('Page_Katalon Software Quality Management Platform/section_Modern, comprehensive quality manag_7efc63'))

WebUI.click(findTestObject('Page_Katalon Software Quality Management Platform/section_Modern, comprehensive quality manag_7efc63'))

WebUI.click(findTestObject('Page_Katalon Software Quality Management Platform/a_Get started'))

WebUI.setText(findTestObject('Page_Sign up  Katalon Software Quality Mana_03d398/input_Create a Katalon account_user_login'), 
    'hello')

WebUI.setText(findTestObject('Page_Sign up  Katalon Software Quality Mana_03d398/input_Create a Katalon account_user_email'), 
    'hello')

WebUI.setEncryptedText(findTestObject('Page_Sign up  Katalon Software Quality Mana_03d398/input_Valid email is required to activate p_255484'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Sign up  Katalon Software Quality Mana_03d398/body_recaptcha.anchor.Main.init(x22ainputx22,x22bgdatax22,x22x22,x22LyogQW50aS1zcGFtLiBXYW50IHRvIHNheSBoZWxsbz8gQ29udGFjdCAoYmFzZTY0KSBZbTkwWjNWaGNtUXRZMjl1ZEdGamRFQm5iMjluYkdVdVkyOXQgKi8gKGZ1bmN0aW9uKCl7dmFyIG49ZnVuY3Rp'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/div_If there are none, click skip_rc-images_33b6c4'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/img_If there are none, click skip_rc-image-tile-44_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/div_If there are none, click skip_rc-images_33b6c4_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/div_If there are none, click skip_rc-images_33b6c4_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/div_If there are none, click skip_rc-images_33b6c4_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/div_If there are none, click skip_rc-images_33b6c4_1'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  Katalon Software Quality Mana_03d398/input_Do not allow space_sign-up-btn'))

WebUI.closeBrowser()

