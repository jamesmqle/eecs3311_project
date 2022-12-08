package Randoop.Viewer_Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ViewerFactoryTest0 {

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
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        java.lang.Class<?> wildcardClass1 = viewerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test03");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        java.lang.Class<?> wildcardClass5 = viewerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test04");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        java.lang.Class<?> wildcardClass9 = viewerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test05");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        java.lang.Class<?> wildcardClass7 = viewerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test06");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("");
        java.lang.Class<?> wildcardClass13 = viewerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test07");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        java.lang.Class<?> wildcardClass11 = viewerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test08");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("hi!");
        java.lang.Class<?> wildcardClass13 = viewerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test09");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = viewer8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test10");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer14 = viewerFactory0.buildViewer("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = viewer14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer14);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test11");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("hi!");
        java.lang.Class<?> wildcardClass7 = viewerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test12");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = viewer12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test13");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test14");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("");
        java.lang.Class<?> wildcardClass11 = viewerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test15");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer14 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer16 = viewerFactory0.buildViewer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = viewer16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer16);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test16");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        java.lang.Class<?> wildcardClass3 = viewerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test17");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = viewer6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test18");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = viewer6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test19");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test20");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test21");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test22");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer14 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer16 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer18 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer20 = viewerFactory0.buildViewer("");
        java.lang.Class<?> wildcardClass21 = viewerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test23");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer14 = viewerFactory0.buildViewer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = viewer14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer14);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test24");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer14 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer16 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer18 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer20 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer22 = viewerFactory0.buildViewer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = viewer22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer22);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test25");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer14 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer16 = viewerFactory0.buildViewer("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer16);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test26");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test27");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = viewer12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test28");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = viewer10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test29");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer14 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer16 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer18 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer20 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer22 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer24 = viewerFactory0.buildViewer("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer24);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test30");
        Viewer.ViewerFactory viewerFactory0 = new Viewer.ViewerFactory();
        Viewer.Viewers.Viewer viewer2 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer4 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer6 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer8 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer10 = viewerFactory0.buildViewer("hi!");
        Viewer.Viewers.Viewer viewer12 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer14 = viewerFactory0.buildViewer("");
        Viewer.Viewers.Viewer viewer16 = viewerFactory0.buildViewer("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(viewer16);
    }
}

