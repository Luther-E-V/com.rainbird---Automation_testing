package com.rainbird.test_data_loader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Test_Data_loader {

    private static final String file_path = "src/test/resources/Test_Data/Test_Data.json";
    public static List<Map<String, Object>> test_data_list;
    private static ObjectMapper mapper = new ObjectMapper();

    public static void Load_test_data() throws IOException {
        test_data_list = mapper.readValue(new File(file_path), new TypeReference<List<Map<String, Object>>>() {});
    }

//    public String get_Data(String fieldName) {
//        String test_data = null;
//        test_data = test_data_list.get(fieldName).toString();
//    }
}
