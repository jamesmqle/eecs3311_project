package Randoop.DataFetcher_Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataFetcherFacadeTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test01");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        DataFetcher.Filters.DateRange dateRange5 = dataFetcherFacade3.dateRange;
        dataFetcherFacade0.dateRange = dateRange5;
        java.lang.Class<?> wildcardClass7 = dateRange5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test02");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade0.country = country4;
        DataFetcher.Filters.Country country6 = dataFetcherFacade0.country;
        dataFetcherFacade0.setBaseURL("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test03");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade0.country = country4;
        DataFetcher.Filters.Country country6 = dataFetcherFacade0.country;
        java.lang.Class<?> wildcardClass7 = dataFetcherFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test04");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        dataFetcherFacade0.setBaseURL("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test05");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade2 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade2.country = country4;
        dataFetcherFacade0.country = country4;
        DataFetcher.DataFetcherFacade dataFetcherFacade7 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country8 = dataFetcherFacade7.country;
        DataFetcher.Filters.DateRange dateRange9 = dataFetcherFacade7.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade10 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country11 = dataFetcherFacade10.country;
        dataFetcherFacade7.country = country11;
        dataFetcherFacade0.country = country11;
        java.lang.Class<?> wildcardClass14 = dataFetcherFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test06");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.Filters.DateRange dateRange3 = dataFetcherFacade0.dateRange;
        com.google.gson.JsonObject[] jsonObjectArray5 = dataFetcherFacade0.fetchData("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test07");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade2 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade2.country = country4;
        dataFetcherFacade0.country = country4;
        DataFetcher.DataFetcherFacade dataFetcherFacade7 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country8 = dataFetcherFacade7.country;
        DataFetcher.Filters.DateRange dateRange9 = dataFetcherFacade7.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade10 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country11 = dataFetcherFacade10.country;
        dataFetcherFacade7.country = country11;
        dataFetcherFacade0.country = country11;
        DataFetcher.DataFetcherFacade dataFetcherFacade14 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade15 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country16 = dataFetcherFacade15.country;
        dataFetcherFacade14.country = country16;
        dataFetcherFacade0.country = country16;
        java.lang.Class<?> wildcardClass19 = country16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test08");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        dataFetcherFacade0.setBaseURL("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test09");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade0.country = country4;
        com.google.gson.JsonObject[] jsonObjectArray7 = dataFetcherFacade0.fetchData("hi!");
        DataFetcher.DataFetcherFacade dataFetcherFacade8 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country9 = dataFetcherFacade8.country;
        DataFetcher.Filters.DateRange dateRange10 = dataFetcherFacade8.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade11 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country12 = dataFetcherFacade11.country;
        DataFetcher.Filters.DateRange dateRange13 = dataFetcherFacade11.dateRange;
        dataFetcherFacade8.dateRange = dateRange13;
        dataFetcherFacade0.dateRange = dateRange13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange13);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test10");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.Filters.DateRange dateRange3 = dataFetcherFacade0.dateRange;
        DataFetcher.Filters.Country country4 = dataFetcherFacade0.country;
        java.lang.Class<?> wildcardClass5 = dataFetcherFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test11");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        DataFetcher.Filters.DateRange dateRange5 = dataFetcherFacade3.dateRange;
        dataFetcherFacade0.dateRange = dateRange5;
        DataFetcher.Filters.Country country7 = dataFetcherFacade0.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade8 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country9 = dataFetcherFacade8.country;
        DataFetcher.Filters.DateRange dateRange10 = dataFetcherFacade8.dateRange;
        DataFetcher.Filters.DateRange dateRange11 = dataFetcherFacade8.dateRange;
        dataFetcherFacade0.dateRange = dateRange11;
        DataFetcher.Filters.DateRange dateRange13 = dataFetcherFacade0.dateRange;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange13);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test12");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.Filters.DateRange dateRange3 = dataFetcherFacade0.dateRange;
        DataFetcher.Filters.DateRange dateRange4 = dataFetcherFacade0.dateRange;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test13");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade2 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade2.country = country4;
        dataFetcherFacade0.country = country4;
        dataFetcherFacade0.setBaseURL("");
        DataFetcher.DataFetcherFacade dataFetcherFacade9 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country10 = dataFetcherFacade9.country;
        DataFetcher.Filters.DateRange dateRange11 = dataFetcherFacade9.dateRange;
        DataFetcher.Filters.DateRange dateRange12 = dataFetcherFacade9.dateRange;
        dataFetcherFacade0.dateRange = dateRange12;
        dataFetcherFacade0.setBaseURL("hi!");
        com.google.gson.JsonObject[] jsonObjectArray17 = dataFetcherFacade0.fetchData("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray17);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test14");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.Filters.DateRange dateRange3 = dataFetcherFacade0.dateRange;
        java.lang.Class<?> wildcardClass4 = dataFetcherFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test15");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        dataFetcherFacade0.setBaseURL("hi!");
        dataFetcherFacade0.setBaseURL("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test16");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade0.country = country4;
        com.google.gson.JsonObject[] jsonObjectArray7 = dataFetcherFacade0.fetchData("hi!");
        com.google.gson.JsonObject[] jsonObjectArray9 = dataFetcherFacade0.fetchData("");
        DataFetcher.Filters.DateRange dateRange10 = dataFetcherFacade0.dateRange;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test17");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade0.country = country4;
        DataFetcher.Filters.Country country6 = dataFetcherFacade0.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade7 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country8 = dataFetcherFacade7.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade9 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade10 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country11 = dataFetcherFacade10.country;
        dataFetcherFacade9.country = country11;
        dataFetcherFacade7.country = country11;
        dataFetcherFacade7.setBaseURL("");
        DataFetcher.DataFetcherFacade dataFetcherFacade16 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country17 = dataFetcherFacade16.country;
        DataFetcher.Filters.DateRange dateRange18 = dataFetcherFacade16.dateRange;
        DataFetcher.Filters.DateRange dateRange19 = dataFetcherFacade16.dateRange;
        dataFetcherFacade7.dateRange = dateRange19;
        DataFetcher.Filters.Country country21 = dataFetcherFacade7.country;
        dataFetcherFacade0.country = country21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country21);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test18");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade2 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade2.country = country4;
        dataFetcherFacade0.country = country4;
        dataFetcherFacade0.setBaseURL("");
        DataFetcher.DataFetcherFacade dataFetcherFacade9 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country10 = dataFetcherFacade9.country;
        DataFetcher.Filters.DateRange dateRange11 = dataFetcherFacade9.dateRange;
        DataFetcher.Filters.DateRange dateRange12 = dataFetcherFacade9.dateRange;
        dataFetcherFacade0.dateRange = dateRange12;
        com.google.gson.JsonObject[] jsonObjectArray15 = dataFetcherFacade0.fetchData("");
        DataFetcher.Filters.Country country16 = dataFetcherFacade0.country;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country16);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test19");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade2 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade2.country = country4;
        dataFetcherFacade0.country = country4;
        DataFetcher.DataFetcherFacade dataFetcherFacade7 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country8 = dataFetcherFacade7.country;
        DataFetcher.Filters.DateRange dateRange9 = dataFetcherFacade7.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade10 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country11 = dataFetcherFacade10.country;
        dataFetcherFacade7.country = country11;
        dataFetcherFacade0.country = country11;
        DataFetcher.Filters.Country country14 = dataFetcherFacade0.country;
        dataFetcherFacade0.setBaseURL("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country14);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test20");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade0.country = country4;
        com.google.gson.JsonObject[] jsonObjectArray7 = dataFetcherFacade0.fetchData("hi!");
        DataFetcher.DataFetcherFacade dataFetcherFacade8 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country9 = dataFetcherFacade8.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade10 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade11 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country12 = dataFetcherFacade11.country;
        dataFetcherFacade10.country = country12;
        dataFetcherFacade8.country = country12;
        dataFetcherFacade8.setBaseURL("");
        DataFetcher.DataFetcherFacade dataFetcherFacade17 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country18 = dataFetcherFacade17.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade19 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade20 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country21 = dataFetcherFacade20.country;
        dataFetcherFacade19.country = country21;
        dataFetcherFacade17.country = country21;
        DataFetcher.DataFetcherFacade dataFetcherFacade24 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country25 = dataFetcherFacade24.country;
        DataFetcher.Filters.DateRange dateRange26 = dataFetcherFacade24.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade27 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country28 = dataFetcherFacade27.country;
        dataFetcherFacade24.country = country28;
        dataFetcherFacade17.country = country28;
        dataFetcherFacade8.country = country28;
        dataFetcherFacade0.country = country28;
        com.google.gson.JsonObject[] jsonObjectArray34 = dataFetcherFacade0.fetchData("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray34);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test21");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade3 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country4 = dataFetcherFacade3.country;
        dataFetcherFacade0.country = country4;
        com.google.gson.JsonObject[] jsonObjectArray7 = dataFetcherFacade0.fetchData("hi!");
        com.google.gson.JsonObject[] jsonObjectArray9 = dataFetcherFacade0.fetchData("");
        DataFetcher.DataFetcherFacade dataFetcherFacade10 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country11 = dataFetcherFacade10.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade12 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade13 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country14 = dataFetcherFacade13.country;
        dataFetcherFacade12.country = country14;
        dataFetcherFacade10.country = country14;
        dataFetcherFacade10.setBaseURL("");
        DataFetcher.DataFetcherFacade dataFetcherFacade19 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country20 = dataFetcherFacade19.country;
        DataFetcher.DataFetcherFacade dataFetcherFacade21 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade22 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country23 = dataFetcherFacade22.country;
        dataFetcherFacade21.country = country23;
        dataFetcherFacade19.country = country23;
        DataFetcher.DataFetcherFacade dataFetcherFacade26 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country27 = dataFetcherFacade26.country;
        DataFetcher.Filters.DateRange dateRange28 = dataFetcherFacade26.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade29 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country30 = dataFetcherFacade29.country;
        dataFetcherFacade26.country = country30;
        dataFetcherFacade19.country = country30;
        dataFetcherFacade10.country = country30;
        dataFetcherFacade0.country = country30;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country30);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test22");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.DataFetcherFacade dataFetcherFacade1 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country2 = dataFetcherFacade1.country;
        dataFetcherFacade0.country = country2;
        com.google.gson.JsonObject[] jsonObjectArray5 = dataFetcherFacade0.fetchData("");
        dataFetcherFacade0.setBaseURL("");
        DataFetcher.DataFetcherFacade dataFetcherFacade8 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country9 = dataFetcherFacade8.country;
        DataFetcher.Filters.DateRange dateRange10 = dataFetcherFacade8.dateRange;
        DataFetcher.DataFetcherFacade dataFetcherFacade11 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country12 = dataFetcherFacade11.country;
        dataFetcherFacade8.country = country12;
        dataFetcherFacade0.country = country12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country12);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test23");
        DataFetcher.DataFetcherFacade dataFetcherFacade0 = DataFetcher.DataFetcherFacade.getInstance();
        DataFetcher.Filters.Country country1 = dataFetcherFacade0.country;
        DataFetcher.Filters.DateRange dateRange2 = dataFetcherFacade0.dateRange;
        java.lang.Class<?> wildcardClass3 = dateRange2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dataFetcherFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(country1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateRange2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

