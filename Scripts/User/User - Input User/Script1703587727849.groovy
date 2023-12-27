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

Mobile.startApplication('C:\\Users\\Briyan PC\\Downloads\\kasirAja_311222.apk', true)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (19)'), 'qashop@gmail.com', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/android.widget.EditText (20)'), 'iGDxf8hSRT4=', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (9)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - pengguna (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (10)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - nama'), 'Hiruma Yoruichi', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - email'), 'hirumayoruichi@gmail.com', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/android.widget.EditText - password'), 'iGDxf8hSRT4=', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (11)'), 0)

Mobile.getText(findTestObject('Object Repository/android.widget.TextView - Hiruma Yoruichi'), 0)

Mobile.closeApplication()

