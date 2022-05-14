import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class Exer1 {
    public static void main(String[] args) {
        int digui = digui(100);
        System.out.println(digui);
    }

    public static int digui(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + digui(n - 1);
        }
    }

    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        InputStream is = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            socket = new Socket("127.0.0.1", 8989);
            os = socket.getOutputStream();
            is = socket.getInputStream();
            fis = new FileInputStream(new File("src.txt"));
            fos = new FileOutputStream("dest.txt");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            socket.shutdownOutput();
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {

                try {
                    is.close();
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
    public void server() {
        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            ServerSocket ss = new ServerSocket(8989);
            socket = ss.accept();
            is = socket.getInputStream();
            os = socket.getOutputStream();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            String str = new String(baos.toString()).toUpperCase(Locale.ROOT);
            os.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {

                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {

                try {
                    is.close();
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
}
