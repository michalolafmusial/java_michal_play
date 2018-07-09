package org.isa.servlets;

import javafx.print.Printer;
import org.isa.dao.UserRepositoryDao;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

@WebServlet("")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    Logger logger = Logger.getLogger(Servlet.class.getName());
    @EJB
    UserRepositoryDao userRepositoryDao;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.write("OK");
        String name = null;
        request.getParameter("name");
        printWriter.write(name);

        logger.info(userRepositoryDao.sayHelloName("Michal2"));
    }
}
