package javapackage;

import javax.jws.WebService;

@WebService(endpointInterface = "javapackage.AcademyService")
public class AcademyServiceImpl implements AcademyService {

    @Override
    public String toUpperCase(String value) {
        if (value != null) {
            return value.toUpperCase();
        }

        return "";
    }
}