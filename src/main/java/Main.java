import DataFetcher.DataFetcherFacade;

public class Main {

    public static void main(String[] args) {

        DataFetcherFacade.getInstance().setBaseURL("http://api.worldbank.org/v2");

        DataFetcherFacade.getInstance().fetchData("SP.POP.TOTL");
        //DataFetcherFacade.getInstance().fetchData("AG.LND.AGRI.ZS");

    }

}