package javasenderudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author ACER
 */
public class JavaReceiveUDP {
    public static void main(String[] args) {
        try {
            byte[] buffer = new byte[65536]; 
            DatagramPacket incoming = new DatagramPacket(buffer,buffer.length);
            DatagramSocket ds = new DatagramSocket(2134);
            ds.receive(incoming);
            byte[] data = incoming.getData();
            String s = new String(data, 0, data.length);
            System.out.println("Port " + incoming.getPort() + " on " + incoming.getAddress() + " sent this message:");
            System.out.println(s);
        }catch (IOException e) {
            System.err.println(e);
        }
    }
}