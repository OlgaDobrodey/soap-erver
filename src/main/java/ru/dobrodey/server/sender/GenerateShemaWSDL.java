package ru.dobrodey.server.sender;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.Endpoint;

@WebListener
public class GenerateShemaWSDL implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Endpoint.publish("http://localhost:8081/wss/sender", new RouterSenderServiceImpl());
    }
}
