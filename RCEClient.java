import java.net.*;
import java.io.*;
import java.util.*;
public class RCEClient {

	public static void main(String[] args) throws Exception{
		Socket soc = new Socket("localhost",5500);
		DataInputStream rfconsole = new DataInputStream(System.in);
		DataInputStream rfserver = new DataInputStream(soc.getInputStream());
		PrintStream otconsole = new PrintStream(System.out);
		PrintStream otserver = new PrintStream(soc.getOutputStream());
		
		otconsole.println("Enter the process.");
		String s = rfconsole.readLine();
		otserver.println(s);
		
		soc.close();
	}

}
