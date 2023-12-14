package com.corenetworks.presentacion;

import com.corenetworks.modelo.Socio;
import com.corenetworks.persistencia.AcessoSocios;

import java.sql.SQLException;

public class ProbarSocio {
    public static void main(String[] args) {
        AcessoSocios as = new AcessoSocios();
        Socio s = new Socio("1234567A", "123456");

            try {
                System.out.println("se ha insertado socio ?" + as.alta(s));
            } catch (SQLException e) {
                System.out.println(e.toString());
            } catch (ClassNotFoundException e) {
                System.out.println(e.toString());
            }

        }
    }