

package Lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TextFileReader implements Reader{

    private final File FILE;
    
    TextFileReader(File file) {
        this.FILE = file;
    }
    
    public final List<String> read() {
        List<String> dataList = new ArrayList<String>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE));
            String line = reader.readLine();
             
	   while(line != null){
               for (String s : line.split(" ")) {
                   dataList.add(s);
               }
               
                line = reader.readLine();
	   }
            
            
            
            reader.close();
        } catch ( final IOException IOE) {
            System.out.println(IOE.getMessage());
        }
        
        return dataList;
    }

}
