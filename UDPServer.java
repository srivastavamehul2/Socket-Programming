import java.net.*;
import java.io.*;
import java.util.*;

public class UDPServer {

	public static void main(String[] args) throws Exception{
		DatagramSocket soc = new DatagramSocket(3000);
		DataInputStream rfconsole = new DataInputStream(System.in);
		PrintStream otconsole = new PrintStream(System.out);
		
		
		while(true){
			otconsole.print("Server: ");
			String s = rfconsole.readLine();
			byte[] b = s.getBytes();
		//	otconsole.write(b);
			DatagramPacket dp = new DatagramPacket(b,b.length,InetAddress.getByName("localhost"),3001);
			soc.send(dp);
			if(s.equals("exit"))
				break;
			
			byte[] b1 = new byte[1000];
			DatagramPacket dp2 = new DatagramPacket(b1,b1.length);
			soc.receive(dp2);
			b = dp2.getData();
			String s2 = new String(b,0,dp2.getLength());
			otconsole.println("Client: " + s2);
			if(s2.equals("exit"))
				break;
		}
			
		soc.close();

	}

}
