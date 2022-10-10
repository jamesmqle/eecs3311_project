package DataFetcher;

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

    public void tester () {
        dataRequester.tester();
    }

}