

package Lab1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class TextFileWriter implements Writer{

     private final File FILE;
     private final boolean APPEND;
    
    TextFileWriter(File file) {
        this.FILE = file;
        this.APPEND = true;
    }
    
    TextFileWriter(final File FILE, final boolean APPEND) {
        this.FILE = FILE;
        this.APPEND = APPEND;
    }
    
    public final void write(List<User> list) {
                
         try {
        PrintWriter out = new PrintWriter(
						new BufferedWriter(
						new FileWriter(FILE, APPEND)));
        
        for (User user : list) {
            out.println(user.getFirstName() + " " + user.getLastName());
            out.println(user.getAddress());
            out.println(user.getCity() + ", " + user.getState() + " " + user.getZipcode());
            out.println();
        }
        
        out.close();
        } catch (IOException IOE) {
            System.out.println(IOE.getMessage());
        }

    }

}
