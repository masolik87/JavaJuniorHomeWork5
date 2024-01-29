package ru.ChatServer;

import java.io.IOException;
import java.net.ServerSocket;

public class Program {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            ru.chatserver.Server server = new ru.chatserver.Server(serverSocket);
            server.runServer();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
