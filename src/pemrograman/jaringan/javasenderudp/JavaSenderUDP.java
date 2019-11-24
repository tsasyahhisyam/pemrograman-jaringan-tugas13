package javasenderudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author ACER
 */
public class JavaSenderUDP {
    
    public static void main(String[] args) throws IOException {
     InetAddress ia = InetAddress.getByName("192.168.43.153");
     int Port = 2134;
     String s = "Pesan ini dari UDP";
     byte[] b = s.getBytes();
     DatagramPacket dp = new DatagramPacket(b, b.length, ia, Port);
     DatagramSocket sender = new DatagramSocket();
     sender.send(dp);
    }
}
