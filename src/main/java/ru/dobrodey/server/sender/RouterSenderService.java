package ru.dobrodey.server.sender;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface RouterSenderService {

    @WebMethod
    List<Report> getReportsToday();

    @WebMethod
    List<String> getUserNamesByRole(String roleName);

    @WebMethod
    void pdf(byte[] pdfBytes, List<String> lectorNickName) throws IOException;


}
