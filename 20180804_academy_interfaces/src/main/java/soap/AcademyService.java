package soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService

public interface AcademyService {

    @WebMethod
    String toUpperCase(@WebParam(name = "value")
                               String value);
}
