package javapackage;
import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/service1",
                new AcademyServiceImpl()
                );
    }
}