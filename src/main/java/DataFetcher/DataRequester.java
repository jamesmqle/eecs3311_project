package DataFetcher;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class DataRequester {

    public DataRequester () {}

    public String getHTTP (String urlString) {
        System.out.println("Requesting: " + urlString);
        String data = "";

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();

            if (responseCode == 200) {
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    data += sc.nextLine();
                }
                sc.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        return data;
    }
}