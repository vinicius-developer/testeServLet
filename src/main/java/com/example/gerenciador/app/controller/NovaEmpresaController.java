package com.example.gerenciador.app.controller;

import com.example.gerenciador.app.controller.defaultMethods.AbstractController;
import com.example.gerenciador.empresa.Empresa;
import com.example.gerenciador.model.Banco;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovaEmpresaController extends AbstractController {

    @Override
    public String callActionPost(HttpServletRequest request, HttpServletResponse response) {

        String nome = request.getParameter("nome");

        Empresa empresa = new Empresa(nome, Banco.getAll().size());

        Banco.add(empresa);

        return "redirect:/gerenciador_war_exploded/";

    }


    @Override
    public String callActionGet(HttpServletRequest request, HttpServletResponse response) {

        return "forward:index.jsp";

    }
}
