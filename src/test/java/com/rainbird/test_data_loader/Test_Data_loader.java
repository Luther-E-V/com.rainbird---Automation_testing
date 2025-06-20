package com.rainbird.test_data_loader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Test_data_loader {

    private static final String file_path = "src/test/resources/Test_Data/Test_Data.json";
    private static Map<String , Map<String,Object>> test_data;
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void Convert_data_from_json() throws IOException {
        if (test_data == null) {
            test_data = mapper.readValue(new File(file_path), new TypeReference<Map<String, Map<String, Object>>>() {});
        }
    }

    public Map<String,Object> Get_specific_data(String key) throws IOException {
        Convert_data_from_json();
        return test_data.get(key);
    }
    public Map<String , Map<String,Object>> Get_all_data() throws IOException {
        Convert_data_from_json();
        return test_data;
    }
}
