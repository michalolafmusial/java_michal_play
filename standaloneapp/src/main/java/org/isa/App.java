package org.isa;

import org.isa.dao.UserRepositoryDao;
import org.isa.dao.UserRepositoryDaoBean;
import org.isa.dao.UserRepositoryDaoRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Hashtable;

/**
 * Hello world!
 */
public class App
{
    public static void main( String[] args ) throws NamingException {
        Context context = getInitialContext();

        UserRepositoryDaoRemote userRepositoryDaoRemote = (UserRepositoryDaoRemote) context.lookup(
                "usersengineexamples/UserRepositoryDaoBean!org.isa.dao.UserRepositoryDaoRemote"
        );

        System.out.println(userRepositoryDaoRemote.sayHello());
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable<String, String> properties = new Hashtable<>();
//        properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
        properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
//        properties.put("jboss.naming.client.ejb.context", "true");
        properties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
        properties.put(Context.SECURITY_PRINCIPAL, "");
        properties.put(Context.SECURITY_CREDENTIALS, "");
        return new InitialContext(properties);
    }
}
