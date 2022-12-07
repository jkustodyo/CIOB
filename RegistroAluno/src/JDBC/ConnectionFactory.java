/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//import com.mysql.jdbc.Driver;
//import java.sql.*;


/**
 *
 * @author Ciob-08-C3
 */

    public class ConnectionFactory{
    
    public Connection conecta(){
        try{
//            return DriverManager.getConnection("jbb://localhost/dbAluno","root","");
//            return DriverManager.getConnection("localhost/dbAluno","root","password");

//            return  DriverManager.getConnection("jdbc:mysql://localhost/dbAluno","root","password");

//https://stackoverflow.com/questions/36974534/no-suitable-driver-found-for-jdbcmysql-netbeans-jar-include-in-library
//https://ferdidolot.wordpress.com/2009/06/14/java-mysql-jdbc-tutorial-using-netbeans-part-1/

//https://www.devmedia.com.br/instalar-e-configurar-o-driver-jdbc-para-mysql/6719



///Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/nome_banco","usuario","senha");

return  DriverManager.getConnection("jdbc:mysql://localhost:3306/dbAluno","root","password");
//return DriverManager.getConnection("jdbc:postgres://127.0.0.1:5432/dbAluno","postgres","senha");

            
        }catch(SQLException erro){
            throw new RuntimeException(erro);
            
        }
            
        }
    }

    

