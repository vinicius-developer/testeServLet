package com.example.gerenciador.app.controller;

import com.example.gerenciador.app.controller.defaultMethods.AbstractController;
import com.example.gerenciador.empresa.Empresa;
import com.example.gerenciador.model.Banco;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AtualizarEmpresaController extends AbstractController {

    @Override
    public String callActionGet(HttpServletRequest request, HttpServletResponse response) {

        Integer id = Integer.valueOf(
                request.getParameter("empresa")
        );

        Empresa empresa = Banco.getEmpresa(id);

        request.setAttribute("empresa", empresa);

        return "forward:update-empresa.jsp";

    }

    @Override
    public String callActionPost(HttpServletRequest request, HttpServletResponse response) {

        Integer id = Integer.valueOf(
                request.getParameter("id")
        );

        String newName = request.getParameter("nome");

        Empresa empresa = Banco.getEmpresa(id);

        empresa.setNome(newName);

        return "redirect:/gerenciador_war_exploded/";

    }
}
