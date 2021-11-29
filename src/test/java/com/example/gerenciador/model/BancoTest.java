package com.example.gerenciador.model;

import com.example.gerenciador.empresa.Empresa;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    @BeforeAll
    public static void resetBanco() {
        Banco.getAll().forEach(Banco::remove);
    }

    @BeforeEach
    public void addEmpresa() {
        Empresa empresa1 = new Empresa("empresa1", 1);

        Banco.add(empresa1);

        Empresa empresa2 = new Empresa("empresa2", 2);

        Banco.add(empresa2);
    }

    @Test
    public void getEmpresaById() {
        String name = Banco.getEmpresa(1).getNome();


        assertEquals("empresa1", name);
    }

    @Test
    public void removeEmpresaBanco() {
        Empresa empresa = Banco.getEmpresa(1);

        Banco.remove(empresa);

        List<Empresa> empresas = Banco.getAll();

        assertEquals(empresas.size(), 1);
    }

}