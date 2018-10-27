import java.net.*;
import java.io.*;
import java.util.*;

public class UDPServer {

	public static void main(String[] args) throws Exception{
		DatagramSocket soc = new DatagramSocket(3000);
		DataInputStream rfconsole = new DataInputStream(System.in);
		PrintStream otconsole = new PrintStream(System.out);
		
		InetAddress ia = InetAddress.getByName("localhost");
		otconsole.print("Server: ");
		String s = rfconsole.readLine();
		byte[] b = s.getBytes();
		otconsole.write(b);
		DatagramPacket dp = new DatagramPacket(b,b.length,ia,3001);
		soc.send(dp);
		
		

	}

}
