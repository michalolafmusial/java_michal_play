import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


class JsonImport {



    final String JSON_FILE = "./src/main/resources/currencies_1.json";

    public void read_json ()

    {

        InputStream fis;

        {
            try {
                fis = new FileInputStream(JSON_FILE);
                JsonReader jsonReader = Json.createReader(fis);
                JsonObject jsonObject = jsonReader.readObject();
                jsonReader.close();
                fis.close();

            //    for (int i=0; i< 5; i++)
            //    {
            //        JsonObject rec = jsonObject.getJsonObject("code");
            //    }
                JSon

ArrayList<JsonObject> arrayss = new ArrayList<JsonObject>();
                Currency curr = new Currency(jsonObject.getString("code"), jsonObject.getString("name"), jsonObject.getString("value"));
                curr.printCurrencyDetails(curr);

                // curr.setCurrencyName(jsonObject.getString("code"));
                // curr.setCurrencyName(jsonObject.getString("name"));
                // curr.setCurrencyName(jsonObject.getString("value"));


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
