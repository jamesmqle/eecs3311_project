package Viewer;

import GUI.GUIFacade;
import Viewer.Viewers.*;
import com.google.gson.JsonObject;
import org.junit.jupiter.api.*;

import javax.swing.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ViewerTest {

    private static ViewerFactory viewerFactory;

    @BeforeAll
    public static void setUp() {
        viewerFactory = new ViewerFactory();
        GUIFacade.getInstance().mainUI();
    }

    @Test
    public void TestBuildViewer1() {
        Viewer builtViewer = viewerFactory.buildViewer("BarChart");

        assertEquals(BarChart.class, builtViewer.getClass());
    }

    @Test
    public void TestBuildViewer2() {
        Viewer builtViewer = viewerFactory.buildViewer("LineChart");

        assertEquals(LineChart.class, builtViewer.getClass());
    }

    @Test
    public void TestBuildViewer3() {
        Viewer builtViewer = viewerFactory.buildViewer("ScatterChart");

        assertEquals(ScatterChart.class, builtViewer.getClass());
    }

    @Test
    public void TestBuildViewer4() {
        Viewer builtViewer = viewerFactory.buildViewer("Report");

        assertEquals(Report.class, builtViewer.getClass());
    }

    @Test
    public void TestBuildViewer5() {
        Viewer builtViewer = viewerFactory.buildViewer("PieChart");

        assertEquals(PieChart.class, builtViewer.getClass());
    }

    @Test
    public void TestBuildViewer6() {
        Viewer builtViewer = viewerFactory.buildViewer("TimeSeries");

        assertEquals(TimeSeriesChart.class, builtViewer.getClass());
    }

    @Test
    public void TestBuildViewer7() {
        Viewer builtViewer = viewerFactory.buildViewer("HelloChart");

        assertNull(builtViewer);
    }

    @Test
    public void TestAddViewer1() {
        ViewerFacade.getInstance().clearViewers();
        ViewerFacade.getInstance().addViewer("BarChart");

        assertEquals(JPanel.class, GUIFacade.getInstance().mainFrame.viewerPanel.getComponents()[0].getClass());
    }

    @Test
    public void TestAddViewer2() {
        ViewerFacade.getInstance().clearViewers();
        ViewerFacade.getInstance().addViewer("LineChart");
        ViewerFacade.getInstance().addViewer("PieChart");

        assertEquals(JPanel.class, GUIFacade.getInstance().mainFrame.viewerPanel.getComponents()[0].getClass());
        assertEquals(JPanel.class, GUIFacade.getInstance().mainFrame.viewerPanel.getComponents()[1].getClass());
    }

    @Test
    public void TestAddViewer3() {
        ViewerFacade.getInstance().clearViewers();
        ViewerFacade.getInstance().addViewer("BarChart");
        ViewerFacade.getInstance().addViewer("BarChart");
        ViewerFacade.getInstance().addViewer("BarChart");

        assertEquals(JPanel.class, GUIFacade.getInstance().mainFrame.viewerPanel.getComponents()[0].getClass());
        assertEquals(1, GUIFacade.getInstance().mainFrame.viewerPanel.getComponents().length);
    }

    @Test
    public void TestRemoveViewer1() {
        ViewerFacade.getInstance().clearViewers();
        ViewerFacade.getInstance().addViewer("BarChart");

        assertEquals(1, GUIFacade.getInstance().mainFrame.viewerPanel.getComponents().length);

        ViewerFacade.getInstance().removeViewer("BarChart");

        assertEquals(0, GUIFacade.getInstance().mainFrame.viewerPanel.getComponents().length);
    }

    @Test
    public void TestRemoveViewer2() {
        ViewerFacade.getInstance().clearViewers();
        ViewerFacade.getInstance().addViewer("BarChart");
        ViewerFacade.getInstance().addViewer("LineChart");
        ViewerFacade.getInstance().addViewer("PieChart");

        assertEquals(3, GUIFacade.getInstance().mainFrame.viewerPanel.getComponents().length);

        ViewerFacade.getInstance().removeViewer("BarChart");

        assertEquals(2, GUIFacade.getInstance().mainFrame.viewerPanel.getComponents().length);
    }

    @Test
    public void TestRefreshViewers1() {
        ViewerFacade.getInstance().clearViewers();
        ViewerFacade.getInstance().addViewer("BarChart");
        ViewerFacade.getInstance().addViewer("LineChart");
        ViewerFacade.getInstance().addViewer("PieChart");

        assertEquals(3, GUIFacade.getInstance().mainFrame.viewerPanel.getComponents().length);

        ViewerFacade.getInstance().refreshViewers();

        assertEquals(3, GUIFacade.getInstance().mainFrame.viewerPanel.getComponents().length);
    }

    @Test
    public void TestNotSupported() {
        Viewer builtViewer = viewerFactory.buildViewer("PieChart");

        builtViewer.update(new JsonObject[0][0], "", "", "", new ArrayList<>());

        JLabel label = (JLabel)((JPanel) builtViewer.viewerPanel.getComponent(0)).getComponent(0);

        assertEquals("Not Supported", label.getText());
    }
}
