import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

class Main {
    private String code;

    public static void main(String[] args) {
        ObjectMapper om = new ObjectMapper();
        try {
            Main object = om.readValue("{\"code\": \"foo\"}", Main.class);
            System.out.println(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
