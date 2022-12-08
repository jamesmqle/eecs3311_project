package Randoop.DataFetcher_Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DataRequesterTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test02");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.Class<?> wildcardClass1 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test03");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.Class<?> wildcardClass5 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test04");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.Class<?> wildcardClass9 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test05");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("hi!");
        java.lang.Class<?> wildcardClass7 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test06");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("hi!");
        java.lang.Class<?> wildcardClass5 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test07");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("hi!");
        java.lang.String str8 = dataRequester0.getHTTP("hi!");
        java.lang.Class<?> wildcardClass9 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test08");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.Class<?> wildcardClass7 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test09");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.String str12 = dataRequester0.getHTTP("");
        java.lang.String str14 = dataRequester0.getHTTP("");
        java.lang.String str16 = dataRequester0.getHTTP("hi!");
        java.lang.String str18 = dataRequester0.getHTTP("hi!");
        java.lang.String str20 = dataRequester0.getHTTP("hi!");
        java.lang.Class<?> wildcardClass21 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test10");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.String str12 = dataRequester0.getHTTP("");
        java.lang.Class<?> wildcardClass13 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test11");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.Class<?> wildcardClass11 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test12");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.Class<?> wildcardClass3 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test13");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.String str12 = dataRequester0.getHTTP("");
        java.lang.String str14 = dataRequester0.getHTTP("");
        java.lang.Class<?> wildcardClass15 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test14");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("hi!");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.Class<?> wildcardClass9 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test15");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.String str12 = dataRequester0.getHTTP("");
        java.lang.String str14 = dataRequester0.getHTTP("");
        java.lang.String str16 = dataRequester0.getHTTP("hi!");
        java.lang.Class<?> wildcardClass17 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test16");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.String str12 = dataRequester0.getHTTP("");
        java.lang.String str14 = dataRequester0.getHTTP("");
        java.lang.String str16 = dataRequester0.getHTTP("hi!");
        java.lang.String str18 = dataRequester0.getHTTP("hi!");
        java.lang.Class<?> wildcardClass19 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test17");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.String str12 = dataRequester0.getHTTP("");
        java.lang.String str14 = dataRequester0.getHTTP("");
        java.lang.String str16 = dataRequester0.getHTTP("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test18");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("hi!");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.Class<?> wildcardClass7 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test19");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.String str12 = dataRequester0.getHTTP("");
        java.lang.String str14 = dataRequester0.getHTTP("");
        java.lang.String str16 = dataRequester0.getHTTP("hi!");
        java.lang.String str18 = dataRequester0.getHTTP("hi!");
        java.lang.String str20 = dataRequester0.getHTTP("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test20");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("hi!");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("hi!");
        java.lang.String str10 = dataRequester0.getHTTP("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test21");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.String str12 = dataRequester0.getHTTP("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test22");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("hi!");
        java.lang.String str10 = dataRequester0.getHTTP("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test23");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.String str12 = dataRequester0.getHTTP("");
        java.lang.String str14 = dataRequester0.getHTTP("");
        java.lang.String str16 = dataRequester0.getHTTP("hi!");
        java.lang.String str18 = dataRequester0.getHTTP("");
        java.lang.Class<?> wildcardClass19 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test24");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("hi!");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.String str12 = dataRequester0.getHTTP("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test25");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("");
        java.lang.String str4 = dataRequester0.getHTTP("hi!");
        java.lang.Class<?> wildcardClass5 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test26");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("");
        java.lang.String str4 = dataRequester0.getHTTP("hi!");
        java.lang.String str6 = dataRequester0.getHTTP("");
        java.lang.String str8 = dataRequester0.getHTTP("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test27");
        DataFetcher.DataRequester dataRequester0 = new DataFetcher.DataRequester();
        java.lang.String str2 = dataRequester0.getHTTP("hi!");
        java.lang.String str4 = dataRequester0.getHTTP("");
        java.lang.String str6 = dataRequester0.getHTTP("hi!");
        java.lang.String str8 = dataRequester0.getHTTP("");
        java.lang.String str10 = dataRequester0.getHTTP("");
        java.lang.Class<?> wildcardClass11 = dataRequester0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}

