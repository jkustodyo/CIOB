/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_CRUD;
import JDBC.ConnectionFactory;
import JDBC.ConnectionFactory;
import TELAS.Design;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author Ciob-08-C3
 */
public class Projeto_CRUD {
    public static void main (String[]args){
        try{
            //JOptionPane.showMessageDialog(null, "testando conexão");
            
            Connection con = new ConnectionFactory().conecta();
            
            //JOptionPane.showMessageDialog(null, "Está conectado");
            
            String vvvv = "5555";
            
            Design intf = new Design();
            
            intf.show();
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro "+ e);
        }
    }
    
}
