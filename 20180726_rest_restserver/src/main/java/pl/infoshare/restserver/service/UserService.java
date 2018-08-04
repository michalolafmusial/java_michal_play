package pl.infoshare.restserver.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.infoshare.restserver.model.Credentials;
import pl.infoshare.restserver.model.User;
import pl.infoshare.restserver.model.UserStore;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.Optional;

@Path("/")
public class UserService {

    private Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Context
    private UriInfo uriInfo;

  //  @Inject
  //  private UserStore userStore;

    public UserService() {
    }
 @Path("hello/{name}")
 @GET
 @Produces(MediaType.TEXT_PLAIN)
    public Response sayHello(@PathParam("name") String name, @HeaderParam("user-agent") String userAgent,
                             @HeaderParam("Accept-Encoding") String encoding) {
        LOG.info("Saying hello to {}!", name);

     System.out.println(uriInfo.getQueryParameters().values());
     System.out.println(userAgent);
     System.out.println(encoding);
         uriInfo.getRequestUriBuilder();


 //    UserStore userStore = new UserStore();
     System.out.println(userStore.getBase());


        return Response.ok("Saying hello to " + name + "!").build();
    }

    // metodda zwraca baze userow w formacie JSONa

    @Inject
    UserStore userStore;



    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public Response Users() {


if (userStore.getBase().size() == 100000) {

    return Response.noContent().build();
}
else return Response.ok(userStore.getBase()).build();




    }

    // metoda przyjmuje parametr ID i zwrarca usera o danym id jest znaldzie i status code 200
    // jesli nie znajdzie usera zwraca 204

    @GET
    @Path("/usersbyid/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response GetUserByIdUsers(@PathParam("id") Integer id) {


            Optional<User> byId = userStore.findById(id);
            if (byId.isPresent()){
               return Response.ok(byId.get()).build();
            }
            else
                return Response.noContent().build();

    }

    @POST
    @Path("/userpost")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response AddUserPost(User user) {



user.setId(userStore.getNewId());
userStore.add(user);

return Response.ok(user).build();

    }

    // metoda wyszukuje usera o id przyjmowanym jako get i usuwa/dodaje nowego usera postem

    @PUT
    @Path("/userput/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response modifyUserPut(@PathParam("id") Integer id, User user) {


        Optional<User> byId = userStore.findById(id);
        if (byId.isPresent()){
            userStore.removeUser(id);
            user.setId(userStore.getNewId());
            userStore.add(user);
            return Response.ok(user).build();
        }
        else
            return Response.noContent().build();

    }

    // usuwanie usera biora parametr id

@DELETE
    @Path("/userdelete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteUserDelete(@PathParam("id") Integer id) {


        Optional<User> byId = userStore.findById(id);
        if (byId.isPresent()){
            userStore.removeUser(id);
            return Response.ok().build();

        }
        else
            return Response.noContent().build();

    }


    // metoda produkujeHTMLa i wystiwetla formularz htmlsowy
    // formularz odsyla do metody authenticatePost ktora potrafi obsluzyc parametry ptrzymane z tego formularza

    @GET
    @Path("/login")
   @Produces(MediaType.TEXT_HTML)
    public Response loginFormGet() {
// @FormParam("username") String username, @FormParam("password") String password

        String html = " <form action=\"authenticatePost\" method=\"POST\">\n" +
                "  Login:<br>\n" +
                "  <input type=\"text\" name=\"user\"><br>\n" +
                "  Password:<br>\n" +
                "  <input type=\"text\" name=\"password\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> ";

      return Response.ok(html).build();

    }


    // z wyzszego formularze wysylamy user i password i odwolujemy sie do metody authenticatePost
    // metoda authenticatePost przyjmujeparametry z powyzszego formularza i sprawdza czy taki user / haslo istnieja

    @POST
    @Path("/authenticatePost")

    public Response authenticatePost(@FormParam("user") String user, @FormParam("password") String password) {



        if (userStore.authenticate(user,password)){

            System.out.println("ok");
            return Response.ok().build();

        }
        else
            System.out.println("not ok");
            return Response.noContent().build();



    }


}
