import java.net.*;
import java.io.*;
import java.util.*;

public class UDPClient {

	public static void main(String[] args) throws Exception{
		DatagramSocket soc = new DatagramSocket(3001);
		DataInputStream rfconsole = new DataInputStream(System.in);
		PrintStream otconsole = new PrintStream(System.out);
		
		//otconsole.print("Client: ");
		//String s = rfconsole.readLine();
		byte[] b = new byte[100];
		DatagramPacket dp = new DatagramPacket(b,b.length);
		soc.receive(dp);
		b = dp.getData();
		String s = new String(b,0,dp.getLength());
		otconsole.println(s);
		
		

	}

}
