import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("localhost", 5000);
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF("Hello World!");
		dos.flush();
		socket.close();
	
    }
}