package ClientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.Socket;
import java.util.Scanner;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args)

	{
		try {

			System.out.println("je suis un client pas encore connecté au serveur");

			Socket s;

			s = new Socket("localhost", 12356);
			// InetAddress inetAdd=InetAddress.getByName("192.168.1.116");
			// InetSocketAddress Isa=new InetSocketAddress(inetAdd,600);
			// s = new Socket();
			// s.connect(Isa);

			System.out.println("je suis connecté au serveur");
			OutputStream os;

			os = s.getOutputStream();

			InputStream is;

			is = s.getInputStream();

			int nb;
			System.out.println("donner un nombre : ");
			Scanner scanner = new Scanner(System.in);

			nb = scanner.nextInt();

			os.write(nb);

			int rep = is.read();

			System.out.println("le produit de " + nb + "*5=" + rep);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
