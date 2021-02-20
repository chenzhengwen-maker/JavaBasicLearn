package IoLearn;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) {
        BufferedInputStream bi = null;
        try {
             bi = new BufferedInputStream(new FileInputStream("D:" + File.separator + "IOTtest" + File.separator + "dir1" + File.separator + "dir2" + File.separator + "test.txt"));
            byte[] buf = new byte[1024];
            int len;
            while ((len = bi.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }
        }catch(Exception e){
            e.getMessage();
        }finally {
            try {
                if(bi!=null) {
                    bi.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
