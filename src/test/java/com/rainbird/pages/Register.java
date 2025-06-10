package com.rainbird.pages;

public class Register {
    public static class Register_miscellaneous_section {
    //LOGO
    public final String top_logo = "//img[@class='rainbird-app-logo']";
    public final String bottom_logo = "//div[@class='footer-left']";
    //PAGE TITLE
    public final String registration_title_image = "//div[@class='header-right']";
    public final String registration_title_text = "//div[@class='header-right']//span[text()='Create New Account']";
    public final String registration_right = "//div[@class='footer-left']";
    //REGISTRATION FORM
    public
 final String registration_header = "//h2[contains(@class,'pageHeader')]";
    public
 final String registration_info = "//p[@class='page-info']";
    }
    public static class Register_Account_Information{

        //ACCOUNT INFORMATION FILLING SECTIONS
            //LABEL OF FIELD
        public final String select_country_label = "//label[@class ='control-label required' and text()='Select Country']";
        public final String select_timezone_label = "//label[@class='control-label required' and @for='TimeZone']";
        public final String account_name_label = "//label[@class='control-label required' and @for='Name']";
        public final String address_label = "//label[@class='control-label required' and @for='Address']";
        public final String city_label = "//label[@class='control-label required' and @for='City']";
        public final String postal_code_label = "//label[@class='control-label required' and @for='Zip']";
        public final String state_label = "//label[@class='control-label required' and @for='State']";

            //INPUT FIELD
        public final String account_name = "//input[@id='Name']";
        public final String account_name_tooltip = "//i[@class='icon icon-icon-info']";
        public final String address = "//input[@id='Address']";
        public final String city = "//input[@id='City']";
        public final String postal_code = "//input[@id='Zip']";
        public final String state = "//select[@id='state-dropdown']";

            //SELECT COUNTRY BY VALUE ATTRIBUTE
        /**
        * SELECT COUNTRY BY VALUE ATTRIBUTE:
        * Interact with <option> tag by using VALUE
        * The parameter must be TWO CHARACTERS
        */
        public static String select_Country_by_value(String country_value){
            return  "//select[@id='country-select']/option[@value='" + country_value +"']";
        }
        //SELECT COUNTRY WITH EXACT LANGUAGE

        public static String select_Country_by_text(String language){
            return "//select[@id='country-select']/option[text()='" + language + "']";
        }

        //SELECT TIMEZONE BY VALUE ATTRIBUTE
        public static String select_Timezone_by_value(String timezone){
            return "//select[@id='TimeZoneId']/option[@value='" + timezone  + " Standard Time']";
        }
    }
    public static class Register_Contact_and_Login_Information{

        //LABEL OF FIELD
        public final String contact_name_label = "//label[@for='ContactName']";
        public final String phone_number_label = "//label[@for='Phone']";
        public final String email_label = "//label[@for='Email']";
        public final String confirm_email_label = "//label[@for='ConfirmEmail']";
        public final String username_label = "//label[@for='UserName']";
        public final String password_label = "//label[@for='Password']";
        public final String confirm_password_label = "//label[@for='ConfirmPassword']";

        //INPUT FIELD
        public final String contact_name = "//input[@id='ContactName']";
        public final String phone_number = "//input[@id='Phone']";
        public final String email = "//input[@id='Email']";
        public final String confirm_email = "//input[@id='ConfirmEmail']";
        public final String username = "//input[@id='UserName']";
        public final String password = "//input[@id='password']";
        public final String confirm_password = "//input[@id='confirm-password']";

        //ICON EYE
        public final String password_eye_icon_on = "//div[@id='password-input']/span/i[@class='icon icon-eye show_icon']";
        public final String password_eye_icon_off = "//div[@id='password-input']/span/i[@class='icon icon-eye-off hide_icon']";
        public final String confirm_password_eye_icon_on = "//div[@id='confirm-password-input']/span/i[@class='icon icon-eye show_icon']";
        public final String confirm_password_eye_icon_off = "//div[@id='confirm-password-input']/span/i[@class='icon icon-eye-off hide_icon']";

