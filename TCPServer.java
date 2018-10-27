import java.net.*;
import java.io.*;
import java.util.*;
public class TCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket svs = new ServerSocket(5000);
		Socket sok = svs.accept();
		DataInputStream rfconsole = new DataInputStream(System.in);
		DataInputStream rfclient = new DataInputStream(sok.getInputStream());
		PrintStream otclient = new PrintStream(sok.getOutputStream());
		PrintStream otconsole = new PrintStream(System.out);
		
		while(true){
			String s = rfclient.readLine();
			otconsole.println("Client: " + s);
			if(s.equals("exit")){
				break;
			}
			
			otconsole.print("Server: ");
			String s1 = rfconsole.readLine();
			otclient.println(s1);
			if(s1.equals("exit")){
				break;
			}
		}
		
		sok.close();
	}

}
