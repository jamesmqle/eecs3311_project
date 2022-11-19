package Viewer;

import java.util.HashMap;
import java.util.Map;

public class ViewerFacade {

    //Singleton
    private static final ViewerFacade viewer = new ViewerFacade();
    private ViewerFacade() {}
    public static ViewerFacade getInstance() {
        return viewer;
    }

    private final ViewerFactory viewerFactory = new ViewerFactory();

    private Map<String, Viewer> currentViewers = new HashMap<>();

    public void addViewer(String type) {
        type = type.replaceAll(" ", "");

        // Check if viewer already exists
        if(currentViewers.containsKey(type))
            return;

        Viewer newViewer = viewerFactory.buildViewer(type);
        currentViewers.put(type, newViewer);

        //ToDo: Need to tell the viewer to observe the current analysis
    }

    public void removeViewer(String type) {
        type = type.replaceAll(" ", "");

        // Check if viewer exists to remove
        if(!currentViewers.containsKey(type))
            return;

        Viewer removeViewer = currentViewers.get(type);
        removeViewer.remove();

        currentViewers.remove(type);
    }

}