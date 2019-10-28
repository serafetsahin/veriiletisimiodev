import java.io.*;
import java.net.*;
public class Client1 { 
    public static void main(String []  Args) throws IOException  {
            
        Socket s = new Socket("localhost", 6000);
          
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("baglantı hazır");
        pr.flush();
          
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader  bf = new BufferedReader(in);    
        String str = bf.readLine();
        System.out.println("server: " + str); 
          
  
      
}}
