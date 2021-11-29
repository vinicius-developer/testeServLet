package com.example.gerenciador.app.controller.defaultMethods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AbstractController implements DefaultController {

    @Override
    public String callActionGet(HttpServletRequest request, HttpServletResponse response) {
        return "";
    }

    @Override
    public String callActionPost(HttpServletRequest request, HttpServletResponse response) {
        return "";
    }
}
