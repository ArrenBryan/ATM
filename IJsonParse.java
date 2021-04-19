package w13_guiATM;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author arrenbryan
 */
public interface IJsonParse extends IConfig {

    static void serializeAccount(Account[] accountList) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
                
        try (FileWriter writer = new FileWriter(FILEPATHJSON)) {
            gson.toJson(accountList, writer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static Account[] deserializeAccount() {
        try {
            Account[] accountList = new Gson().fromJson(
                    new FileReader(FILEPATHJSON),
                    Account[].class
            );
            
            return accountList;
        } catch (JsonIOException | JsonSyntaxException | FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        return null;
    }
}
