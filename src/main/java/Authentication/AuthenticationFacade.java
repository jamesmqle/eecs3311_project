package Authentication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AuthenticationFacade {

    //Singleton
    private static final AuthenticationFacade authentication = new AuthenticationFacade();
    private AuthenticationFacade() {}
    public static AuthenticationFacade getInstance() {
        return authentication;
    }

    public boolean authenticate(String username,String password){
        String path = "src/main/resources/database.csv";
        File file = new File(path);
        try{
            Scanner input = new Scanner(file);
            input.nextLine();
            while(input.hasNext()){
                String line = input.nextLine();
                String[] data = line.split(",");
                if(data[0].equals(username.trim()) && data[1].equals(password.trim())){
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

}