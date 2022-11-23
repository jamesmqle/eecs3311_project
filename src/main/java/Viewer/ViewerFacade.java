package Viewer;

import GUI.GUI;
import Viewer.Viewers.*;

import javax.swing.*;
import java.util.*;

public class ViewerFacade {

    //Singleton
    private static final ViewerFacade viewer = new ViewerFacade();
    private ViewerFacade() {}
    public static ViewerFacade getInstance() {
        return viewer;
    }

    private final ViewerFactory viewerFactory = new ViewerFactory();

    private Map<String, Viewer> currentViewers = new LinkedHashMap<>();

    public void addViewer(String type) {
        type = type.replaceAll(" ", "");

        // Check if viewer already exists
        if(currentViewers.containsKey(type))
            return;

        Viewer newViewer = viewerFactory.buildViewer(type);
        currentViewers.put(type, newViewer);
        newViewer.add(true);
    }

    public void removeViewer(String type) {
        type = type.replaceAll(" ", "");

        // Check if viewer exists to remove
        if(!currentViewers.containsKey(type))
            return;

        Viewer removeViewer = currentViewers.get(type);
        removeViewer.remove(true);

        currentViewers.remove(type);
    }

    public void refreshViewers() {
        for (String viewerType: currentViewers.keySet()) {
            currentViewers.get(viewerType).remove(false);

            Viewer refreshedViewer = viewerFactory.buildViewer(viewerType);
            currentViewers.put(viewerType, refreshedViewer);
            refreshedViewer.add(false);
        }

        GUI.getInstance().refreshMainUI();
    }

}