        //PASSWORD SECTION
        public final String password_error = "//div[@id='password-error']";
        public final String password_instruction = "//div[contains(@class,'password-info')]";
        public final String password_autocomplete = "//div[@id='password-input']/input[@autocomplete='new-password']";

        //CONFIRM PASSWORD SECTION
        public final String confirm_password_error = "//div[@id='confirm-password-error']";
    }
    public static class Register_Preferences{
        //LABEL OF FIELD
        public final String select_language_label = "//label[@for='CultureId']";
        public final String select_unit_of_volume_label = "//label[@for='UnitsId']";
        public final String select_unit_of_area_label = "//label[@for='AreaFormat']";
        public final String select_date_of_format_label = "//label[@for='DateFormatId']";
        public final String select_time_format_label = "TimeFormatId";
        public final String required_field_label = "//div[text()='*Required fields']";
        public final String required_field_content_label = "//label[@for='ReceiveMarketingMsg']";

        //SELECT FIELD
        public final String select_language = "//select[@id='language-select']";
        public final String select_unit_of_volume = "//select[@id='UnitsId']";
        public final String select_unit_of_area = "//select[@id='AreaFormat']";
        public final String select_date_of_format = "//select[@id='DateFormatId']";
        public final String select_time_format = "//select[@id='TimeFormatId']";
        public final String required_field_consent_checkbox= "//input[@id='ReceiveMarketingMsg']";
        public final String cancel_button = "//input[@type='button' and @value='Cancel']";
        public final String register_button = "//input[@type='submit' and @value='Register']";

         /**
          * SELECT LANGUAGE WITH LANGUAGE NUMBER:
          * - 1031 : GERMAN
          * - 1033 : ENGLISH
          * - 1036 : FRENCH
          * - 1040 : ITALIAN
          * - 1041 : JAPANESE
          * - 1042 : KOREAN
          * - 1053 : SWEDISH
          * - 1066 : VIETNAMESE
          * - 2052 : CHINESE
          * - 2070 : PORTUGUESE
          * - 3082 : SPANISH
          * */
        public static String select_Language(int language_number){
            return "//select[@id='language-select']/option[@value='" + language_number +"']";
        }
        /**
         * SELECT UNIT OF VOLUME BY VALUE:
         * - 1 : Metric 1: (L/s)
         * - 2 : Metric 2: (m³/hr)
         * - 3 : Metric 3: (L/min)
         * - 0 : U.S.: (gal/min)
         * */
        public static String select_Unit_of_Volume(int unit_of_volume_value_number){
            return "//select[@id='UnitsId']/option[@value='" + unit_of_volume_value_number +"']";
        }
        /**
         * SELECT UNIT OF AREA BY VALUE:
         * - 1 : yd²
         * - 2 : m²
         * - 0 : ft²
         * */
        public static String select_Unit_of_Area(int unit_of_area_value_number){
            return "//select[@id='AreaFormat']/option[@value='"+ unit_of_area_value_number +"']";
        }
        /**
         * SELECT DATE FORMAT BY VALUE:
         * - 0 : MM-DD-YYYY
         * - 1 : MM/DD/YYYY
         * - 2 : MM.DD.YYYY
         * - 3 : DD-MM-YYYY
         * - 4 : DD/MM/YYYY
         * - 5 : DD.MM.YYYY
         * - 6 : YYYY/MM/DD
         * */
        public static String select_Date_Format(int date_format_value_number){
            return "//select[@id='DateFormatId']/option[@value='" + date_format_value_number +"']";
        }
        /**
         * SELECT TIME FORMAT BY VALUE:
         * - 0 : AM / PM
         * - 1 : 24 Hours
         * */
        public static String select_Time_Format(int time_format_value_number){
            return "//select[@id='TimeFormatId']/option[@value='" + time_format_value_number + "']";
        }
    }
}
