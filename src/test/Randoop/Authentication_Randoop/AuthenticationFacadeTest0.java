package Randoop.Authentication_Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthenticationFacadeTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        java.lang.Class<?> wildcardClass4 = authenticationFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        Authentication.User user5 = null;
        authenticationFacade0.currentUser = user5;
        java.lang.Class<?> wildcardClass7 = authenticationFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        Authentication.User user5 = null;
        authenticationFacade0.currentUser = user5;
        Authentication.User user7 = authenticationFacade0.currentUser;
        java.lang.Class<?> wildcardClass8 = authenticationFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        java.lang.Class<?> wildcardClass5 = authenticationFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        Authentication.User user1 = authenticationFacade0.currentUser;
        java.lang.Class<?> wildcardClass2 = authenticationFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        java.lang.Class<?> wildcardClass1 = authenticationFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        Authentication.User user1 = null;
        authenticationFacade0.currentUser = user1;
        Authentication.User user3 = authenticationFacade0.currentUser;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        Authentication.User user1 = authenticationFacade0.currentUser;
        boolean boolean4 = authenticationFacade0.authenticate("", "");
        java.lang.Class<?> wildcardClass5 = authenticationFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        boolean boolean7 = authenticationFacade0.authenticate("hi!", "hi!");
        boolean boolean10 = authenticationFacade0.authenticate("", "");
        java.lang.Class<?> wildcardClass11 = authenticationFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        boolean boolean7 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user8 = null;
        authenticationFacade0.currentUser = user8;
        Authentication.User user10 = authenticationFacade0.currentUser;
        Authentication.User user11 = null;
        authenticationFacade0.currentUser = user11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        Authentication.User user5 = null;
        authenticationFacade0.currentUser = user5;
        Authentication.User user7 = null;
        authenticationFacade0.currentUser = user7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        boolean boolean7 = authenticationFacade0.authenticate("hi!", "hi!");
        java.lang.Class<?> wildcardClass8 = authenticationFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        Authentication.User user5 = null;
        authenticationFacade0.currentUser = user5;
        Authentication.User user7 = authenticationFacade0.currentUser;
        Authentication.User user8 = authenticationFacade0.currentUser;
        Authentication.User user9 = null;
        authenticationFacade0.currentUser = user9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        boolean boolean7 = authenticationFacade0.authenticate("hi!", "hi!");
        boolean boolean10 = authenticationFacade0.authenticate("", "");
        boolean boolean13 = authenticationFacade0.authenticate("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        Authentication.User user1 = authenticationFacade0.currentUser;
        boolean boolean4 = authenticationFacade0.authenticate("", "");
        boolean boolean7 = authenticationFacade0.authenticate("hi!", "");
        Authentication.User user8 = null;
        authenticationFacade0.currentUser = user8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        boolean boolean7 = authenticationFacade0.authenticate("hi!", "hi!");
        Authentication.User user8 = authenticationFacade0.currentUser;
        Authentication.User user9 = authenticationFacade0.currentUser;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = user9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        Authentication.User user1 = authenticationFacade0.currentUser;
        Authentication.User user2 = null;
        authenticationFacade0.currentUser = user2;
        boolean boolean6 = authenticationFacade0.authenticate("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        boolean boolean7 = authenticationFacade0.authenticate("", "hi!");
        boolean boolean10 = authenticationFacade0.authenticate("hi!", "hi!");
        Authentication.User user11 = authenticationFacade0.currentUser;
        Authentication.User user12 = null;
        authenticationFacade0.currentUser = user12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        boolean boolean7 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user8 = null;
        authenticationFacade0.currentUser = user8;
        Authentication.User user10 = null;
        authenticationFacade0.currentUser = user10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        boolean boolean7 = authenticationFacade0.authenticate("", "hi!");
        java.lang.Class<?> wildcardClass8 = authenticationFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        Authentication.User user5 = null;
        authenticationFacade0.currentUser = user5;
        Authentication.User user7 = authenticationFacade0.currentUser;
        Authentication.User user8 = authenticationFacade0.currentUser;
        boolean boolean11 = authenticationFacade0.authenticate("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        boolean boolean7 = authenticationFacade0.authenticate("hi!", "hi!");
        boolean boolean10 = authenticationFacade0.authenticate("", "");
        Authentication.User user11 = authenticationFacade0.currentUser;
        boolean boolean14 = authenticationFacade0.authenticate("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        boolean boolean7 = authenticationFacade0.authenticate("hi!", "hi!");
        boolean boolean10 = authenticationFacade0.authenticate("", "");
        boolean boolean13 = authenticationFacade0.authenticate("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        Authentication.User user1 = authenticationFacade0.currentUser;
        boolean boolean4 = authenticationFacade0.authenticate("", "hi!");
        java.lang.Class<?> wildcardClass5 = authenticationFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        boolean boolean3 = authenticationFacade0.authenticate("", "hi!");
        Authentication.User user4 = authenticationFacade0.currentUser;
        boolean boolean7 = authenticationFacade0.authenticate("hi!", "hi!");
        Authentication.User user8 = authenticationFacade0.currentUser;
        Authentication.User user9 = authenticationFacade0.currentUser;
        Authentication.User user10 = authenticationFacade0.currentUser;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        Authentication.AuthenticationFacade authenticationFacade0 = Authentication.AuthenticationFacade.getInstance();
        Authentication.User user1 = authenticationFacade0.currentUser;
        boolean boolean4 = authenticationFacade0.authenticate("", "");
        Authentication.User user5 = null;
        authenticationFacade0.currentUser = user5;
        boolean boolean9 = authenticationFacade0.authenticate("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authenticationFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}
