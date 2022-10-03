package ru.dobrodey.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
// говорим, что веб-сервис будет использоваться для вызова методов
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWebService {
    // говорим, что этот метод можно вызывать удаленно
    @WebMethod
    public String getHelloString(String name);

    @WebMethod
    public String[] getList(String name);

    @WebMethod
    public Users getUser();

    @WebMethod
    public int add(int a, int b);


//    @WebMethod
//    public List<User> getUserList();
}
