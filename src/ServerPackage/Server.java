package ServerPackage;

import java.io.InputStream;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server

{
	public static void main(String[] args)

	{
		try

		{
			System.out.println("je suis un serveur");

			ServerSocket ss = new ServerSocket(12356);

			System.out.println("j attends un client");

			Socket s = ss.accept();

			System.out.println("un client est connecté");

			OutputStream os = s.getOutputStream();

			InputStream is = s.getInputStream();

			int nb = is.read();

			int rep = nb * 5;

			os.write(rep);

			s.close();

			ss.close();

		} catch (Exception e)

		{
			e.printStackTrace();

		}

	}

}
