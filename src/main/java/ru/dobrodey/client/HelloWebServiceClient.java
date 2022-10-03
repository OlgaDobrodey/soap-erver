package ru.dobrodey.client;

import ru.dobrodey.server.HelloWebService;
import ru.dobrodey.server.Users;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class HelloWebServiceClient {

    public static void main(String[] args) throws MalformedURLException {
//        // создаем ссылку на wsdl описание
//        URL url = new URL("http://localhost:8081/wss/first?wsdl");
//
//        // Параметры следующего конструктора смотрим в самом первом теге WSDL описания - definitions
//        // 1-ый аргумент смотрим в атрибуте targetNamespace
//        // 2-ой аргумент смотрим в атрибуте name
//        QName qname = new QName("http://server.dobrodey.ru/", "HelloWebServiceImplService");
//
//        // Теперь мы можем дотянуться до тега service в wsdl описании,
//        Service service = Service.create(url, qname);
//        // а далее и до вложенного в него тега port, чтобы
//        // получить ссылку на удаленный от нас объект веб-сервиса
//        HelloWebService hello = service.getPort(HelloWebService.class);
//
//        // Ура! Теперь можно вызывать удаленный метод
//        System.out.println(hello.getHelloString("Olga"));
//        Arrays.stream(hello.getList()).forEach(System.out::println);
//
//        System.out.println(hello.getUser());
//    }
    }
}
