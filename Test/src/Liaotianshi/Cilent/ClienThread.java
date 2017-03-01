package Liaotianshi.Cilent;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class ClienThread extends Thread {

	BufferedReader s = null;
	
	public ClienThread(BufferedReader s){
		this.s=s;	
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
  String line = null;
  try {
	while((line = s.readLine())!=null){
		  
System.out.print(line);
		
		
		
		
	  }
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally{
	
	
	try {
		if(s!=null){
			
			s.close();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
		
		
		
		
	}
	
	

}
