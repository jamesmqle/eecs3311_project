import DataFetcher.DataFetcherFacade;

public class Main {

    public static void main(String[] args) {

        DataFetcherFacade.getInstance().setBaseURL("http://api.worldbank.org/v2");

        DataFetcherFacade.getInstance().getData("SP.POP.TOTL");
        //DataFetcherFacade.getInstance().getData("AG.LND.AGRI.ZS");

    }

}