package application;

import org.json.JSONObject;
/*Scanner s = new Scanner(System.in);
s.
* */
public class DataReading {
    static void main() {

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
        System.out.print(jsonObject.toString(4));
    }
}