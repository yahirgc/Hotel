/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trivago;
import Clases.Registro;
import Conexion.conexion;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
/**
 *
 * @author OctoPC
 */

public class BorrarTitular extends CitasSwingWorker {
    private int id;

    public BorrarTitular(conexion objConexion, int id, JTable tabla, DefaultTableModel modelo) {
        super(objConexion, null, tabla, modelo);
        this.id = id;
    }

    @Override
    protected void ejecutarConsulta() throws SQLException {
        String consulta = String.format("DELETE FROM Citas WHERE ID=%d", id);
        objConexion.ejecutarSentenciaSQL(consulta);
    }

}