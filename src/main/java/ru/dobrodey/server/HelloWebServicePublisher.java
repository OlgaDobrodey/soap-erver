package ru.dobrodey.server;

import javax.xml.ws.Endpoint;

public class HelloWebServicePublisher {
    public static void main(String... args) {
        // запускаем веб-сервер на порту 1986
        // и по адресу, указанному в первом аргументе,
        // запускаем веб-сервис, передаваемый во втором аргументе
        Endpoint.publish("http://localhost:8081/wss/first", new HelloWebServiceImpl());


    }
}
