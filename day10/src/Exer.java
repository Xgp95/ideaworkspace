import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Exer {
    @Test
    public void client() {

        Socket socket = null;
        OutputStream os = null;
        BufferedInputStream bfi = null;
        InputStream is = null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet, 8989);
            os = socket.getOutputStream();
            is = socket.getInputStream();
            bfi = new BufferedInputStream(new FileInputStream("05.jpg"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bfi.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            socket.shutdownOutput();
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            while ((len = is.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }
            System.out.println(bos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bfi != null) {

                try {
                    bfi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {

                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {

                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(8989);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        os.write("传输完毕".getBytes());
        BufferedOutputStream bfo = new BufferedOutputStream(new FileOutputStream(new File("05-1.jpg")));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            bfo.write(buffer, 0, len);
        }

        bfo.close();
        is.close();
        socket.close();
    }


}
