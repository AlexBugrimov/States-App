package dev.bug.simpleservlet.servlet;

import dev.bug.simpleservlet.model.State;
import dev.bug.simpleservlet.repository.Repository;
import dev.bug.simpleservlet.repository.StatesRepository;
import dev.bug.simpleservlet.service.JsonService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/api/states")
public class StatesApiServlet extends HttpServlet {

    private Repository<State> repository;

    @Override
    public void init() {
        repository = new StatesRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json;charset=UTF-8");
        final String content = new JsonService().convertToJson("states", repository.findAll());
        resp.getOutputStream().print(content);
    }
}
