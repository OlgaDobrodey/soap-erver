package ru.dobrodey.server.sender;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "ru.dobrodey.server.sender.RouterSenderService")
public class RouterSenderServiceImpl implements RouterSenderService {

    @WebMethod
    public List<Report> getReportsToday() {
        //get list all reports
        return Arrays.asList(
                new Report("NickName","Task1", Timestamp.valueOf(LocalDateTime.now())),
                new Report("NickName","Task1", Timestamp.valueOf(LocalDateTime.now())));
    }

    @WebMethod
    public List<String> getUserNamesByRole(String roleName) {
        //get list all lector in command service
        return List.of("КОСТЯ", "СЕРЕЖА");
    }

    @WebMethod
    public void pdf(byte[] pdfBytes,List<String> lectorNickName) throws IOException {
        OutputStream out = new FileOutputStream("out.pdf");
        out.write(pdfBytes);
        out.close();
        for (String lector : lectorNickName) {
            System.out.println("PDF SEND Lector this name =" + lector);
        }
    }
}
