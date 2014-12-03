

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ronakshahmac
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;



public class Client {
    static Socket s;
    static PrintWriter out;
    static BufferedReader in;
    
    public void connectToBroker(int port) throws IOException{
      s = new Socket("127.0.0.1", port );
     
    }
    //input gets value from other side 
    //out sends value to other side
    public void IORes () throws IOException{
        out = new PrintWriter(s.getOutputStream(),true);
         in=new BufferedReader(new InputStreamReader(s.getInputStream()));
    }
    
    
    public void SendToBroker(String msg) throws IOException {
        
       out.println(msg);
         
        
        
    }
    public void SendToBroker(int msg) throws IOException {
        
       out.println(msg);
         
        
        
    }
    
    

    
    public static void main(String[] args) throws IOException {
       Client client= new Client();
        
        client.connectToBroker(5000);
        client.IORes();
        client.SendToBroker(25);
        
                
        
    }
          
}