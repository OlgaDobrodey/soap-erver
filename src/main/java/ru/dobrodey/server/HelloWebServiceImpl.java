package ru.dobrodey.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "ru.dobrodey.server.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {

    @WebMethod
    public String getHelloString(String name) {
        // просто возвращаем приветствие
        return "Hello, " + name + "!";
    }

    @WebMethod
    public String[] getList(String name) {
        final ArrayList<String> objects = new ArrayList<>();
        objects.add("Olga");
        objects.add("Natali");
        objects.add("Petr");
        String[] array = {"Olga","Natali","Petr"};
        return array;
    }

    @WebMethod
    public Users getUser() {
        return new Users(1,"petr");
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }


    //    @Override
//    public List<User> getUserList() {
//        return List.of(new User(1,"Petr"), new User(2,"SVETA"));
//    }
}
