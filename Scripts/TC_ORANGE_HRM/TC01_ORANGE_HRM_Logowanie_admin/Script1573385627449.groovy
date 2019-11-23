import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
/*
 * Uruchomienie przeglądarki z adresem
 */
WebUI.openBrowser(rawUri = GlobalVariable.url_login)
/*
 * Zmiana rozmiaru okna
 */
WebUI.maximizeWindow()
/*
 * Wpisanie wartosci user_name do pola nazwa uzytkownika
 */
WebUI.setText(findTestObject('ORANGE_HRM/Page_LOGIN/input_username'), GlobalVariable.user_name)
/*
 * Wpisanie wartosci pwd do pola hasło uzytkownika
 */
WebUI.setEncryptedText(findTestObject('ORANGE_HRM/Page_LOGIN/input_pwd'), GlobalVariable.user_pwd)
/*
 * Uruchomienie opcji logowania
 */
WebUI.click(findTestObject('ORANGE_HRM/Page_LOGIN/button_login'))
/*
 * Pobranie infomracje o uzytkowniku
 */
user_msg_element = WebUI.getText(findTestObject('Object Repository/ORANGE_HRM/Page_INDEX/a_welcome_user'))
/*
 * Weryfikacja informacji o uzytkowniku
 */
assert user_msg_expected == user_msg_element
/*
 * Wylogowanie uzytkownika
 */
WebUI.click(findTestObject('Object Repository/ORANGE_HRM/Page_INDEX/a_welcome_user'))
WebUI.mouseOver(findTestObject('Object Repository/ORANGE_HRM/Page_INDEX/a_logout'))
WebUI.click(findTestObject('Object Repository/ORANGE_HRM/Page_INDEX/a_logout'))
/*
 * Zamkniecie przegladarki
 */
WebUI.closeBrowser()
