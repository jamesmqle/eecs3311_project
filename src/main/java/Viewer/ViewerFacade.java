package Viewer;

class ViewerFacade {

    //Singleton
    private static final ViewerFacade viewer = new ViewerFacade();
    private ViewerFacade() {}
    public static ViewerFacade getInstance() {
        return viewer;
    }

}