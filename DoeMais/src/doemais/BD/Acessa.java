package doemais.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Acessa {

    public ResultSet RS;
    public java.sql.Statement stmt;
    Connection con;

    //Método que irá conectar ao banco
    public void entBanco() {

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver Incorreto");
        }

        try {

            con = DriverManager.getConnection("jdbc:jtds:sqlserver://127.0.0.1:1433/DoeMais", "sa", "etesp");
            
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);//NUNCA ESQUECER DE COLOCAR ISSO
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Banco não encontrado");
        }
    }
}