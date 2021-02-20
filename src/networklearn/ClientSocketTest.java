package networklearn;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocketTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        outputStream.write("11111".getBytes());
        outputStream.flush();
        socket.shutdownOutput();
        byte[] data = new byte[1024];
        int len;
        while((len = inputStream.read(data))!=-1){
            System.out.println(new String(data,0,len));
        }
        socket.close();



    }
}
