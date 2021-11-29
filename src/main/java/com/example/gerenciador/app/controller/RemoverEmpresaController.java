package com.example.gerenciador.app.controller;

import com.example.gerenciador.app.controller.defaultMethods.AbstractController;
import com.example.gerenciador.empresa.Empresa;
import com.example.gerenciador.model.Banco;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoverEmpresaController extends AbstractController {

    @Override
    public String callActionGet(HttpServletRequest request, HttpServletResponse response) {

        Integer id = Integer.valueOf(
                request.getParameter("empresa")
        );

        Empresa empresa = Banco.getEmpresa(id);

        Banco.remove(empresa);

        return "redirect:/gerenciador_war_exploded/";

    }
}
