package soap;

import javax.jws.WebService;

@WebService(endpointInterface = "soap.AcademyService")
public class AcademyServiceImpl implements AcademyService {

    @Override
    public String toUpperCase(String value) {

        if (value != null) {
            return value.toUpperCase();
        }

        return "";
    }
}

// nowy projekt maven do ktorego wsadzamy