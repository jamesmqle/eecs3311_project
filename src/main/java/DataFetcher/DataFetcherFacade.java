package DataFetcher;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class DataFetcherFacade {

    //Singleton
    private static final DataFetcherFacade dataFetcher = new DataFetcherFacade();
    private DataFetcherFacade() {
        dataRequester = new DataRequester();
        dataParser = new DataParser();
    }
    public static DataFetcherFacade getInstance() {
        return dataFetcher;
    }

    private final DataRequester dataRequester;
    private final DataParser dataParser;

    private String baseURL = "";

    public void setBaseURL(String url) {
        baseURL = url;
    }

    public void getData (String indicator) {

        String startYear = "2010";
        String endYear = "2020";
        String country = "can";

        String urlString = baseURL + "/country/" + country + "/indicator/" + indicator + "?date=" + startYear + ":" + endYear + "&format=json";
        String data = dataRequester.getHTTP(urlString);

        System.out.println("Data Returned: " + data);

        JsonObject jsonObjects[] = dataParser.parseData(data);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        for (JsonObject jsonObject: jsonObjects) {
            System.out.println(gson.toJson(jsonObject));
        }
    }

}