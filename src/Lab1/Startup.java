

package Lab1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Startup {
    public static void main(String[] args) {
        
        File file = new File(File.separatorChar + "temp" + File.separatorChar + "lab1.txt");
        Reader reader = new TextFileReader(file);
        Writer writer = new TextFileWriter(file);
        
        for (String read : reader.read()) {
            System.out.println(read);
        }
        
        List<User> userList = new ArrayList<User>();
             userList.add(new User("Chuck", "Hanson", "123 Street", "Milwaukee", "WI", "55555") );
             userList.add(new User("Sam", "Hanson", "123 Street", "Milwaukee", "WI", "55555" ));
    
             writer.write(userList);
    }
}
