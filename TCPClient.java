import java.net.*;
import java.io.*;
import java.util.*;
public class TCPClient {
	public static void main(String[] args) throws Exception{
		Socket soc = new Socket("localhost",5000);
		DataInputStream rfconsole = new DataInputStream(System.in);
		DataInputStream rfserver = new DataInputStream(soc.getInputStream());
		PrintStream otserver = new PrintStream(soc.getOutputStream());
		PrintStream otconsole = new PrintStream(System.out);
		while(true){
			otconsole.print("Client: ");
			String s = rfconsole.readLine();
			otserver.println(s);
			if(s.equals("exit")){
				break;
			}
			
			String s1 = rfserver.readLine();
			otconsole.println("Server: " + s1);
			if(s1.equals("exit")){
				break;
			}
		}
		
		
		soc.close();
	}

}
