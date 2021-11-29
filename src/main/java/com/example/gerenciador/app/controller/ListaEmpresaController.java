package com.example.gerenciador.app.controller;

import com.example.gerenciador.app.controller.defaultMethods.AbstractController;
import com.example.gerenciador.model.Banco;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaEmpresaController extends AbstractController {

    @Override
    public String callActionGet(HttpServletRequest request, HttpServletResponse response) {

        request.setAttribute("empresas",  Banco.getAll());

        return "forward:lista-empresas.jsp";

    }

}
