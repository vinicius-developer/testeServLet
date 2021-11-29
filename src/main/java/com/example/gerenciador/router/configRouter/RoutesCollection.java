package com.example.gerenciador.router.configRouter;

import com.example.gerenciador.app.controller.defaultMethods.AbstractController;

import java.util.HashMap;

public class RoutesCollection {

    private final HashMap<String, AbstractController> routeCollection = new HashMap<>();

    public AbstractController getInRouteCollection(String key) {
        return routeCollection.get(key);
    }

    public void setInRouteCollection(String key, AbstractController controller) {
        this.routeCollection.put(key, controller);
    }

}
