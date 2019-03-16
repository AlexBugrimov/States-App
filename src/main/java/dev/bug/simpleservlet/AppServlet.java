package dev.bug.simpleservlet;

import dev.bug.simpleservlet.repository.Repository;
import dev.bug.simpleservlet.repository.StatesRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/states", "/"})
public class AppServlet extends HttpServlet {

    private static final String INDEX_JSP = "/WEB-INF/view/index.jsp";
    private Repository repository;

    @Override
    public void init() {
        repository = new StatesRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("states", repository.findAll());
        req.getRequestDispatcher(INDEX_JSP).forward(req, resp);
    }
}
