package application;

import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;

public class DataWriting {
    static void main() throws IOException {
        //Step1. Build the JSON data structure
        JSONObject jsonObject = new JSONObject(new LinkedHashMap<>()); //hash map keeps the order
        jsonObject.put("name","Matcha");
        jsonObject.put("price",12.99);
        jsonObject.put("in_stock",true);

        //Now we go file writing mode step 2.
        try (FileWriter writer = new FileWriter("catalog.json")) {
            writer.write(jsonObject.toString(4));

            System.out.println("successfully written to a file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
