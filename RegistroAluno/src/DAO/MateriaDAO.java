/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import JDBC.ConnectionFactory;
import Javabeans.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user1lock
 */
public class MateriaDAO {
    private Connection conecta;
    private String cmdsql;
    Boolean notasExiste = false;
    
    public MateriaDAO(){
        this.conecta =new ConnectionFactory().conecta();
    }
    
    public void getMateria(int id){

     try{
        String cmdsql="select * from Materia m join Aluno a on a.idAluno=m.idAluno where m.idAluno=?";
        PreparedStatement stmt = conecta.prepareStatement(cmdsql);
        stmt.setInt(1, id);

        ResultSet rs = stmt.executeQuery();

        notasExiste=false;
          if(rs.next()){
            notasExiste=true;
          }
    
        }catch(SQLException erro){
              throw new RuntimeException(erro);
        }

        
    }
    public void salvarMateria(Materia obj, int id){
        getMateria(id);;

   try{
      String cmdsql;
      if(notasExiste){
          cmdsql = 
"update Materia SET " +
"Mat	 =?," +
"Port	 =?," +
"Geo	 =?," +
"His	 =?," +
"Lit	 =?," +
"Artes	 =?," +
"Redacao =?," +
"Fis	 =?," +
"Bio	 =?," +
"Qui     =?," +
"ed_f    =? " +
"where idAluno=?";
                  }else{
                    cmdsql = "insert into Materia(" +
"Mat	 ," +
"Port	 ," +
"Geo	 ," +
"His	 ," +
"Lit	 ," +
"Artes	 ," +
"Redacao ," +
"Fis	 ," +
"Bio	 ," +
"Qui     ," +
"ed_f    , idAluno) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                  }
      

      PreparedStatement stmt = conecta.prepareStatement(cmdsql);
      int col=0;
      stmt.setInt(++col, obj.getMat());
      stmt.setInt(++col, obj.getPort());
      stmt.setInt(++col, obj.getGeo());
      stmt.setInt(++col, obj.getHis());
      stmt.setInt(++col, obj.getLit());
      stmt.setInt(++col, obj.getArtes());
      stmt.setInt(++col, obj.getRedacao());
      stmt.setInt(++col, obj.getFis());
      stmt.setInt(++col, obj.getBio());
      stmt.setInt(++col, obj.getQui());
      stmt.setInt(++col, obj.getEdF());
      stmt.setInt(++col, id);
      
      stmt.execute();
      
      stmt.close();
      
         } catch (SQLException erro) {
             throw new RuntimeException(erro);
         }
    }
    
  public void excluirMateria(Integer id) {
     try{
         String cmdsql="delete from Materia where idAluno=" + id.toString();
         PreparedStatement stmt = conecta.prepareStatement(cmdsql);
         
      stmt.execute();
      stmt.close();
     } catch (SQLException erro){
         throw new RuntimeException(erro);
     }
          
 }
   
    
    public List<Materia> ListaRMateria(int id) {
       //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
        try{
            List<Materia>lista=new ArrayList<>();

            String cmdsql="select * from Materia m join Aluno a on a.idAluno=m.idAluno where m.idAluno=?";
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            notasExiste=false;
            if(rs.next()){
                notasExiste=true;
                Materia v=new Materia();
                v.setMat(rs.getInt("mat"));
                v.setGeo(rs.getInt("port"));
                v.setHis(rs.getInt("his"));
                v.setLit(rs.getInt("lit"));
                v.setArtes(rs.getInt("artes"));
                v.setRedacao(rs.getInt("redacao"));
                v.setFis(rs.getInt("fis"));
                v.setQui(rs.getInt("qui"));
                v.setEdF(rs.getInt("ed_f"));

                lista.add(v);
            }
            return lista;
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }

    public List<Materia> ListaRMateria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
