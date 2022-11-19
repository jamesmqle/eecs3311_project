package DataFetcher;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class DataParser {

    public DataParser () {
    }

    public JsonObject[] parseData (String dataString) {

        try {
            JsonArray jsonArray = JsonParser.parseString(dataString).getAsJsonArray().get(1).getAsJsonArray();

            int size = jsonArray.size();
            JsonObject jsonObjects[] = new JsonObject[size];

            for (int i = 0; i < size; i++) {
                jsonObjects[i] = jsonArray.get(i).getAsJsonObject();
            }

            return jsonObjects;
        } catch (Exception e) {
            System.out.println("Error:");
            System.out.println(dataString);
            return new JsonObject[0];
        }
    }
}