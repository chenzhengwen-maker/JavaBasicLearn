package networklearn;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        byte[] data = new byte[1024];
        int len;
        while((len = inputStream.read(data))!=-1){
            System.out.println(new String(data,0,len));
        }
        outputStream.write("欢迎光临".getBytes());
        outputStream.flush();
        socket.close();
        serverSocket.close();



    }
}
