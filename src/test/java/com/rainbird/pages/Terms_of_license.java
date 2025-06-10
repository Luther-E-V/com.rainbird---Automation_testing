package com.rainbird.pages;

public class Terms_of_license{
    //LOGO
    public final String logo = "//img[@class='rainbird-app-logo']";
    //PAGE TITLE
    public final String page_title_image = "//div[@class='header-right']";
    public final String page_title_text = "//div[@class='header-right']//span[text()='Create New Account']";
    //LANGUAGE SELECTION
    public final String language_selection_label = "//label[text()='Change Language']";
    public final String language_selection = "//select[@id='language']";
    public final String english = "//option[text()='English']";
    public final String french = "//option[text()='français']";
    public final String italian = "//option[text()='italiano']";
    public final String portuguese  = "//option[text()='português']";
    public final String german = "//option[text()='Deutsche']";
    public final String spanish = "//option[text()='Español']";
    //CHECKBOX INSTRUCTION
    public final String checkbox_instruction = "//span[text()='Click the checkbox to accept the terms of the License Agreement:']";
    //TERM OF LICENSE AGREEMENT
    public final String terms_agreement_checkbox = "//input[@id='required-checkbox']";
    public final String user_consent = "//span[text()='I accept Rain Bird’s license']";
    //ACCEPT BUTTON
    public final String accept_button = "//input[@id='accept-button']";
}
