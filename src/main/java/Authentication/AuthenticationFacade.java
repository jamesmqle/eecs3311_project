package Authentication;

import com.google.gson.JsonObject;

public class AuthenticationFacade {

    //Singleton
    private static final AuthenticationFacade authentication = new AuthenticationFacade();
    private AuthenticationFacade() {}
    public static AuthenticationFacade getInstance() {
        return authentication;
    }

    private DatabaseTable usersDatabase = new DatabaseTable("src/main/resources/database/users.csv");

    public User currentUser = new User("");

    public boolean authenticate(String username,String password) {

        JsonObject[] usersData = usersDatabase.getData();

        for (JsonObject user : usersData) {
            if(user.get("username").getAsString().equals(username.trim()) && user.get("password").getAsString().equals(password.trim())) {
                currentUser.setUsername(username.trim());
                return true;
            }
        }

        return false;
    }

}