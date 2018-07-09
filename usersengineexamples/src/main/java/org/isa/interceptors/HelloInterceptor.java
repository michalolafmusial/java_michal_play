package org.isa.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

public class HelloInterceptor {

    Logger logger = Logger.getLogger(HelloInterceptor.class.getName());

    @AroundInvoke
    public Object interceptor(InvocationContext context) throws Exception {
        logger.info("JEstesmy w interceptorze: "+getClass().getName());

        logger.info("Method: "+ context.getMethod().getName());

        long start = System.currentTimeMillis();
        Object obj = context.proceed();
        long stop = System.currentTimeMillis();

        logger.info("Start: "+start+" Stop "+stop);
        return obj;
    }

}
