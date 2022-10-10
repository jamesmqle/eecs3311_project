package Authentication;

class AuthenticationFacade {

    //Singleton
    private static final AuthenticationFacade authentication = new AuthenticationFacade();
    private AuthenticationFacade() {}
    public static AuthenticationFacade getInstance() {
        return authentication;
    }

}