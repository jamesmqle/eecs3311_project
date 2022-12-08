package Randoop.Viewer_Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ScatterChartTest0 {

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
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        java.lang.Class<?> wildcardClass1 = scatterChart0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test03");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.remove(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.removeViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test04");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        com.google.gson.JsonObject[][] jsonObjectArray11 = new com.google.gson.JsonObject[][] {};
        java.util.ArrayList<java.lang.String> strList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.update(jsonObjectArray11, "hi!", "", "", strList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.contains(Object)\" because \"supportedViewers\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray11);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test05");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.add(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.addViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test06");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = scatterChart0.viewerPanel;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.remove(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.removeViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel11);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test07");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = scatterChart0.viewerPanel;
        java.lang.Class<?> wildcardClass12 = scatterChart0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test08");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        Viewer.Viewers.ScatterChart scatterChart13 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        scatterChart13.update(jsonObjectArray14, "", "", "hi!", strList21);
        javax.swing.JPanel jPanel24 = scatterChart13.viewerPanel;
        scatterChart0.viewerPanel = jPanel24;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.remove(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.removeViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel24);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test09");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        com.google.gson.JsonObject jsonObject13 = null;
        com.google.gson.JsonObject[] jsonObjectArray14 = new com.google.gson.JsonObject[] { jsonObject13 };
        com.google.gson.JsonObject jsonObject15 = null;
        com.google.gson.JsonObject[] jsonObjectArray16 = new com.google.gson.JsonObject[] { jsonObject15 };
        com.google.gson.JsonObject jsonObject17 = null;
        com.google.gson.JsonObject[] jsonObjectArray18 = new com.google.gson.JsonObject[] { jsonObject17 };
        com.google.gson.JsonObject jsonObject19 = null;
        com.google.gson.JsonObject[] jsonObjectArray20 = new com.google.gson.JsonObject[] { jsonObject19 };
        com.google.gson.JsonObject jsonObject21 = null;
        com.google.gson.JsonObject[] jsonObjectArray22 = new com.google.gson.JsonObject[] { jsonObject21 };
        com.google.gson.JsonObject[][] jsonObjectArray23 = new com.google.gson.JsonObject[][] { jsonObjectArray14, jsonObjectArray16, jsonObjectArray18, jsonObjectArray20, jsonObjectArray22 };
        Viewer.Viewers.ScatterChart scatterChart27 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray28 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        scatterChart27.update(jsonObjectArray28, "", "", "hi!", strList35);
        com.google.gson.JsonObject[] jsonObjectArray38 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray39 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray40 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray41 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray42 = new com.google.gson.JsonObject[][] { jsonObjectArray38, jsonObjectArray39, jsonObjectArray40, jsonObjectArray41 };
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        scatterChart27.update(jsonObjectArray42, "", "hi!", "hi!", strList49);
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.update(jsonObjectArray23, "", "", "", strList49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.swing.JPanel.removeAll()\" because \"this.viewerPanel\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test10");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        Viewer.Viewers.ScatterChart scatterChart13 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        scatterChart13.update(jsonObjectArray14, "", "", "hi!", strList21);
        com.google.gson.JsonObject[] jsonObjectArray24 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray25 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray26 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray27 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray28 = new com.google.gson.JsonObject[][] { jsonObjectArray24, jsonObjectArray25, jsonObjectArray26, jsonObjectArray27 };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        scatterChart13.update(jsonObjectArray28, "", "hi!", "hi!", strList35);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.update(jsonObjectArray28, "hi!", "", "hi!", strList44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.swing.JPanel.removeAll()\" because \"this.viewerPanel\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test11");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        Viewer.Viewers.ScatterChart scatterChart13 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        scatterChart13.update(jsonObjectArray14, "", "", "hi!", strList21);
        javax.swing.JPanel jPanel24 = scatterChart13.viewerPanel;
        scatterChart0.viewerPanel = jPanel24;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.add(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.addViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel24);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test12");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        javax.swing.JPanel jPanel13 = null;
        scatterChart0.viewerPanel = jPanel13;
        Viewer.Viewers.ScatterChart scatterChart15 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        scatterChart15.update(jsonObjectArray16, "", "", "hi!", strList23);
        com.google.gson.JsonObject[] jsonObjectArray26 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray27 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray28 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray29 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray30 = new com.google.gson.JsonObject[][] { jsonObjectArray26, jsonObjectArray27, jsonObjectArray28, jsonObjectArray29 };
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        scatterChart15.update(jsonObjectArray30, "", "hi!", "hi!", strList37);
        Viewer.Viewers.ScatterChart scatterChart43 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel44 = scatterChart43.viewerPanel;
        com.google.gson.JsonObject[] jsonObjectArray45 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray46 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray47 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray48 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray49 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray50 = new com.google.gson.JsonObject[][] { jsonObjectArray45, jsonObjectArray46, jsonObjectArray47, jsonObjectArray48, jsonObjectArray49 };
        Viewer.Viewers.ScatterChart scatterChart54 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray55 = null;
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        scatterChart54.update(jsonObjectArray55, "", "", "hi!", strList62);
        scatterChart43.update(jsonObjectArray50, "", "", "", strList62);
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.update(jsonObjectArray30, "hi!", "hi!", "hi!", strList62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.swing.JPanel.removeAll()\" because \"this.viewerPanel\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test13");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        Viewer.Viewers.ScatterChart scatterChart13 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        scatterChart13.update(jsonObjectArray14, "", "", "hi!", strList21);
        javax.swing.JPanel jPanel24 = scatterChart13.viewerPanel;
        scatterChart0.viewerPanel = jPanel24;
        Viewer.Viewers.ScatterChart scatterChart26 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray27 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        scatterChart26.update(jsonObjectArray27, "", "", "hi!", strList34);
        javax.swing.JPanel jPanel37 = scatterChart26.viewerPanel;
        scatterChart0.viewerPanel = jPanel37;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.add(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.addViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel37);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test14");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        Viewer.Viewers.ScatterChart scatterChart11 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel12 = scatterChart11.viewerPanel;
        Viewer.Viewers.ScatterChart scatterChart13 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        scatterChart13.update(jsonObjectArray14, "", "", "hi!", strList21);
        com.google.gson.JsonObject[] jsonObjectArray24 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray25 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray26 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray27 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray28 = new com.google.gson.JsonObject[][] { jsonObjectArray24, jsonObjectArray25, jsonObjectArray26, jsonObjectArray27 };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        scatterChart13.update(jsonObjectArray28, "", "hi!", "hi!", strList35);
        Viewer.Viewers.ScatterChart scatterChart41 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel42 = scatterChart41.viewerPanel;
        com.google.gson.JsonObject[] jsonObjectArray43 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray44 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray45 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray46 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray47 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray48 = new com.google.gson.JsonObject[][] { jsonObjectArray43, jsonObjectArray44, jsonObjectArray45, jsonObjectArray46, jsonObjectArray47 };
        Viewer.Viewers.ScatterChart scatterChart52 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray53 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        scatterChart52.update(jsonObjectArray53, "", "", "hi!", strList60);
        scatterChart41.update(jsonObjectArray48, "", "", "", strList60);
        scatterChart11.update(jsonObjectArray28, "hi!", "", "hi!", strList60);
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        scatterChart0.update(jsonObjectArray28, "hi!", "", "", strList70);
        javax.swing.JPanel jPanel73 = scatterChart0.viewerPanel;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.remove(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.removeViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel73);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test15");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        Viewer.Viewers.ScatterChart scatterChart13 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        scatterChart13.update(jsonObjectArray14, "", "", "hi!", strList21);
        javax.swing.JPanel jPanel24 = scatterChart13.viewerPanel;
        scatterChart0.viewerPanel = jPanel24;
        Viewer.Viewers.ScatterChart scatterChart26 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray27 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        scatterChart26.update(jsonObjectArray27, "", "", "hi!", strList34);
        javax.swing.JPanel jPanel37 = scatterChart26.viewerPanel;
        scatterChart0.viewerPanel = jPanel37;
        Viewer.Viewers.ScatterChart scatterChart39 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel40 = scatterChart39.viewerPanel;
        scatterChart0.viewerPanel = jPanel40;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel40);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test16");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        Viewer.Viewers.ScatterChart scatterChart1 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        scatterChart1.update(jsonObjectArray2, "", "", "hi!", strList9);
        javax.swing.JPanel jPanel12 = scatterChart1.viewerPanel;
        scatterChart0.viewerPanel = jPanel12;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.remove(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.removeViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel12);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test17");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        com.google.gson.JsonObject[] jsonObjectArray13 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray14 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray15 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray16 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray17 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray18 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray19 = new com.google.gson.JsonObject[][] { jsonObjectArray13, jsonObjectArray14, jsonObjectArray15, jsonObjectArray16, jsonObjectArray17, jsonObjectArray18 };
        Viewer.Viewers.ScatterChart scatterChart23 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray24 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        scatterChart23.update(jsonObjectArray24, "", "", "hi!", strList31);
        Viewer.Viewers.ScatterChart scatterChart34 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel35 = scatterChart34.viewerPanel;
        Viewer.Viewers.ScatterChart scatterChart36 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray37 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        scatterChart36.update(jsonObjectArray37, "", "", "hi!", strList44);
        com.google.gson.JsonObject[] jsonObjectArray47 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray48 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray49 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray50 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray51 = new com.google.gson.JsonObject[][] { jsonObjectArray47, jsonObjectArray48, jsonObjectArray49, jsonObjectArray50 };
        java.lang.String[] strArray57 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        scatterChart36.update(jsonObjectArray51, "", "hi!", "hi!", strList58);
        Viewer.Viewers.ScatterChart scatterChart64 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel65 = scatterChart64.viewerPanel;
        com.google.gson.JsonObject[] jsonObjectArray66 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray67 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray68 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray69 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray70 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray71 = new com.google.gson.JsonObject[][] { jsonObjectArray66, jsonObjectArray67, jsonObjectArray68, jsonObjectArray69, jsonObjectArray70 };
        Viewer.Viewers.ScatterChart scatterChart75 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray76 = null;
        java.lang.String[] strArray82 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        scatterChart75.update(jsonObjectArray76, "", "", "hi!", strList83);
        scatterChart64.update(jsonObjectArray71, "", "", "", strList83);
        scatterChart34.update(jsonObjectArray51, "hi!", "", "hi!", strList83);
        java.lang.String[] strArray92 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList93 = new java.util.ArrayList<java.lang.String>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList93, strArray92);
        scatterChart23.update(jsonObjectArray51, "hi!", "", "", strList93);
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.update(jsonObjectArray19, "", "", "hi!", strList93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.swing.JPanel.removeAll()\" because \"this.viewerPanel\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test18");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        java.lang.Class<?> wildcardClass11 = scatterChart0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test19");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        Viewer.Viewers.ScatterChart scatterChart11 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel12 = scatterChart11.viewerPanel;
        Viewer.Viewers.ScatterChart scatterChart13 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        scatterChart13.update(jsonObjectArray14, "", "", "hi!", strList21);
        com.google.gson.JsonObject[] jsonObjectArray24 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray25 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray26 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray27 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray28 = new com.google.gson.JsonObject[][] { jsonObjectArray24, jsonObjectArray25, jsonObjectArray26, jsonObjectArray27 };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        scatterChart13.update(jsonObjectArray28, "", "hi!", "hi!", strList35);
        Viewer.Viewers.ScatterChart scatterChart41 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel42 = scatterChart41.viewerPanel;
        com.google.gson.JsonObject[] jsonObjectArray43 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray44 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray45 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray46 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray47 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray48 = new com.google.gson.JsonObject[][] { jsonObjectArray43, jsonObjectArray44, jsonObjectArray45, jsonObjectArray46, jsonObjectArray47 };
        Viewer.Viewers.ScatterChart scatterChart52 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray53 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        scatterChart52.update(jsonObjectArray53, "", "", "hi!", strList60);
        scatterChart41.update(jsonObjectArray48, "", "", "", strList60);
        scatterChart11.update(jsonObjectArray28, "hi!", "", "hi!", strList60);
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        scatterChart0.update(jsonObjectArray28, "hi!", "", "", strList70);
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.remove(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.removeViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test20");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        Viewer.Viewers.ScatterChart scatterChart1 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        scatterChart1.update(jsonObjectArray2, "", "", "hi!", strList9);
        javax.swing.JPanel jPanel12 = scatterChart1.viewerPanel;
        scatterChart0.viewerPanel = jPanel12;
        java.lang.Class<?> wildcardClass14 = scatterChart0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test21");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        javax.swing.JPanel jPanel13 = null;
        scatterChart0.viewerPanel = jPanel13;
        javax.swing.JPanel jPanel15 = scatterChart0.viewerPanel;
        javax.swing.JPanel jPanel16 = scatterChart0.viewerPanel;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.remove(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.removeViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPanel15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPanel16);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test22");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        javax.swing.JPanel jPanel13 = null;
        scatterChart0.viewerPanel = jPanel13;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.remove(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.removeViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test23");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel1 = scatterChart0.viewerPanel;
        com.google.gson.JsonObject[] jsonObjectArray2 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray3 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray4 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray5 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray6 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray7 = new com.google.gson.JsonObject[][] { jsonObjectArray2, jsonObjectArray3, jsonObjectArray4, jsonObjectArray5, jsonObjectArray6 };
        Viewer.Viewers.ScatterChart scatterChart11 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        scatterChart11.update(jsonObjectArray12, "", "", "hi!", strList19);
        scatterChart0.update(jsonObjectArray7, "", "", "", strList19);
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.add(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.addViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test24");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        Viewer.Viewers.ScatterChart scatterChart1 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        scatterChart1.update(jsonObjectArray2, "", "", "hi!", strList9);
        javax.swing.JPanel jPanel12 = scatterChart1.viewerPanel;
        scatterChart0.viewerPanel = jPanel12;
        Viewer.Viewers.ScatterChart scatterChart14 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        scatterChart14.update(jsonObjectArray15, "", "", "hi!", strList22);
        Viewer.Viewers.ScatterChart scatterChart25 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel26 = scatterChart25.viewerPanel;
        Viewer.Viewers.ScatterChart scatterChart27 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray28 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        scatterChart27.update(jsonObjectArray28, "", "", "hi!", strList35);
        com.google.gson.JsonObject[] jsonObjectArray38 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray39 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray40 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray41 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray42 = new com.google.gson.JsonObject[][] { jsonObjectArray38, jsonObjectArray39, jsonObjectArray40, jsonObjectArray41 };
        java.lang.String[] strArray48 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        scatterChart27.update(jsonObjectArray42, "", "hi!", "hi!", strList49);
        Viewer.Viewers.ScatterChart scatterChart55 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel56 = scatterChart55.viewerPanel;
        com.google.gson.JsonObject[] jsonObjectArray57 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray58 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray59 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray60 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray61 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray62 = new com.google.gson.JsonObject[][] { jsonObjectArray57, jsonObjectArray58, jsonObjectArray59, jsonObjectArray60, jsonObjectArray61 };
        Viewer.Viewers.ScatterChart scatterChart66 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray67 = null;
        java.lang.String[] strArray73 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        scatterChart66.update(jsonObjectArray67, "", "", "hi!", strList74);
        scatterChart55.update(jsonObjectArray62, "", "", "", strList74);
        scatterChart25.update(jsonObjectArray42, "hi!", "", "hi!", strList74);
        java.lang.String[] strArray83 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        scatterChart14.update(jsonObjectArray42, "hi!", "", "", strList84);
        javax.swing.JPanel jPanel87 = scatterChart14.viewerPanel;
        scatterChart0.viewerPanel = jPanel87;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel87);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test25");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        Viewer.Viewers.ScatterChart scatterChart11 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel12 = scatterChart11.viewerPanel;
        Viewer.Viewers.ScatterChart scatterChart13 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        scatterChart13.update(jsonObjectArray14, "", "", "hi!", strList21);
        com.google.gson.JsonObject[] jsonObjectArray24 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray25 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray26 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray27 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray28 = new com.google.gson.JsonObject[][] { jsonObjectArray24, jsonObjectArray25, jsonObjectArray26, jsonObjectArray27 };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        scatterChart13.update(jsonObjectArray28, "", "hi!", "hi!", strList35);
        Viewer.Viewers.ScatterChart scatterChart41 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel42 = scatterChart41.viewerPanel;
        com.google.gson.JsonObject[] jsonObjectArray43 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray44 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray45 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray46 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray47 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray48 = new com.google.gson.JsonObject[][] { jsonObjectArray43, jsonObjectArray44, jsonObjectArray45, jsonObjectArray46, jsonObjectArray47 };
        Viewer.Viewers.ScatterChart scatterChart52 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray53 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        scatterChart52.update(jsonObjectArray53, "", "", "hi!", strList60);
        scatterChart41.update(jsonObjectArray48, "", "", "", strList60);
        scatterChart11.update(jsonObjectArray28, "hi!", "", "hi!", strList60);
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        scatterChart0.update(jsonObjectArray28, "hi!", "", "", strList70);
        Viewer.Viewers.ScatterChart scatterChart73 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel74 = scatterChart73.viewerPanel;
        scatterChart0.viewerPanel = jPanel74;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.add(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.addViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel74);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test26");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        Viewer.Viewers.ScatterChart scatterChart1 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        scatterChart1.update(jsonObjectArray2, "", "", "hi!", strList9);
        javax.swing.JPanel jPanel12 = scatterChart1.viewerPanel;
        scatterChart0.viewerPanel = jPanel12;
        java.lang.Class<?> wildcardClass14 = jPanel12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test27");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        javax.swing.JPanel jPanel1 = scatterChart0.viewerPanel;
        com.google.gson.JsonObject[] jsonObjectArray2 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray3 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray4 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray5 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray6 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray7 = new com.google.gson.JsonObject[][] { jsonObjectArray2, jsonObjectArray3, jsonObjectArray4, jsonObjectArray5, jsonObjectArray6 };
        Viewer.Viewers.ScatterChart scatterChart11 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        scatterChart11.update(jsonObjectArray12, "", "", "hi!", strList19);
        scatterChart0.update(jsonObjectArray7, "", "", "hi!", strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test28");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        Viewer.Viewers.ScatterChart scatterChart13 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        scatterChart13.update(jsonObjectArray14, "", "", "hi!", strList21);
        javax.swing.JPanel jPanel24 = scatterChart13.viewerPanel;
        scatterChart0.viewerPanel = jPanel24;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.remove(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.removeViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel24);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test29");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        com.google.gson.JsonObject[] jsonObjectArray11 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray12 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray13 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[] jsonObjectArray14 = new com.google.gson.JsonObject[] {};
        com.google.gson.JsonObject[][] jsonObjectArray15 = new com.google.gson.JsonObject[][] { jsonObjectArray11, jsonObjectArray12, jsonObjectArray13, jsonObjectArray14 };
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        scatterChart0.update(jsonObjectArray15, "", "hi!", "hi!", strList22);
        Viewer.Viewers.ScatterChart scatterChart25 = new Viewer.Viewers.ScatterChart();
        Viewer.Viewers.ScatterChart scatterChart26 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray27 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        scatterChart26.update(jsonObjectArray27, "", "", "hi!", strList34);
        javax.swing.JPanel jPanel37 = scatterChart26.viewerPanel;
        scatterChart25.viewerPanel = jPanel37;
        scatterChart0.viewerPanel = jPanel37;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jsonObjectArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel37);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Authentication_Randoop.RegressionTest0.test30");
        Viewer.Viewers.ScatterChart scatterChart0 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        scatterChart0.update(jsonObjectArray1, "", "", "hi!", strList8);
        javax.swing.JPanel jPanel11 = null;
        scatterChart0.viewerPanel = jPanel11;
        Viewer.Viewers.ScatterChart scatterChart13 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        scatterChart13.update(jsonObjectArray14, "", "", "hi!", strList21);
        javax.swing.JPanel jPanel24 = scatterChart13.viewerPanel;
        scatterChart0.viewerPanel = jPanel24;
        Viewer.Viewers.ScatterChart scatterChart26 = new Viewer.Viewers.ScatterChart();
        Viewer.Viewers.ScatterChart scatterChart27 = new Viewer.Viewers.ScatterChart();
        com.google.gson.JsonObject[][] jsonObjectArray28 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        scatterChart27.update(jsonObjectArray28, "", "", "hi!", strList35);
        javax.swing.JPanel jPanel38 = scatterChart27.viewerPanel;
        scatterChart26.viewerPanel = jPanel38;
        scatterChart0.viewerPanel = jPanel38;
        // The following exception was thrown during execution in test generation
        try {
            scatterChart0.remove(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"GUI.MainUI.removeViewer(javax.swing.JPanel, boolean)\" because \"GUI.GUIFacade.getInstance().mainFrame\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel38);
    }
}

