import java.net.*;

class Client{
	public static void main(String args[]) throws Exception{
		MulticastSocket socket = new MulticastSocket(5000);
		byte[] buffer = new byte[1024];

		InetAddress group = InetAddress.getByName("230.0.0.0");
		socket.joinGroup(group);
		//System.out.print(group);
		DatagramPacket packet = new DatagramPacket(buffer,buffer.length);

		socket.receive(packet);
		String msg = new String(packet.getData(),packet.getOffset(),packet.getLength());
		System.out.println(msg);
		System.out.println(packet.getOffset());
		System.out.println(packet.getLength());

		socket.leaveGroup(group);
		socket.close();
	}
}