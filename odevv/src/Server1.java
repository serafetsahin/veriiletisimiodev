import java.io.*;
import java.net.*;
public class Server1 {

  
    public static void main(String[] args) throws IOException { 
         
        ServerSocket ss =  new ServerSocket(6000);
        Socket s = ss.accept();
        System.out.println("Baglantı kuruldu");
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader  bf = new BufferedReader(in);    
       String str = bf.readLine();
       System.out.println("client: " + str);
       
        PrintWriter pr = new PrintWriter(s.getOutputStream());
         pr.println("baglantı kuruldu");
         pr.flush();
       
       
       
}}
