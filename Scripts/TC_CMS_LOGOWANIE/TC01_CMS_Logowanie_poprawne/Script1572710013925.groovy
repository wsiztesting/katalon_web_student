import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
/*
 * Uruchomienie przegladarki
 */
WebUI.openBrowser(rawUri=url_login)
/*
 * Zmiana wielkosci okna
 */
WebUI.maximizeWindow()
/*
 * Dodanie wartosci do pola nazwa uzytkownika
 */
WebUI.setText(findTestObject('CMS/Page_CMS_LOGIN/inp_user_name'), user_name)

/*
 * Dodanie wartosci do pola haslo
 */
WebUI.setEncryptedText(findTestObject('CMS/Page_CMS_LOGIN/inp_pwd'), pwd)
/*
 * Uruchomienie opcji logowanie
 */
WebUI.click(findTestObject('CMS/Page_CMS_LOGIN/btn_login'))
/*
 * Uruchomienie menu 
 */
WebUI.click(findTestObject('CMS/Page_CMS_ADMIN_CMS/nav_cms_menu'))
/*
 * Uruchomienie opcji wylogowanie uzytkownika
 */
WebUI.click(findTestObject('CMS/Page_CMS_ADMIN_CMS/a_logout'))
/*
 * Zamkniecie przegladarki
 */
WebUI.closeBrowser()