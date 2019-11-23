import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
/*
 * Uruchomienie przegladarki oraz strony ze zmiennej url_elearning
 */
WebUI.openBrowser(rawUri=GlobalVariable.url_elearning)
/*
 * Zmiana wielkosci okna
 */
WebUI.maximizeWindow()
/*
 * Klikniecie na obiekt link - obiekt a_Zaloguj
 */
WebUI.click(findTestObject('WSIZ_Elearning/Page_WSIZ_MAIN/a_Zaloguj'))
/*
 * Ustawienie/wpisanie wartosci ze zmiennej user_name dla pola user_name
 */
WebUI.setText(findTestObject('WSIZ_Elearning/Page_WSIZ_MAIN/input_username'), user_name)
/* 
 * Ustawienie/wpisanie wartosci ze zmiennej pwd dla pola password
 */
WebUI.setText(findTestObject('WSIZ_Elearning/Page_WSIZ_MAIN/input_password'), pwd)
/* 
 * Klikniecie na obiekt login_loginbtn
 */
WebUI.click(findTestObject('WSIZ_Elearning/Page_WSIZ_MAIN/input_button_login'))
/*
 * Zatrzymanie skryptu - wartosc ze zmiennej timeDelay 
 */
WebUI.delay(GlobalVariable.time_delay)
/*
 * Sprawdzenie nazwy uzytkownika
 */
String msg_error_elearning = WebUI.getText(findTestObject('WSIZ_Elearning/Page_WSIZ_MAIN/span_Niewlasciwa_nazwa_uzytkownika'))
assert msg_error_expected == msg_error_elearning
/*
 * Zamkniecie przegladarki
 */
WebUI.closeBrowser()
