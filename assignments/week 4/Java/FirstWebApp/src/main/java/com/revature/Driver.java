package com.revature;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Driver {

    public static void main(String[] args){

        try{
            HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080),0);
            httpServer.createContext("/hello", new HelloHandler());

            httpServer.createContext("/test-1", new HttpHandler() {
                @Override
                public void handle(HttpExchange exchange) throws IOException {
                    String payload = "This request was handled by a local anonymous class!";
                    exchange.sendResponseHeaders(200, payload.length());
                    exchange.getResponseBody().write(payload.getBytes(StandardCharsets.UTF_8));
                    exchange.getResponseBody().close();
                }
            });

            httpServer.createContext("/test-2", exchange -> {
                String payload = "This request was handled by a local anonymous class!";
                exchange.sendResponseHeaders(200, payload.length());
                exchange.getResponseBody().write(payload.getBytes(StandardCharsets.UTF_8));
                exchange.getResponseBody().close();
            });

            System.out.println("Server has started on port 8080");

            httpServer.start();

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
