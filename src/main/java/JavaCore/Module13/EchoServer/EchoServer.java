package JavaCore.Module13.EchoServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        // создаем серверный сокет на порту 1234
        ServerSocket server = new ServerSocket(1234);
        while (true) {
            System.out.println("Waiting...");

            // ждем клиента из сети
            Socket socket = server.accept();
            System.out.println("Client connected!");

            // создаем клиента на своей стороне
//            Client client = new Client(socket);

            // запускаем поток
//            Thread thread = new Thread(client);
//            thread.start();

            // kinda alternate form of 3 upper lines
            Thread thread = new Thread (new Client(socket));
            thread.start();
        }
    }
}
