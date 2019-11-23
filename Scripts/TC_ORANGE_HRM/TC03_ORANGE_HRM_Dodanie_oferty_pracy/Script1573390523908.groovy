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
 * Uruchomienie modułu admin
 */
WebUI.mouseOver(findTestObject('Object Repository/ORANGE_HRM/Page_INDEX/a_admin_module'))
/*
 * Uruchomienie opcji JOB menu
 */
WebUI.mouseOver(findTestObject('Object Repository/ORANGE_HRM/Page_ADMIN_MODULE/a_admin_job_menu'))
WebUI.click(findTestObject('Object Repository/ORANGE_HRM/Page_ADMIN_MODULE/a_job_job_titles'))
/*
 * UUruchomienie opcji - dodanie nowej ofety pracy
 */
WebUI.click(findTestObject('Object Repository/ORANGE_HRM/Page_ADMIN_MODULE/button_add_job_titles'))
/*
 * Wpisanie wartosci w polu job title
 */
WebUI.setText(findTestObject('Object Repository/ORANGE_HRM/Page_ADMIN_MODULE/input_job_title'), job_title)
/*
 * Wpisanie wartosci w polu job description
 */
WebUI.setText(findTestObject('Object Repository/ORANGE_HRM/Page_ADMIN_MODULE/textarea_job_desc'), job_desc)
/*
 * Wpisanie wartosci w polu job note
 */
WebUI.setText(findTestObject('Object Repository/ORANGE_HRM/Page_ADMIN_MODULE/textarea_job_note'), job_note)
/*
 * Uruchomienie opcji zapis oferty pracy
 */
WebUI.click(findTestObject('Object Repository/ORANGE_HRM/Page_ADMIN_MODULE/button_save_job'))
/*
 * Sprawdzenie oferty pracy
 */
job_title_element = WebUI.getText(findTestObject('Object Repository/ORANGE_HRM/Page_ADMIN_MODULE/a_job_title'))
assert job_title_expected == job_title_element
/*
 * Uruchomienie opcji usuniecie oferty pracy (zaznaczenie/usuniecie/potwierdzenie)
 */
WebUI.click(findTestObject('Object Repository/ORANGE_HRM/Page_ADMIN_MODULE/checkbox_job_title'))
WebUI.click(findTestObject('Object Repository/ORANGE_HRM/Page_ADMIN_MODULE/button_delete_job_titles'))
WebUI.click(findTestObject('Object Repository/ORANGE_HRM/Page_ADMIN_MODULE/input_dialog_box_ok'))
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
