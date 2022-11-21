import Authentication.AuthenticationFacade;
import DataFetcher.DataFetcherFacade;
import GUI.GUI;

public class Main {

    public static void main(String[] args) {

        // Open initial login UI
        GUI.getInstance().loginUI();

        // Bypass login
        // IMPORTANT: Comment out before pushing
        // AuthenticationFacade.getInstance().authenticate("zach","1234");
        // GUI.getInstance().mainUI();

        // Testing for initial Data Fetcher module
        DataFetcherFacade.getInstance().setBaseURL("http://api.worldbank.org/v2");

        // DataFetcherFacade.getInstance().dateRange.setRange("2010", "2020");
        // DataFetcherFacade.getInstance().country.setCountry("usa");

//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        for (JsonObject jsonObject: DataFetcherFacade.getInstance().fetchData("SP.POP.TOTL")) { // AG.LND.AGRI.ZS
//            System.out.println(gson.toJson(jsonObject));
//        }

    }

}