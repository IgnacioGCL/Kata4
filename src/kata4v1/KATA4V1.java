package kata4v1;

import java.io.File;

public class KATA4V1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\usuario");
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
