package com.rainbird.test_data_loader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Test_data_loader {

    private static final String filePath = "src/test/resources/Test_Data/Test_Data.json";
    private static Map<String , Map<String,Object>> testData;
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void Convert_data_from_json() throws IOException {
        if (testData == null) {
            testData = mapper.readValue(new File(filePath), new TypeReference<Map<String, Map<String, Object>>>() {});
        }
    }

    public static Map<String,Object> getData_set(String key) throws IOException {
        Convert_data_from_json();
        return testData.get(key);
    }
}
