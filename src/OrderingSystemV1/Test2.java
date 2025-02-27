package OrderingSystemV1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Test2 {

    public static void main(String[] args) throws Exception {
        File f= new File("C:/Users/User/Desktop/test.docx");
        BufferedWriter p = new BufferedWriter(new FileWriter(f));
        p.write("dfsffffffffffffffffffffds-----------aad\nsdfsssss");
        p.close();
      
    }
}
