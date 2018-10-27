import java.net.*;
import java.io.*;
import java.util.*;
public class ARP{

	public static void main(String[] args) throws Exception{
		DataInputStream rfconsole = new DataInputStream(System.in);
		PrintStream otconsole = new PrintStream(System.out);
		//String s = rfclient.readLine();
		//otconsole.println(s);
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("cmd.exe /C arp -a");
		
		DataInputStream rfprocess = new DataInputStream(p.getInputStream());
	//	PrintStream otclient = new PrintStream(sok.getOutputStream());
		String s2 = rfprocess.readLine();
		while(s2!=null){
			otconsole.println(s2);
			s2 = rfprocess.readLine();
		}
	}
}
