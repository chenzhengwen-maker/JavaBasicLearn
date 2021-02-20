package IoLearn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(new File("D:"+File.separator+"IOTtest"+File.separator+"dir1"+File.separator+"dir2"+File.separator+"test.txt"));
            fw.write("atguigu-songhongkang");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }
}
