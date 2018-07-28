import org.apache.http.client.utils.URIBuilder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.util.List;


public class Main {


    public static void main(String[] args) {

    //   Main main = new Main();
    //   restCountries();
    //   OpenWeatherMapCityGet();
    // OpenWeatherMapCityPost();
        UsaStatesGet();

    }


    public static void restCountries () {


        String Result;

        Client client;

        client = ClientBuilder.newClient();


        WebTarget target = client.target("https://restcountries.eu/rest/v2/name/poland");

        Response response = target.request().get();

        Result = response.readEntity(String.class);

        System.out.println(Result);

        response.close();

    }

    public   static  void OpenWeatherMapCityPost () {

// API ID: 1022700454d13f534d3f384d6efc9faa


        String Result;

        Client client;

        client = ClientBuilder.newClient();


     //   WebTarget target = client.target("http://api.openweathermap.org/data/2.5/weather?q=Sidney&appid=6f2f3fdaf6a2938053ec0349f09994fa");

     //   WebTarget target1 = client.target("http://api.openweathermap.org/data/2.5/weather").queryParam("q","Sidney").queryParam("appid","6f2f3fdaf6a2938053ec0349f09994fa");
        WebTarget target1 = client.target("http://api.openweathermap.org/data/2.5/weather");




    //    Response response = target1.request().get();

        Form form = new Form();
        form.param("a","Sidney");
        form.param("appid","6f2f3fdaf6a2938053ec0349f09994fa");
        Response response = target1.request().post(Entity.form(form));

        Result = response.readEntity(String.class);

        System.out.println(Result);

        response.close();

    }

    public   static  void OpenWeatherMapCityGet () {


// 1022700454d13f534d3f384d6efc9faa



        String Result;

        Client client;

        client = ClientBuilder.newClient();

//   WebTarget target = client.target("http://api.openweathermap.org/data/2.5/weather?q=Sidney&appid=6f2f3fdaf6a2938053ec0349f09994fa");
     WebTarget target1 = client.target("http://api.openweathermap.org/data/2.5/weather").queryParam("q","Sidney").queryParam("appid","6f2f3fdaf6a2938053ec0349f09994fa");

// Uri Builder

        UriBuilder target2 = UriBuilder.fromUri("data/2.5/weather")
                .scheme("http").host("api.openweathermap.org")
                .queryParam("q","Sidney")
                .queryParam("appid","6f2f3fdaf6a2938053ec0349f09994fa");



        System.out.println(target2.build().toString());

        // End of Uri Builder


        Response response = target1.request().get();

        Result = response.readEntity(String.class);

        System.out.println(Result);

        response.close();

    }



    public   static  void UsaStatesGet () {


        FakeObject fakeObject = new FakeObject();
       String Result;

        Client client  = ClientBuilder.newClient();

  WebTarget target1 = client.target("http://services.groupkt.com/state/get/USA/all");



        Response response = target1.request().get();



       response.readEntity(FakeObject.class);

      //  System.out.println(fakeObject.getRestResponse().getResult().get(0));

        response.close();



    }


}
