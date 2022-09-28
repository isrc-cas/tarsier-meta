import java.net.*;
import java.io.*;

public class SocketTest {
    public static void main(String [] args) throws IOException, InterruptedException {
        var thread = new Thread(() -> {
                try {
                    var serverSocket = new ServerSocket(8389);
                    var server = serverSocket.accept();
                    System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
                    DataInputStream in = new DataInputStream(server.getInputStream());
                    System.out.println(in.readUTF());
                    DataOutputStream out = new DataOutputStream(server.getOutputStream());
                    out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
                    server.close();
                 } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        thread.start();
        var client = new Socket("127.0.0.1", 8389);
        System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
        var outToServer = client.getOutputStream();
        var out = new DataOutputStream(outToServer);
        out.writeUTF("Hello from " + client.getLocalSocketAddress());
        var inFromServer = client.getInputStream();
        var in = new DataInputStream(inFromServer);
        System.out.println("服务器响应： " + in.readUTF());
        client.close();
        thread.join();
   }
}
