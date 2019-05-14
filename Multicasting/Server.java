import java.net.*;

class Server{
	public static void main(String args[]) throws Exception{
		DatagramSocket socket = new DatagramSocket();
		String mesg="chal hat bsdk";
		byte[] msg = mesg.getBytes();

		int port = 5000;
		InetAddress group = InetAddress.getByName("230.0.0.0");
		//System.out.print(group);
		DatagramPacket packet = new DatagramPacket(msg,msg.length,group,port);

		socket.send(packet);
		socket.close();
	}
}