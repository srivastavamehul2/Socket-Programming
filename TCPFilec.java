import java.net.*;
import java.io.*;
import java.util.*;
public class TCPFilec {
	public static void main(String[] args) throws Exception{
		Socket soc = new Socket("localhost",6000);
		DataInputStream rfconsole = new DataInputStream(System.in);
		DataInputStream in = new DataInputStream(soc.getInputStream());
		PrintStream p = new PrintStream(System.out);
		PrintStream otserver = new PrintStream(soc.getOutputStream());
		
		
	//	System.out.println("Enter the address of file to be sent.");
	//	String s = rfconsole.readLine();
	//	otserver.println(s);
		
		byte[] b = new byte[5000];
		in.read(b);
		p.write(b);
		soc.close();
	}
}
