package Randoop.DataFetcher_Randoop;

import org.junit.FixMethodOrder;
import org.testng.annotations.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateRangeTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test01");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.Class<?> wildcardClass1 = dateRange0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test02");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.Class<?> wildcardClass4 = dateRange0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test03");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.getStart();
        java.lang.String str2 = dateRange0.getEnd();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setRange("hi!", "2022");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2021" + "'", str1.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2022" + "'", str2.equals("2022"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test04");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.toString();
        java.lang.Class<?> wildcardClass2 = dateRange0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "StartYear: 2021 EndYear: 2022" + "'", str1.equals("StartYear: 2021 EndYear: 2022"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test05");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.getEnd();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setRange("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2021" + "'", str5.equals("2021"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test06");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.getStart();
        java.lang.Class<?> wildcardClass2 = dateRange0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2021" + "'", str1.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test07");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.toString();
        java.lang.String str2 = dateRange0.getStart();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setRange("StartYear: 2021 EndYear: 2021", "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'StartYear: 2021 EndYear: 2021' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "StartYear: 2021 EndYear: 2022" + "'", str1.equals("StartYear: 2021 EndYear: 2022"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2021" + "'", str2.equals("2021"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test08");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setStart("hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test09");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.getEnd();
        java.lang.Class<?> wildcardClass6 = dateRange0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2021" + "'", str5.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test10");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.getStart();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setStart("hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2021" + "'", str1.equals("2021"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test11");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setRange("2021", "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test12");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.toString();
        java.lang.String str2 = dateRange0.getStart();
        java.lang.String str3 = dateRange0.toString();
        java.lang.Class<?> wildcardClass4 = dateRange0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "StartYear: 2021 EndYear: 2022" + "'", str1.equals("StartYear: 2021 EndYear: 2022"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2021" + "'", str2.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "StartYear: 2021 EndYear: 2022" + "'", str3.equals("StartYear: 2021 EndYear: 2022"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test13");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.getStart();
        java.lang.String str2 = dateRange0.getEnd();
        java.lang.Class<?> wildcardClass3 = dateRange0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2021" + "'", str1.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2022" + "'", str2.equals("2022"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test14");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.toString();
        java.lang.String str6 = dateRange0.getStart();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setEnd("StartYear: 2021 EndYear: 2022");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'StartYear: 2021 EndYear: 2022' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StartYear: 2021 EndYear: 2021" + "'", str5.equals("StartYear: 2021 EndYear: 2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2021" + "'", str6.equals("2021"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test15");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.getEnd();
        dateRange0.setEnd("2022");
        java.lang.String str8 = dateRange0.getEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2021" + "'", str5.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "2022" + "'", str8.equals("2022"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test16");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.getEnd();
        dateRange0.setEnd("2022");
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setStart("");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2021" + "'", str5.equals("2021"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test17");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.getStart();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setRange("2021", "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2021" + "'", str1.equals("2021"));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test18");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.getEnd();
        java.lang.String str6 = dateRange0.getStart();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setStart("");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2021" + "'", str5.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2021" + "'", str6.equals("2021"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test19");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.getEnd();
        dateRange0.setEnd("2022");
        java.lang.String str8 = dateRange0.toString();
        java.lang.String str9 = dateRange0.getEnd();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setEnd("hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2021" + "'", str5.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "StartYear: 2021 EndYear: 2022" + "'", str8.equals("StartYear: 2021 EndYear: 2022"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2022" + "'", str9.equals("2022"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test20");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.toString();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setStart("StartYear: 2021 EndYear: 2021");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'StartYear: 2021 EndYear: 2021' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "StartYear: 2021 EndYear: 2022" + "'", str1.equals("StartYear: 2021 EndYear: 2022"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test21");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.toString();
        java.lang.String str6 = dateRange0.toString();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setEnd("StartYear: 2021 EndYear: 2022");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'StartYear: 2021 EndYear: 2022' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StartYear: 2021 EndYear: 2021" + "'", str5.equals("StartYear: 2021 EndYear: 2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "StartYear: 2021 EndYear: 2021" + "'", str6.equals("StartYear: 2021 EndYear: 2021"));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test22");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.toString();
        java.lang.String str6 = dateRange0.getStart();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setEnd("hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StartYear: 2021 EndYear: 2021" + "'", str5.equals("StartYear: 2021 EndYear: 2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2021" + "'", str6.equals("2021"));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test23");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.toString();
        java.lang.String str6 = dateRange0.toString();
        java.lang.String str7 = dateRange0.getEnd();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setStart("hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StartYear: 2021 EndYear: 2021" + "'", str5.equals("StartYear: 2021 EndYear: 2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "StartYear: 2021 EndYear: 2021" + "'", str6.equals("StartYear: 2021 EndYear: 2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "2021" + "'", str7.equals("2021"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test24");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.getStart();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setEnd("StartYear: 2021 EndYear: 2022");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'StartYear: 2021 EndYear: 2022' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2021" + "'", str1.equals("2021"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test25");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.toString();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setRange("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'hi!' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StartYear: 2021 EndYear: 2021" + "'", str5.equals("StartYear: 2021 EndYear: 2021"));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test26");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.toString();
        java.lang.String str6 = dateRange0.toString();
        java.lang.String str7 = dateRange0.getStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "StartYear: 2021 EndYear: 2021" + "'", str5.equals("StartYear: 2021 EndYear: 2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "StartYear: 2021 EndYear: 2021" + "'", str6.equals("StartYear: 2021 EndYear: 2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "2021" + "'", str7.equals("2021"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test27");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.toString();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setEnd("StartYear: 2021 EndYear: 2022");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'StartYear: 2021 EndYear: 2022' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "StartYear: 2021 EndYear: 2022" + "'", str1.equals("StartYear: 2021 EndYear: 2022"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test28");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.getEnd();
        dateRange0.setEnd("2022");
        java.lang.String str8 = dateRange0.toString();
        java.lang.String str9 = dateRange0.getEnd();
        java.lang.Class<?> wildcardClass10 = dateRange0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2021" + "'", str5.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "StartYear: 2021 EndYear: 2022" + "'", str8.equals("StartYear: 2021 EndYear: 2022"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2022" + "'", str9.equals("2022"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test29");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        dateRange0.setRange("2021", "2021");
        java.lang.String str4 = dateRange0.getEnd();
        java.lang.String str5 = dateRange0.getEnd();
        java.lang.String str6 = dateRange0.getEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2021" + "'", str4.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2021" + "'", str5.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2021" + "'", str6.equals("2021"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test30");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.getStart();
        java.lang.String str2 = dateRange0.getEnd();
        java.lang.String str3 = dateRange0.toString();
        // The following exception was thrown during execution in test generation
        try {
            dateRange0.setRange("StartYear: 2021 EndYear: 2021", "");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'StartYear: 2021 EndYear: 2021' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2021" + "'", str1.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2022" + "'", str2.equals("2022"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "StartYear: 2021 EndYear: 2022" + "'", str3.equals("StartYear: 2021 EndYear: 2022"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test31");
        DataFetcher.Filters.DateRange dateRange0 = new DataFetcher.Filters.DateRange();
        java.lang.String str1 = dateRange0.getStart();
        java.lang.String str2 = dateRange0.getEnd();
        dateRange0.setStart("2022");
        java.lang.String str5 = dateRange0.getStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2021" + "'", str1.equals("2021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2022" + "'", str2.equals("2022"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2022" + "'", str5.equals("2022"));
    }
}

