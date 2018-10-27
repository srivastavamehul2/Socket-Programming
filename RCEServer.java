import java.net.*;
import java.io.*;
import java.util.*;
public class RCEServer {

	public static void main(String[] args) throws Exception{
		ServerSocket svr = new ServerSocket(5500);
		Socket sok = svr.accept();
		DataInputStream rfconsole = new DataInputStream(System.in);
		DataInputStream rfclient = new DataInputStream(sok.getInputStream());
		PrintStream otconsole = new PrintStream(System.out);
		PrintStream otclient = new PrintStream(sok.getOutputStream());
		
		String s = rfclient.readLine();
		otconsole.println(s);
		Runtime r = Runtime.getRuntime();
		Process p = r.exec(s);
		
		sok.close();
	}

}
