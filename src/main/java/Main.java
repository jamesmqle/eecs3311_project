import Authentication.AuthenticationFacade;
import DataFetcher.DataFetcherFacade;
import GUI.GUIFacade;

public class Main {

    public static void main(String[] args) {

        DataFetcherFacade.getInstance().setBaseURL("http://api.worldbank.org/v2");

        // Open initial login UI
        GUIFacade.getInstance().loginUI();

        // Bypass login
        // IMPORTANT: Comment out before pushing
        // AuthenticationFacade.getInstance().authenticate("zach","1234");
        // GUIFacade.getInstance().mainUI();
    }
}