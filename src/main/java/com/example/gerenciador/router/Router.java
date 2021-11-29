package com.example.gerenciador.router;

import com.example.gerenciador.app.controller.AtualizarEmpresaController;
import com.example.gerenciador.app.controller.ListaEmpresaController;
import com.example.gerenciador.app.controller.NovaEmpresaController;
import com.example.gerenciador.app.controller.RemoverEmpresaController;
import com.example.gerenciador.router.configRouter.RouterController;

public class Router extends RouterController {

    public Router() {

        //GET
        this.routes.setRoute(
                "GET",
                "/",
                new ListaEmpresaController()
        );

        this.routes.setRoute(
                "GET",
                "/update-empresa",
                new AtualizarEmpresaController()
        );

        this.routes.setRoute(
                "GET",
                "/remove-empresa",
                new RemoverEmpresaController()
        );

        this.routes.setRoute(
                "GET",
                "/nova-empresa",
                new NovaEmpresaController()
        );

        //POST
        this.routes.setRoute(
                "POST",
                "/nova-empresa",
                new NovaEmpresaController()
        );

        this.routes.setRoute(
                "POST",
                "/update-empresa",
                new AtualizarEmpresaController()
        );

    }


}
