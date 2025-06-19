package com.rainbird.utils.custom_data;

import com.github.javafaker.Faker;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Generate_random_value {

    Random random = new Random();
    Faker fake = new Faker();

    public String Random_valid_username(){
        return fake.name().username();
    }
    public String Random_address(){
        return fake.address().streetAddress();
    }
    public String Random_city(){
        return fake.address().city();
    }
    public String Random_postal_code(){
        return fake.address().zipCode();
    }
    public String Random_contact_name(){
        return fake.name().name();
    }
    public String Random_phone_number(){
        return fake.phoneNumber().phoneNumber().replaceAll("\\D","");
    }
    public String Random_valid_password(){
        List<Character> lowercase_letter = new ArrayList<>();
        List<Character> uppercase_letter = new ArrayList<>();
        List<Character> number = new ArrayList<>();
        List<Character> special_character = new ArrayList<>();
        List<Character> master_list = new ArrayList<>();
        String special_char = " !@#$%^&*()_+-=[]{}|;:'\",.<>?/\\`~";
        int password_length = random.nextInt(8,16);

        //GENERATE ABOVE LISTS
        for (char c = 'a';c<='z';c++) lowercase_letter.add(c);
        for (char c = 'A';c<='Z';c++) uppercase_letter.add(c);
        for (char numb = '0';numb<='9';numb++) number.add(numb);
        for (char c: special_char.toCharArray()) special_character.add(c);

        //GENERATE PASSWORD
        master_list.addAll(lowercase_letter);
        master_list.addAll(uppercase_letter);
        master_list.addAll(number);
        //ENSURE VALID PASSWORD ALWAYS INCLUDE 1 SPECIAL CHARACTER
        List<Character> valid_password_list = new ArrayList<>();
        StringBuilder password = new StringBuilder();
        valid_password_list.add(lowercase_letter.get(random.nextInt(lowercase_letter.size())));
        valid_password_list.add(uppercase_letter.get(random.nextInt(uppercase_letter.size())));
        valid_password_list.add(number.get(random.nextInt(number.size())));
        valid_password_list.add(special_character.get(random.nextInt(special_character.size())));
        //ADD MORE CHARACTER ACCORDING TO THE EXPECTED LENGTH OF PASSWORD
        for (int length=0;length<=password_length-1;length++){
            valid_password_list.add(master_list.get(random.nextInt(master_list.size())));
            if (valid_password_list.size()==password_length)
                break;
        }
        for (int index=0;index<=valid_password_list.size()-1;index++) {
            password.append(valid_password_list.get(index));
        }
        return password.toString();
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
