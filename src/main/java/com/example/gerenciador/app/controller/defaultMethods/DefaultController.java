package com.example.gerenciador.app.controller.defaultMethods;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface DefaultController {

    String callActionGet(HttpServletRequest request, HttpServletResponse response);

    String callActionPost(HttpServletRequest request, HttpServletResponse response);

}
