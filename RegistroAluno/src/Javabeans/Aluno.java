/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javabeans;
/**
 *
 * @author Ciob-08-C3
 */

public class Aluno {
    
    private int idAluno;
    private String nome;
    private String datanasc;
    private String rg;
    private String cpf;
    private String turma;
    private String curso;
    private String turno;
    private String ano;
    private int sexo;

    private byte[] foto;

//    @Lob
//    @Column(name = "logomarcas")
//    private byte[] logomarcas;


    public int getIdAluno(){
        return idAluno;
    }
    
    public void setIdAluno(int idAluno){
        this.idAluno=idAluno;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getDataNasc(){
        return datanasc;
    }
    public void setDataNasc(String datanasc){
        this.datanasc=datanasc;
    }
    public String getRG(){
        return rg;
    }
    public void setRG(String rg){
        this.rg=rg;
    }
    public String getCPF(){
        return cpf;
    }
    public void setCPF(String cpf){
        this.cpf=cpf;
    }
    
    public String getTurma(){
        return turma;
    }
    public void setTurma(String turma){
        this.turma=turma;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }
    
    public String getTurno(){
        return turno;
    }
    public void setTurno(String turno){
        this.turno=turno;
    }
    
    public String getAno(){
        return ano;
    }
    public void setAno(String ano){
        this.ano=ano;
    }

    public int getSexo(){
        return sexo;
    }
    public void setSexo(int sexo){
        this.sexo=sexo;
    }

    public byte[] getFoto(){
        return foto;
    }
    public void setFoto(byte[] foto){
        this.foto=foto;
    }

}
