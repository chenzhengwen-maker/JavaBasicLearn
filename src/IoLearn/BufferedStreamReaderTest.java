package IoLearn;

import java.io.*;

public class BufferedStreamReaderTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream("D:" + File.separator + "IOTtest" + File.separator + "dir1" + File.separator + "dir2" + File.separator + "test.txt")));
            String str;
            while ((str = br.readLine()) != null) { // 一次读取字符文本文件的一行字符
                System.out.println(str);
            }

        }catch(Exception e){

        }finally {
            try {
                if(br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
