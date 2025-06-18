package com.rainbird.utils.custom_data;

import com.github.javafaker.Faker;
import com.rainbird.pages.register_page.Register;

import java.util.Random;

public class Generate_random_value {

    Random random = new Random();
    Register.Account_Information account_information = new Register.Account_Information();
    Register.Preferences preferences = new Register.Preferences();
    Register.Terms_of_license license = new Register.Terms_of_license();
    Faker fake = new Faker();

    public String Random_country_option_xpath(){
        int random_index = random.nextInt(1,141);
        return account_information.Select_country_by_index_value(random_index);
    }
    public String Random_timezone_option_xpath(){
        int random_index = random.nextInt(1,143);
        return account_information.Select_timezone_by_index_value(random_index);
    }
    public String Random_language_option_xpath(){
        int random_index = random.nextInt(1,13);
        return preferences.Select_language_by_index_value(random_index);
    }
    public String Random_unit_volume_option_xpath(){
        int random_index = random.nextInt(1,6);
        return preferences.Select_unit_volume_by_index_value(random_index);
    }
    public String Random_unit_area_option_xpath(){
        int random_index = random.nextInt(1,5);
        return preferences.Select_unit_area_by_index_value(random_index);
    }
    public String Random_date_format_option_xpath(){
        int random_index = random.nextInt(1,9);
        return preferences.Select_date_format_by_index_value(random_index);
    }
    public String Random_time_format_option_xpath(){
        int random_index = random.nextInt(1,4);
        return preferences.Select_time_format_by_index_value(random_index);
    }

    public String Random_valid_username(){
        return fake.name().username();
    }
    public String Random_address(){
        return fake.address().streetAddress();
    }
    public String Random_city(){
        return fake.address().city();
    }
    public String Random_zipcode(){
        return fake.address().zipCode();
    }
    public String Random_contact_name(){
        return fake.name().name();
    }
    public String Random_valid_password(){
        return fake.internet().password(8,15,true,true,true);
    }
    public String Random_full_character_password(int minimum_length,int maximum_length,boolean... extra){

        if (minimum_length == 0 || maximum_length == 0 || extra.length == 0){
            return fake.internet().password();
        }
        else if (extra.length == 1){
            return fake.internet().password(minimum_length,maximum_length,extra[0]);
        }else{
            return fake.internet().password(minimum_length,maximum_length,true,true,true);
        }
    }
//    public String Random_account_name_option_xpath(int number_lowercase_letter, int number_uppercase_letter, int numb_number,int spec_char){
//        List<Character> lowercase_letter = new ArrayList<>();
//        List<Character> uppercase_letter = new ArrayList<>();
//        List<Character> number = new ArrayList<>();
//        List<Character> special_character = new ArrayList<>();
//        List<Character> random_string = new ArrayList<>();
//        String special_char = " !@#$%^&*()_+-=[]{}|;:'\",.<>?/\\`~";
//
//        //GENERATE ABOVE LISTS
//        for (char c = 'a';c<='z';c++){
//            lowercase_letter.add(c);
//        }
//        for (char c = 'A';c<='Z';c++){
//            uppercase_letter.add(c);
//        }
//        for (char numb = '0';numb<='9';numb++){
//            number.add(numb);
//        }
//        for (char c: special_char.toCharArray()){
//            special_character.add(c);
//        }
//        //GENERATE A RANDOM STRING
//        for (int letter = 0;letter <= number_lowercase_letter;letter++){
//            random_string.add(lowercase_letter.get(random.nextInt(lowercase_letter.size())));
//        }
//        for (int letter = 0;letter <= number_uppercase_letter;letter++){
//            random_string.add(uppercase_letter.get(random.nextInt(lowercase_letter.size())));
//        }
//        for (int numb = 0;numb <= numb_number;numb++){
//            random_string.add(number.get(random.nextInt(number.size())));
//        }
//        for (int char_number = 0;char_number <= spec_char;char_number++){
//            random_string.add(random_string.get(random.nextInt(special_character.size())));
//        }
//        for
//    }
}
