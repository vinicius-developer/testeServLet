package com.example.gerenciador.model;

import com.example.gerenciador.empresa.Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Banco {

    public static List<Empresa> empresas = new ArrayList<>();

    public static void add(Empresa empresa) {
        Banco.empresas.add(empresa);
    }

    public static  void remove(Empresa empresa) {
        Banco.empresas.remove(empresa);
    }

    public static Empresa getEmpresa(Integer id) {
        for(Empresa empresa : Banco.empresas) {
            if(Objects.equals(empresa.getId(), id)) {
                return empresa;
            }
        }

        throw new RuntimeException("Não foi possível encontrar empresas informada");
    }

    public static List<Empresa> getAll() {
        return Banco.empresas;
    }

}
