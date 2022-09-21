package com.vladleesi;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Hello World!");

        Server server = ServerBuilder.forPort(8080)
                .addService(new MainServiceImpl())
                .build();

        server.start();
        server.awaitTermination();
    }
}
