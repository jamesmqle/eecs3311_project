package Authentication;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatabaseTable {

    private String path;

    public DatabaseTable(String path) {
        this.path = path;
    }

    public JsonObject[] getData() {

        List<JsonObject> data = new ArrayList<>();

        File file = new File(path);
        try{
            Scanner input = new Scanner(file, StandardCharsets.UTF_8);

            // Get keys of database table
            String[] keys = input.nextLine().split(",");

            while(input.hasNext()){
                String[] line = input.nextLine().split(",");
                JsonObject obj = new JsonObject();

                for (int i = 0; i < line.length; i++) {
                    obj.add(keys[i], new JsonPrimitive(line[i]));
                }

                data.add(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data.toArray(new JsonObject[0]);
    }

}
