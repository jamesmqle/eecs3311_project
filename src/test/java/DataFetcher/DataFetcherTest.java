package DataFetcher;

import com.google.gson.JsonObject;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DataFetcherTest {

    @BeforeAll
    public static void setUp() {
        DataFetcherFacade.getInstance().setBaseURL("http://api.worldbank.org/v2");
    }

    @Test
    public void TestDateRange1() {
        DataFetcherFacade.getInstance().dateRange.setRange("2010", "2020");

        assertEquals("2010", DataFetcherFacade.getInstance().dateRange.getStart());
        assertEquals("2020", DataFetcherFacade.getInstance().dateRange.getEnd());
    }

    @Test
    public void TestDateRange2() {
        DataFetcherFacade.getInstance().dateRange.setStart("2010");
        DataFetcherFacade.getInstance().dateRange.setEnd("2020");

        assertEquals("2010", DataFetcherFacade.getInstance().dateRange.getStart());
        assertEquals("2020", DataFetcherFacade.getInstance().dateRange.getEnd());
    }

    @Test
    public void TestCountry1() {
        DataFetcherFacade.getInstance().country.setCountry("can");

        assertEquals("can", DataFetcherFacade.getInstance().country.getCountry());
    }

    @Test
    public void TestFetchData1() {
        DataFetcherFacade.getInstance().dateRange.setRange("2020", "2020");
        DataFetcherFacade.getInstance().country.setCountry("can");

        JsonObject[] data = DataFetcherFacade.getInstance().fetchData("SP.POP.TOTL");

        String expected = "{\"indicator\":{\"id\":\"SP.POP.TOTL\",\"value\":\"Population, total\"},\"country\":{\"id\":\"CA\",\"value\":\"Canada\"},\"countryiso3code\":\"CAN\",\"date\":\"2020\",\"value\":38037204,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":0}";

        assertEquals(expected, data[0].toString());
    }

    @Test
    public void TestFetchData2() {
        DataFetcherFacade.getInstance().dateRange.setRange("2020", "2020");
        DataFetcherFacade.getInstance().country.setCountry("wdadwadadwa");

        JsonObject[] data = DataFetcherFacade.getInstance().fetchData("SP.POP.TOTL");

        assertEquals(0, data.length);
    }

}
