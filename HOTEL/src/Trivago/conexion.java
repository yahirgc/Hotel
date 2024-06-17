/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trivago;

/**
 *
 * @author OctoPC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class conexion {
 
    String strConexionDB="jdbc:sqlite:Hotel.s3db";
    Connection conn=null;
    
    public conexion(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(strConexionDB);
            System.out.println("Conexion establecida");
        }catch(Exception e){
            System.out.println("Error de conexion a la BD " + e);
        }
    }
    
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {//excepción de las sentenias SQL.
            System.out.println("Error de insercion de los datos "+e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistro(String strSentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta=pstm.executeQuery();
            return respuesta;
        } catch (SQLException e) {
            System.out.println("Error de Query "+e);
            return null;
        }   
    }
    
    public ResultSet buscarPorHabitacionONombreYApellido(int numHabitacion) {
        String strSentenciaSQL;
            strSentenciaSQL = String.format("SELECT * FROM Habitaciones WHERE Habitacion=%d", numHabitacion);
        
        return consultarRegistro(strSentenciaSQL);
    }
    
}

