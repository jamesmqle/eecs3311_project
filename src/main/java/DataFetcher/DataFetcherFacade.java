package DataFetcher;

import com.google.gson.JsonObject;

public class DataFetcherFacade {

    //Singleton
    private static final DataFetcherFacade dataFetcher = new DataFetcherFacade();
    private DataFetcherFacade() {
        dataRequester = new DataRequester();
        dataParser = new DataParser();
        dateRange = new DateRange();
        country = new Country();
    }
    public static DataFetcherFacade getInstance() {
        return dataFetcher;
    }

    private final DataRequester dataRequester;
    private final DataParser dataParser;
    public DateRange dateRange;
    public Country country;

    private String baseURL = "";

    public void setBaseURL(String url) {
        baseURL = url;
    }

    public JsonObject[] fetchData (String indicator) {

        String urlString = baseURL + "/country/" + country.getCountry() + "/indicator/" + indicator + "?date=" + dateRange.getStart() + ":" + dateRange.getEnd() + "&format=json";
        String data = dataRequester.getHTTP(urlString);

//        System.out.println("Data Returned: " + data);

        return dataParser.parseData(data);
    }

}