package application;

import org.json.JSONWriter;

import java.io.FileWriter;
import java.io.IOException;

public class DataWriting {
    static void main() {
        try {
            JSONWriter jsonWriter = new JSONWriter(new FileWriter("catalog.json"));
            String line;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
