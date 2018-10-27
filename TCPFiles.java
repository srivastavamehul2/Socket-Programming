import java.net.*;
import java.io.*;
import java.util.*;
public class TCPFiles {
	public static void main(String[] args) throws Exception{
		ServerSocket svr = new ServerSocket(6000);
		Socket sok = svr.accept();
	//	DataInputStream rfclient = new DataInputStream(sok.getInputStream());
	//	String s = rfclient.readLine();
	//	System.out.println(s);
		File f = new File("G:\\Java Programmes\\booktestdrive.java");
		byte[] b = new byte[(int)f.length()];
		FileInputStream fis = new FileInputStream(f);
		fis.read(b);
		PrintStream p = new PrintStream(sok.getOutputStream());
		PrintStream p1 = new PrintStream(System.out);
		p1.write(b);
		p.write(b);
		sok.close();

	}

}
