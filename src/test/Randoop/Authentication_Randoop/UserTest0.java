package Randoop.Authentication_Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test01");
        Authentication.User user1 = new Authentication.User("");
        java.lang.Class<?> wildcardClass2 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test02");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.Class<?> wildcardClass4 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test03");
        Authentication.User user1 = new Authentication.User("hi!");
        java.lang.Class<?> wildcardClass2 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test04");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        user1.setUsername("");
        java.lang.String str6 = user1.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test05");
        Authentication.User user1 = new Authentication.User("");
        user1.setUsername("hi!");
        user1.setUsername("");
        java.lang.String str6 = user1.getUsername();
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test07");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        java.lang.Class<?> wildcardClass5 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test08");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        user1.setUsername("");
        java.lang.String str7 = user1.getUsername();
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test09");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        user1.setUsername("hi!");
        java.lang.Class<?> wildcardClass7 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test10");
        Authentication.User user1 = new Authentication.User("hi!");
        java.lang.String str2 = user1.getUsername();
        java.lang.Class<?> wildcardClass3 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test11");
        Authentication.User user1 = new Authentication.User("hi!");
        java.lang.String str2 = user1.getUsername();
        user1.setUsername("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test12");
        Authentication.User user1 = new Authentication.User("");
        user1.setUsername("hi!");
        java.lang.Class<?> wildcardClass4 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test13");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        java.lang.String str5 = user1.getUsername();
        java.lang.Class<?> wildcardClass6 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test14");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        java.lang.String str5 = user1.getUsername();
        user1.setUsername("");
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test15");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        user1.setUsername("");
        user1.setUsername("");
        java.lang.Class<?> wildcardClass9 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test16");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        user1.setUsername("hi!");
        java.lang.String str7 = user1.getUsername();
        java.lang.Class<?> wildcardClass8 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test17");
        Authentication.User user1 = new Authentication.User("");
        user1.setUsername("");
        java.lang.Class<?> wildcardClass4 = user1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test18");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        user1.setUsername("");
        user1.setUsername("");
        user1.setUsername("");
        user1.setUsername("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test19");
        Authentication.User user1 = new Authentication.User("");
        user1.setUsername("");
        java.lang.String str4 = user1.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test20");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        user1.setUsername("hi!");
        user1.setUsername("hi!");
        user1.setUsername("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test21");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        user1.setUsername("");
        java.lang.String str7 = user1.getUsername();
        java.lang.String str8 = user1.getUsername();
        java.lang.String str9 = user1.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test22");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        user1.setUsername("");
        user1.setUsername("");
        user1.setUsername("");
        java.lang.String str11 = user1.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test23");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        java.lang.String str5 = user1.getUsername();
        user1.setUsername("");
        java.lang.String str8 = user1.getUsername();
        user1.setUsername("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test24");
        Authentication.User user1 = new Authentication.User("");
        user1.setUsername("");
        user1.setUsername("hi!");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test25");
        Authentication.User user1 = new Authentication.User("");
        user1.setUsername("hi!");
        user1.setUsername("");
        java.lang.String str6 = user1.getUsername();
        user1.setUsername("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test26");
        Authentication.User user1 = new Authentication.User("hi!");
        java.lang.String str2 = user1.getUsername();
        user1.setUsername("");
        java.lang.String str5 = user1.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test27");
        Authentication.User user1 = new Authentication.User("hi!");
        user1.setUsername("hi!");
        java.lang.String str4 = user1.getUsername();
        user1.setUsername("");
        user1.setUsername("");
        java.lang.String str9 = user1.getUsername();
        user1.setUsername("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }
}

