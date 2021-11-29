package com.example.gerenciador.router.configRouter;

import com.example.gerenciador.app.controller.defaultMethods.AbstractController;

public class RouterController {

    protected VerbsHttpCollection routes = new VerbsHttpCollection();

    public AbstractController getRoute(String method, String route) {
        AbstractController controller = this.routes.getInHttpCollection(method, route);

        if(controller == null) {
            throw  new RuntimeException("Erro ao encontrar rota");
        }
    }

}
