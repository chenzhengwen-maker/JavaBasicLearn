package IoLearn;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            fr = new FileReader(new File("D:"+File.separator+"IOTtest"+File.separator+"dir1"+File.separator+"dir2"+File.separator+"test.txt"));
            char[] buf = new char[1024];
            int len;
            while((len = fr.read(buf))!=-1){
                System.out.println(new String(buf,0,len));
            }

        }catch(IOException e){
            e.printStackTrace();

        }finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("close-Exception :" + e.getMessage());
                }
            }
        }
    }
}
