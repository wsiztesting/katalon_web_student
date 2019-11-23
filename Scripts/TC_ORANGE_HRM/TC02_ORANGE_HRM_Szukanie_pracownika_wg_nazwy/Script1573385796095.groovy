import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ResponseObject
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
 * Uruchomienie modulu PIM
 */
WebUI.mouseOver(findTestObject('Object Repository/ORANGE_HRM/Page_INDEX/a_pim_module'))
WebUI.click(findTestObject('Object Repository/ORANGE_HRM/Page_INDEX/a_pim_module'))
/*
 * Wpisanie wartosci employee_name w polu Employee Name
 */
WebUI.setText(findTestObject('Object Repository/ORANGE_HRM/Page_PIM_MODULE/input_employee_name'), employee_name_search)
/*
 * Uruchomienie wyszukiwania pracownika
 */
WebUI.click(findTestObject('Object Repository/ORANGE_HRM/Page_PIM_MODULE/button_search'))
/*
 * Wyswietlenie opisu pracownika
 */
WebUI.click(findTestObject('Object Repository/ORANGE_HRM/Page_PIM_MODULE/a_id_employee'))
/*
 * Pobranie nazwy pracownika
 */
employee_name_element = WebUI.getText(findTestObject('Object Repository/ORANGE_HRM/Page_PIM_MODULE/str_employee_name'))
/*
 * Weryfikacja nazwy uzytkownika na profilu
 */
assert employee_name_expected == employee_name_element
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