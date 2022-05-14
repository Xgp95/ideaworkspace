import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramSocketTest {
    @Test
    public void sender() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String str = "这是一个UDP的测试";
        byte[] bytes = str.getBytes();
        DatagramPacket dgp = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getLocalHost(), 8989);
        socket.send(dgp);
        socket.close();
    }

    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(8989);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        DatagramPacket dgp = new DatagramPacket(buffer, 0, buffer.length);
        socket.receive(dgp);
        System.out.println(new String(dgp.getData(),0,dgp.getLength()));
    }
}
