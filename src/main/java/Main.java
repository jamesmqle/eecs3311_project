import DataFetcher.DataFetcherFacade;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main {

    public static void main(String[] args) {

        DataFetcherFacade.getInstance().setBaseURL("http://api.worldbank.org/v2");

        DataFetcherFacade.getInstance().dateRange.setRange("2010", "2020");
        DataFetcherFacade.getInstance().country.setCountry("usa");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        for (JsonObject jsonObject: DataFetcherFacade.getInstance().fetchData("SP.POP.TOTL")) { // AG.LND.AGRI.ZS
            System.out.println(gson.toJson(jsonObject));
        }

    }

}