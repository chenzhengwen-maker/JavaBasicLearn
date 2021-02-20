package networklearn;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramSocketSendTest {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket();
            byte[] by = "hello,atguigu.com".getBytes();
            DatagramPacket dp = new DatagramPacket(by, 0, by.length,
                    InetAddress.getByName("127.0.0.1"), 10000);
            ds.send(dp);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ds != null)
                ds.close();
        }

    }
}
