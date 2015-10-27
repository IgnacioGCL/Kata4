
package kata4v1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class KATA4V3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String from = "C:\\Users\\usuario\\Downloads\\Enunciado Kata 2.pdf";
        String to = "C:\\Users\\usuario\\Downloads\\Enunciado Kata 2.txt";
        
        InputStream input = new BufferedInputStream(new FileInputStream(new File(from)));
        OutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));
        
        long empieza = System.currentTimeMillis();
        while(true){
            int read = input.read();
            if(read<0) break;
            output.write(read);    
        }
        System.out.println(System.currentTimeMillis()-empieza);
        input.close();
        output.flush();
        output.close();
    }
    
}
