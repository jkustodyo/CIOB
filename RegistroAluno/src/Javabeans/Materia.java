package Javabeans;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user1lock
 */
public class Materia {
    private int idNotas;
    private int idAluno;
    private int mat;
    private int port;
    private int geo;
    private int his;
    private int lit;
    private int artes;
    private int redacao;
    private int fis;
    private int bio;
    private int qui;
    private int ed_f;
    

//    @Lob
//    @Column(name = "logomarcas")
//    private byte[] logomarcas;
    
    public int getidNotas(){
        return idNotas;
    }
    
    public void setidNotas(int idNotas){
        this.idNotas=idNotas;
    }
    public int getMat(){
        return mat;
    }
    
    public void setMat(int mat){
        this.mat=mat;
    }
    public int getPort(){
        return port;
    }
    public void setPort(int port){
        this.port=port;
    }
    public int getGeo(){
        return geo;
    }
    public void setGeo(int geo){
        this.geo=geo;
    }
    public int getHis(){
        return his;
    }
    public void setHis(int his){
        this.his=his;
    }
    public int getLit(){
        return lit;
    }
    public void setLit(int lit){
        this.lit=lit;
    }
    
    public int getArtes(){
        return artes;
    }
    public void setArtes(int artes){
        this.artes=artes;
    }
    public int getRedacao(){
        return redacao;
    }
    public void setRedacao(int redacao){
        this.redacao=redacao;
    }
    
    public int getFis(){
        return fis;
    }
    public void setFis(int fis){
        this.fis=fis;
    }
    public int getBio(){
        return bio;
    }
    public void setBio(int bio){
        this.bio=bio;
    }

    public int getQui(){
        return qui;
    }
    public void setQui(int qui){
        this.qui=qui;
    }
    public int getEdF(){
        return ed_f;
    }
    public void setEdF(int ed_f){
        this.ed_f=ed_f;
    }

    public int getidAluno() {
        return this.idAluno;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int geted_f() {
        return this.ed_f;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
