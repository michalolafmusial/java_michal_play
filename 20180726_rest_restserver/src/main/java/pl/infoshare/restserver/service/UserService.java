package pl.infoshare.restserver.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.infoshare.restserver.model.UserStore;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class UserService {

    private Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Context
    private UriInfo uriInfo;

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


     UserStore userStore = new UserStore();
     System.out.println(userStore.getBase());


        return Response.ok("Saying hello to " + name + "!").build();
    }

    @Context
    private UserStore userStore;

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public Response Users() {


        UserStore userStore = new UserStore();
       // System.out.println(userStore.getBase().toString());



return Response.ok(userStore.getBase()).build();

    }

}
