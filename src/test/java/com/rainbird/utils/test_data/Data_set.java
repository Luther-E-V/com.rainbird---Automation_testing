package com.rainbird.utils.test_data;

import com.rainbird.test_data_loader.Test_data_loader;
import java.io.IOException;
import java.util.Map;

public class Data_set {

    private final static int userNumber = 1;
    private final static String key = "user_" + userNumber;
    private static Map<String,Object> data_set;

    public static Map<String,Object> Data(String key) throws IOException {
        return data_set = Test_data_loader.getData_set(key);
    }

    public static String getCountry(){
        return data_set.get("Country").toString();
    }
    public static String getTimezone(){
        return data_set.get("Timezone").toString();
    }
    public static String getAccount_name(){
        return data_set.get("Account Name").toString();
    }
    public static String getAddress(){
        return data_set.get("Address").toString();
    }
    public static String getCity(){
        return data_set.get("City").toString();
    }
    public static String getPostal_code(){
        return data_set.get("Postal Code").toString();
    }
    public static String getState(){
        return data_set.get("State").toString();
    }
    public static String getContact_name(){
        return data_set.get("Contact Name").toString();
    }
    public static String getPhone_number(){
        return data_set.get("Phone Number").toString();
    }
    public static String getEmail(){
        return data_set.get("Email").toString();
    }
    public static String getConfirm_email(){
        return data_set.get("Confirm Email").toString();
    }
    public static String getUser_name(){
        return data_set.get("User Name").toString();
    }
    public static String getPassword(){
        return data_set.get("Password").toString();
    }
    public static String getConfirm_password(){
        return data_set.get("Confirm Password").toString();
    }
//    public final static String country = null;
//    public final static String timezone = null;
//    public final static String account_name = null;
//    public final static String address = null;
//    public final static String city = null;
//    public final static String postal_code = null;
//    public final static String state = null;
//    public final static String contact_name = null;
//    public final static String phone_number = null;
//    public final static String email = null;
//    public final static String confirm_email = null;
//    public final static String user_name = null;
//    public final static String password = null;
//    public final static String confirm_password = null;

}
