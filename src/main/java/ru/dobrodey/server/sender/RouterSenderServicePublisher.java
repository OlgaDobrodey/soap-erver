package ru.dobrodey.server.sender;

import javax.xml.ws.Endpoint;

public class RouterSenderServicePublisher {
    public static void main(String... args) {
//просто запускаем класс, формируется схема
        Endpoint.publish("http://localhost:8081/wss/sender", new RouterSenderServiceImpl());

    }
}
