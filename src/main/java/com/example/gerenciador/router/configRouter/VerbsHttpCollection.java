package com.example.gerenciador.router.configRouter;

import com.example.gerenciador.app.controller.defaultMethods.AbstractController;

import java.util.HashMap;

public class VerbsHttpCollection {

    private final HashMap<String, RoutesCollection> httpCollection = new HashMap<String, RoutesCollection>() {
        {
            put("GET", new RoutesCollection());
            put("POST", new RoutesCollection());
            put("PUT", new RoutesCollection());
            put("DELETE", new RoutesCollection());
            put("PATCH", new RoutesCollection());
        }
    };

    public AbstractController getInHttpCollection(String method, String route) {
        System.out.println(method + " " + route);
        return this.httpCollection.get(method)
                .getInRouteCollection(route);

    }

    public void setRoute(String method, String route, AbstractController controller) {
        this.httpCollection.get(method)
                .setInRouteCollection(route, controller);

    }

}
