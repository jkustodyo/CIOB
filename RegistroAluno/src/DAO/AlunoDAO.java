/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import JDBC.ConnectionFactory;
import Javabeans.Aluno;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ciob-08-C3
 */
public class AlunoDAO {
    private Connection conecta;
    
    public AlunoDAO(){
        this.conecta =new ConnectionFactory().conecta();
    }
    public void cadastrarAluno(Aluno obj){
   try{
      String cmdsql = "insert into Aluno(Nome, DataNasc, RG, CPF, Turma, Curso, Turno, Ano, Sexo) values (?, convert(?,date), ?, ?, ?, ?, ?, ?, ?)";

      PreparedStatement stmt = conecta.prepareStatement(cmdsql);
      stmt.setString(1, obj.getNome());
      stmt.setString(2, obj.getDataNasc());
      stmt.setString(3, obj.getRG());
      stmt.setString(4, obj.getCPF());
      stmt.setString(5, obj.getTurma());
      stmt.setString(6, obj.getCurso());
      stmt.setString(7, obj.getTurno());
      stmt.setString(8, obj.getAno());
      stmt.setInt(9, obj.getSexo());
      
      stmt.execute();
      
      stmt.close();
      
         } catch (SQLException erro) {
             throw new RuntimeException(erro);
         }
    }
    
//
//public List<Materia>ListaRMateria(){
// try{
// List<Materia>lista=new ArrayList<Materia>();

//String cmdsql="select convert(a.DataNasc,char) DataNascX, a.* from Aluno a order by idAluno desc";
//PreparedStatement stmt = conecta.prepareStatement(cmdsql);

//ResultSet rs = stmt.executeQuery();

//while(rs.next()){
//    Materia v=new Materia();
//   v.setMat(rs.getInt("mat"));
//   v.setPort(rs.getInt("port"));
//   v.setGeo(rs.getInt"geo"));
//   v.setRG(rs.getString("rg"));
//   v.setCPF(rs.getString("cpf"));
//   v.setTurma(rs.getString("turma"));
//   v.setCurso(rs.getString("curso"));
//   v.setTurno(rs.getString("turno"));
//   v.setAno(rs.getString("ano"));
//   v.setFoto(rs.getBytes("foto"));
   
//   lista.add(v);
//}
//return lista;
// }catch(SQLException erro){
//      throw new RuntimeException(erro);
// }
//  }
 
 //
 public void alterarAluno(Aluno obj, Integer id){
     try{
         String cmdsql="update Aluno set nome=?, datanasc=?, rg=?, cpf=?, turma=?, curso=?, turno=?, ano=?, Sexo=? where idAluno=" + id.toString();

         PreparedStatement stmt = conecta.prepareStatement(cmdsql);
         stmt.setString(1, obj.getNome());
      stmt.setString(2, obj.getDataNasc());
      stmt.setString(3, obj.getRG());
      stmt.setString(4, obj.getCPF());
      stmt.setString(5, obj.getTurma());
      stmt.setString(6, obj.getCurso());
      stmt.setString(7, obj.getTurno());
      stmt.setString(8, obj.getAno());
      stmt.setInt(9, obj.getSexo());
      
      stmt.execute();
      stmt.close();
     } catch (SQLException erro){
         throw new RuntimeException(erro);
     }
 }
 public void excluirAluno(Integer id){
     try{
         String cmdsql="delete from Aluno where idAluno=" + id.toString();
         PreparedStatement stmt = conecta.prepareStatement(cmdsql);
      stmt.execute();
      stmt.close();
     } catch (SQLException erro){
         throw new RuntimeException(erro);
     }
          
 }
     
 public void cadastraFoto(Integer id, File file) throws FileNotFoundException{
    FileInputStream fis=null;
     try{
        fis=new FileInputStream(file);
         String cmdsql="update Aluno set foto = ? where idAluno=" + id.toString();
         PreparedStatement stmt = conecta.prepareStatement(cmdsql);
         stmt.setBinaryStream(1, (InputStream)fis,(int) (file.length()));
         
      stmt.execute();
      stmt.close();
     } catch (SQLException erro){
         throw new RuntimeException(erro);
     }
          
 }
 
 public void excluirFoto(Integer id) {
     try{
         String cmdsql="update Aluno set foto = null where idAluno=" + id.toString();
         PreparedStatement stmt = conecta.prepareStatement(cmdsql);
         
      stmt.execute();
      stmt.close();
     } catch (SQLException erro){
         throw new RuntimeException(erro);
     }
          
 }

    public List<Aluno> ListaRAluno() {
       //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
     try{
     List<Aluno>lista=new ArrayList<Aluno>();

    String cmdsql="select convert(a.DataNasc,char) DataNascX, a.* from Aluno a order by idAluno desc";
    PreparedStatement stmt = conecta.prepareStatement(cmdsql);

    ResultSet rs = stmt.executeQuery();

  while(rs.next()){
    Aluno v=new Aluno();
   v.setNome(rs.getString("nome"));
   v.setDataNasc(rs.getString("datanasc"));
   
   v.setRG(rs.getString("rg"));
   v.setCPF(rs.getString("cpf"));
   v.setTurma(rs.getString("turma"));
   v.setCurso(rs.getString("curso"));
   v.setTurno(rs.getString("turno"));
   v.setAno(rs.getString("ano"));
   v.setSexo(rs.getInt("sexo"));
   v.setFoto(rs.getBytes("foto"));
   v.setIdAluno(rs.getInt("idAluno"));
   
   lista.add(v);
    }
    return lista;
    }catch(SQLException erro){
          throw new RuntimeException(erro);
    }
      }
    }
 



/*
//            public void adiciona(Cadastro cadastro) throws SQLException{
        FileInputStream fis=null;
        try {
            imagem = cadastro.getImagem();
            fis=new FileInputStream(imagem);
            PreparedStatement ps = conn.getConexao().prepareStatement(sql);// impede sql inject
            ps.setString(1, cadastro.getNome());
            ps.setString(2,cadastro.getEmail());
            ps.setInt(3, cadastro.getTelefone());
            ps.setBinaryStream(4, (InputStream)fis,(int) (imagem.length()));
            ps.execute();
           
        } catch (Exception e) {
            System.out.println(e);
          
        }
*/            
