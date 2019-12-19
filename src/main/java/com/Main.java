package com;

import org.eclipse.jetty.server.Server;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Start Server");
        Server server = new Server(8080);

        Frontend frontend = new Frontend();

        server.start();

    }
}
