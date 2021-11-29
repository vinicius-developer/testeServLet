package com.example.gerenciador.app;

import com.example.gerenciador.app.controller.defaultMethods.AbstractController;
import com.example.gerenciador.app.controller.defaultMethods.DefaultController;
import com.example.gerenciador.router.Router;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FrontControllerServlet", value = "/")
public class FrontControllerServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = this.getPath(req).replace("/gerenciador_war_exploded", "");

        String method = req.getMethod();

        Router router = new Router();

        AbstractController controller = router.getRoute(method, action);

        String actionToResponse = this.execute(method, req, resp, controller);

        this.moveToResponse(req, resp, actionToResponse);
    }

    private String execute(
            String method,
            HttpServletRequest req,
            HttpServletResponse resp,
            DefaultController controller
    ) {
        if(method.equals("POST")) {
            return controller.callActionPost(req, resp);
        }

        return controller.callActionGet(req, resp);
    }

    private void moveToResponse(HttpServletRequest request, HttpServletResponse response, String actionToResponse)
            throws ServletException, IOException {

        String[] informationForResponse = actionToResponse.split(":");

        if(informationForResponse[0].equals("forward")) {

            String route = "WEB-INF/view/" + informationForResponse[1];

            RequestDispatcher page = request.getRequestDispatcher(route);

            page.forward(request, response);

            return;

       }

        response.sendRedirect(informationForResponse[1]);

    }

    private String getPath(HttpServletRequest req) {
        return req.getRequestURI();
    }

}
