package pages;

public class Terms_of_license{
    //LOGO
    private static final String logo = "//img[@class='rainbird-app-logo']";
    //PAGE TITLE
    private static final String page_title_image = "//div[@class='header-right']";
    private static final String page_title_text = "//div[@class='header-right']//span[text()='Create New Account']";
    //LANGUAGE SELECTION
    private static final String language_selection_label = "//label[text()='Change Language']";
    private static final String language_selection = "//select[@id='language']";
    private static final String english = "//option[text()='English']";
    private static final String french = "//option[text()='français']";
    private static final String italian = "//option[text()='italiano']";
    private static final String portuguese  = "//option[text()='português']";
    private static final String german = "//option[text()='Deutsche']";
    private static final String spanish = "//option[text()='Español']";
    //CHECKBOX INSTRUCTION
    private static final String checkbox_instruction = "//span[text()='Click the checkbox to accept the terms of the License Agreement:']";
    //TERM OF LICENSE AGREEMENT
    private static final String terms_agreement_checkbox = "//input[@id='required-checkbox']";
    private static final String user_consent = "//span[text()='I accept Rain Bird’s license']";
    //ACCEPT BUTTON
    private static final String accept_button = "//input[@id='accept-button']";
}
