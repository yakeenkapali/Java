import java.net.*;

public class DisplayHostname{
   
   public static void main(String[] args){
	  try{
		 InetAddress my_address = InetAddress.getLocalHost();
		 System.out.println("The IP address is : " + my_address.getHostAddress());
		 System.out.println("The host name is : " + my_address.getHostName());
	  }
	  catch (UnknownHostException e){
		 System.out.println( "Couldn't find the local address.");
	  }
   }
}

/*
	Line No 7 : InetAddress my_address = InetAddress.getLocalHost();
	
	InetAddress.getlocalHost(); = Calling Static Method of InetAddress
*/