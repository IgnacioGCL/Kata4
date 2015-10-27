
package kata4v1;

import java.io.File;

public class KATA4V2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\usuario");
        print(file.listFiles(), "");
    }

    private static void print(File[] files, String indent) {
        if(files==null) return;
        for (File file : files) {
            if(file.isDirectory()){
                System.out.println(indent+"D: "+file.getName());
            }
            if(file.isHidden()){
                System.out.println(indent+"FH: "+file.getName());
            }
            if(!file.isDirectory()){
                System.out.println(indent+"NoD: "+file.getName());
            }
            print(file.listFiles(), indent + "\t");
        }
    }
}
