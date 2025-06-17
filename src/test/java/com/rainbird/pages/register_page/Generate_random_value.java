package com.rainbird.pages.register_page;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generate_random_value {

    Random random = new Random();
    Register.Account_Information account_information = new Register.Account_Information();
    Register.Preferences preferences = new Register.Preferences();
    Register.Terms_of_license license = new Register.Terms_of_license();

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
    public String Random_account_name_option_xpath(){
        List<Character> lowercase_alphabetic_char = new ArrayList<>();
        List<Character> uppercase_alphabetic_char = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        List<Character> special_character = new ArrayList<>();
        String special_char = " !@#$%^&*()_+-=[]{}|;:'\",.<>?/\\`~";

        //GENERATE ABOVE LISTS
        for (char c = 'a';c<='z';c++){
            lowercase_alphabetic_char.add(c);
        }
        for (char c = 'A';c<='Z';c++){
            uppercase_alphabetic_char.add(c);
        }
        for (int numb = 0;numb<=9;numb++){
            number.add(numb);
        }
        for (char c: special_char.toCharArray()){
            special_character.add(c);
        }
        //INDEX
        int alphabetic_char_index = random.nextInt(0,lowercase_alphabetic_char.size());
        int number_index = random.nextInt(0,number.size());
        int special_char_index = random.nextInt(0,special_character.size());
        //GENERATE A RANDOM STRING
        return "" + lowercase_alphabetic_char.get(alphabetic_char_index) + uppercase_alphabetic_char.get(alphabetic_char_index) + number.get(number_index) + special_character.get(special_char_index);
    }

}
