package Randoop.Analysis_Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnalysisFacadeTest0 {

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
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        java.lang.Class<?> wildcardClass2 = analysisFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        analysisFacade0.setAnalysis("");
        java.lang.Class<?> wildcardClass3 = analysisFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Viewer.Viewers.Viewer viewer1 = null;
        analysisFacade0.detach(viewer1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisFacade0.getAnalysis();
        // The following exception was thrown during execution in test generation
        try {
            analysisFacade0.runAnalysis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.runAnalysis()\" because \"this.analysisStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy3 = analysisFacade0.getAnalysis();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisFacade0.getAnalysis();
        analysisFacade0.setAnalysis("");
        java.lang.Class<?> wildcardClass5 = analysisFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisFacade0.getAnalysis();
        Viewer.Viewers.Viewer viewer3 = null;
        analysisFacade0.detach(viewer3);
        // The following exception was thrown during execution in test generation
        try {
            analysisFacade0.runAnalysis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.runAnalysis()\" because \"this.analysisStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Viewer.Viewers.Viewer viewer1 = null;
        analysisFacade0.detach(viewer1);
        java.lang.Class<?> wildcardClass3 = analysisFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Viewer.Viewers.Viewer viewer1 = null;
        analysisFacade0.attach(viewer1);
        Viewer.Viewers.Viewer viewer3 = null;
        analysisFacade0.attach(viewer3);
        analysisFacade0.setAnalysis("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Viewer.Viewers.Viewer viewer1 = null;
        analysisFacade0.attach(viewer1);
        // The following exception was thrown during execution in test generation
        try {
            analysisFacade0.runAnalysis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Analysis.AnalysisStrategy.runAnalysis()\" because \"this.analysisStrategy\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisFacade0.getAnalysis();
        Viewer.Viewers.Viewer viewer3 = null;
        analysisFacade0.detach(viewer3);
        java.lang.Class<?> wildcardClass5 = analysisFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Viewer.Viewers.Viewer viewer1 = null;
        analysisFacade0.detach(viewer1);
        Viewer.Viewers.Viewer viewer3 = null;
        analysisFacade0.detach(viewer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisFacade0.getAnalysis();
        analysisFacade0.setAnalysis("hi!");
        Viewer.Viewers.Viewer viewer5 = null;
        analysisFacade0.detach(viewer5);
        Viewer.Viewers.Viewer viewer7 = null;
        analysisFacade0.attach(viewer7);
        analysisFacade0.setAnalysis("hi!");
        Viewer.Viewers.Viewer viewer11 = null;
        analysisFacade0.detach(viewer11);
        java.lang.Class<?> wildcardClass13 = analysisFacade0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisFacade0.getAnalysis();
        analysisFacade0.setAnalysis("hi!");
        analysisFacade0.setAnalysis("");
        analysisFacade0.setAnalysis("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisFacade0.getAnalysis();
        analysisFacade0.setAnalysis("hi!");
        Viewer.Viewers.Viewer viewer5 = null;
        analysisFacade0.detach(viewer5);
        Viewer.Viewers.Viewer viewer7 = null;
        analysisFacade0.detach(viewer7);
        Viewer.Viewers.Viewer viewer9 = null;
        analysisFacade0.detach(viewer9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisFacade0.getAnalysis();
        analysisFacade0.setAnalysis("");
        Viewer.Viewers.Viewer viewer5 = null;
        analysisFacade0.attach(viewer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Viewer.Viewers.Viewer viewer1 = null;
        analysisFacade0.detach(viewer1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisFacade0.getAnalysis();
        analysisFacade0.setAnalysis("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisFacade0.getAnalysis();
        analysisFacade0.setAnalysis("hi!");
        Viewer.Viewers.Viewer viewer5 = null;
        analysisFacade0.detach(viewer5);
        Viewer.Viewers.Viewer viewer7 = null;
        analysisFacade0.attach(viewer7);
        analysisFacade0.setAnalysis("hi!");
        Viewer.Viewers.Viewer viewer11 = null;
        analysisFacade0.detach(viewer11);
        Analysis.AnalysisStrategy analysisStrategy13 = analysisFacade0.getAnalysis();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy13);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisFacade0.getAnalysis();
        Viewer.Viewers.Viewer viewer3 = null;
        analysisFacade0.detach(viewer3);
        Viewer.Viewers.Viewer viewer5 = null;
        analysisFacade0.detach(viewer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy2 = analysisFacade0.getAnalysis();
        analysisFacade0.setAnalysis("hi!");
        Viewer.Viewers.Viewer viewer5 = null;
        analysisFacade0.detach(viewer5);
        Viewer.Viewers.Viewer viewer7 = null;
        analysisFacade0.detach(viewer7);
        Viewer.Viewers.Viewer viewer9 = null;
        analysisFacade0.attach(viewer9);
        analysisFacade0.setAnalysis("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Viewer.Viewers.Viewer viewer1 = null;
        analysisFacade0.attach(viewer1);
        Viewer.Viewers.Viewer viewer3 = null;
        analysisFacade0.attach(viewer3);
        Viewer.Viewers.Viewer viewer5 = null;
        analysisFacade0.attach(viewer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Viewer.Viewers.Viewer viewer1 = null;
        analysisFacade0.detach(viewer1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisFacade0.getAnalysis();
        Analysis.AnalysisStrategy analysisStrategy4 = analysisFacade0.getAnalysis();
        Viewer.Viewers.Viewer viewer5 = null;
        analysisFacade0.detach(viewer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Analysis.AnalysisStrategy analysisStrategy1 = analysisFacade0.getAnalysis();
        analysisFacade0.setAnalysis("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Analysis.AnalysisFacade analysisFacade0 = Analysis.AnalysisFacade.getInstance();
        Viewer.Viewers.Viewer viewer1 = null;
        analysisFacade0.detach(viewer1);
        Analysis.AnalysisStrategy analysisStrategy3 = analysisFacade0.getAnalysis();
        analysisFacade0.setAnalysis("");
        analysisFacade0.setAnalysis("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(analysisFacade0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(analysisStrategy3);
    }
}

