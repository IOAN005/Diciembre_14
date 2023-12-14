package com.corenetworks.persistencia;

import com.corenetworks.modelo.Socio;

import java.sql.SQLException;
import java.sql.Statement;

public class AcessoSocios extends Conexion {
    public boolean alta(Socio s) throws SQLException, ClassNotFoundException {
        //1.declarar variable
        Statement sentencia;
        int resultado=0;
        String sql ="insert into socios(carnet,dni) values ('"+s.getCarnet()+"','"+s.getDni()+"');";
        //2Abrir conexion
        abrirConexion();
        //3.Crear el statment
        sentencia=miConexion.createStatement();
        //4.Actualizar
        resultado=sentencia.executeUpdate(sql);
        //5.Devolver el resultado
        return resultado>0;

    }
}
