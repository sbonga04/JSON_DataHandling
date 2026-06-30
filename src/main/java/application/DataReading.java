package application;

import org.json.JSONObject;

import java.util.LinkedHashMap;

/*Scanner s = new Scanner(System.in);
s.
* */
public class DataReading {

    private static String hardcoded(){
        String object = """
                {
                    "name": Matcha,
                    "price": 12.99,
                    "in_stock": true
                }
                """;
        // Pass the string into the constructor
        JSONObject jsonObject = new JSONObject(object);

        //get String from the root object
        String s = jsonObject.toString(4);
        return s;
    }
    static void main() {

        System.out.println(DataReading.hardcoded());

    }
}