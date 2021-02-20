package networklearn;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("www.baidu.com");
        System.out.println(address);
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        System.out.println(InetAddress.getLocalHost());

    }
}
