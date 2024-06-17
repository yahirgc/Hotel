/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trivago;

/**
 *
 * @author OctoPC
 */
import Clases.Registro;
import Conexion.conexion;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

public class AgregarAcomp extends CitasSwingWorker {
    private Registro registro;

    public AgregarAcomp(conexion objConexion, Registro registro, JTable tabla, DefaultTableModel modelo) {
        super(objConexion, null, tabla, modelo);
        this.registro = registro;
    }

    @Override
    protected void ejecutarConsulta() throws SQLException {
        String consulta = String.format("INSERT INTO Citas (ID, titulo, descripcion, fecha, hora) "
                + "VALUES (null, '%s', '%s', '%s', '%s')",
                registro.getTitulo(), registro.getDescripcion(), registro.getFecha(), registro.getHora());
        objConexion.ejecutarSentenciaSQL(consulta);
    }

    /*@Override
    protected void actualizarTabla() throws SQLException {
        // Actualizar tabla después de insertar
        new ObtenerCitas(objConexion, tabla, modelo).execute();
    }*/
}

