package IoLearn;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
        // 创建缓冲流对象：它是处理流，是对节点流的包装
        br = new BufferedReader(new FileReader("D:"+File.separator+"IOTtest"+File.separator+"dir1"+File.separator+"dir2"+File.separator+"test.txt"));
        bw = new BufferedWriter(new FileWriter("D:"+File.separator+"IOTtest"+File.separator+"dir1"+File.separator+"dir2"+File.separator+"test1.txt"));
        String str;
        while ((str = br.readLine()) != null) { // 一次读取字符文本文件的一行字符
            bw.write(str); // 一次写入一行字符串
            bw.newLine(); // 写入行分隔符
        }
        bw.flush(); // 刷新缓冲区
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
    // 关闭IO流对象
        try {
            if (bw != null) {
                bw.close(); // 关闭过滤流时,会自动关闭它所包装的底层节点流
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (br != null) {
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
}
