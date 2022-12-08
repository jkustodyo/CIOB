/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TELAS;

/**
 *
 * @author user1lock
 */
import DAO.AlunoDAO;
import DAO.MateriaDAO;
import Javabeans.Materia;
import Javabeans.Aluno;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
//import java.io.FileFilter;
//import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Design extends javax.swing.JFrame {

    Integer idAtual = 0;
    Notas frmNotas = new Notas();

    
    /**
     * Creates new form Design
     */
    public void Listar (){
        try{
            AlunoDAO dao=new AlunoDAO();
            List<Aluno>listadealuno=dao.ListaRAluno();
            DefaultTableModel dtmAluno = (DefaultTableModel) tabela.getModel();
            dtmAluno.setNumRows(0);
            for(Aluno v:listadealuno){
                int aaa=v.getIdAluno();
                dtmAluno.addRow(new Object[]{
                    v.getNome(),
                    v.getDataNasc(),
                    v.getRG() + "",
                    v.getCPF() + "",
                    v.getTurma() + "",
                    v.getCurso() + "",
                    v.getTurno() + "",
                    v.getAno() + "",
                    v.getIdAluno() + "",
                    v.getFoto(),
                    v.getSexo() + ""
                });
            }
            
            }catch(Exception e){
        }}
    
    
    
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        Listar();
    }
    private void tabelaMouseClicked(java.awt.event.WindowEvent evt) {
///1111111111111        
        txtNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        txtDataNasc.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        txtRG.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
        txtCPF.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        txtTurma.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
        txtCurso.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
        txtTurno.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
        txtAno.setText(tabela.getValueAt(tabela.getSelectedRow(), 8).toString());
        cmbSexo.setSelectedIndex(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 11).toString()));
    }
    
    public Design() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botoes = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtTurma = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtTurno = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        Novo = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        Excluir1 = new javax.swing.JButton();
        cmbSexo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Alunos");

        jLabel2.setText("Nome");

        jLabel3.setText("Data de nascimento");

        jLabel4.setText("RG");

        jLabel5.setText("CPF");

        jLabel6.setText("Turma");

        jLabel7.setText("Curso");

        jLabel8.setText("Turno");

        jLabel9.setText("Ano");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        Novo.setText("Novo");
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Editar.setText(" ");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Clique aqui para carregar");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "DataNasc", "RG", "CPF", "Turma", "Curso", "Turno", "Ano", "id", "foto", "sexo"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabelaPropertyChange(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        Excluir1.setText("Remover foto");
        Excluir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Excluir1MouseClicked(evt);
            }
        });
        Excluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir1ActionPerformed(evt);
            }
        });

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sexo", "Masculino", "Feminino" }));
        cmbSexo.setName("sexo"); // NOI18N
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        jButton1.setText("Exibir notas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Excluir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                        .addGap(99, 99, 99))))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Novo)
                        .addGap(18, 18, 18)
                        .addComponent(Excluir)
                        .addGap(18, 18, 18)
                        .addComponent(Salvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Novo)
                            .addComponent(Excluir)
                            .addComponent(Editar)
                            .addComponent(Salvar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Excluir1)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed

//        Novo.enableInputMethods(false);
//        Editar.enableInputMethods(true);
//        Editar.disable();
        

Editar.setEnabled(false);
Excluir.setEnabled(false);
Salvar.setEnabled(true);
        
        Listar();
        
        // TODO add your handling code here:
        txtNome.setText(null);
        txtDataNasc.setText(null);
        txtRG.setText(null);
        txtCPF.setText(null);
        txtTurma.setText(null);
        txtCurso.setText(null);
        txtTurno.setText(null);
        txtAno.setText(null);
        cmbSexo.setSelectedIndex(0);

        
    //    Fem.setText(null);
    //    Masc.setText(null);
     //   if(fem.isSelected())
     //       JOptionPane.showMessageDialog(null, "O sexo feminino foi selecionado");
     //   else
     //       JOptionPane.showMessageDialog(null, "O sexo masculino foi selecionado");
        
    }//GEN-LAST:event_NovoActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:
        
        
        try{
            Aluno obj=new Aluno();

            obj.setNome(txtNome.getText());
            obj.setDataNasc(txtDataNasc.getText());
            obj.setRG(txtRG.getText());
            obj.setCPF(txtCPF.getText());
            obj.setTurma(txtTurma.getText());
            obj.setCurso(txtCurso.getText());
            obj.setTurno(txtTurno.getText());
            obj.setAno(txtAno.getText());
            obj.setSexo(cmbSexo.getSelectedIndex());

           
            
            AlunoDAO dao=new AlunoDAO();
            dao.cadastrarAluno(obj);
            
            JOptionPane.showMessageDialog(null,"cadastro realizado com sucesso!");
            
            DefaultTableModel dtmAluno = (DefaultTableModel) tabela.getModel();

            Object[] tabela = {
                    txtNome.getText(),
                    txtDataNasc.getText(),
                    txtRG.getText(),
                    txtCPF.getText(),
                    txtTurma.getText(),
                    txtCurso.getText(),
                    txtTurno.getText(),
                    txtAno.getText(),
                    cmbSexo.getSelectedIndex()
                            };
        
            dtmAluno.addRow(tabela);

        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar"+erro);             
        }
        
    }//GEN-LAST:event_SalvarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        if (idAtual >0)
        try{
           Aluno obj = new Aluno();
            obj.setNome(txtNome.getText());
            obj.setDataNasc(txtDataNasc.getText());
            obj.setRG(txtRG.getText());
            obj.setCPF(txtCPF.getText());
            obj.setTurma(txtTurma.getText());
            obj.setCurso(txtCurso.getText());
            obj.setTurno(txtTurno.getText());
            obj.setAno(txtAno.getText());
            obj.setSexo(cmbSexo.getSelectedIndex());
            
            
            AlunoDAO dao = new AlunoDAO();
            dao.alterarAluno(obj, idAtual);
            
            JOptionPane.showMessageDialog(null, "dados alterados com sucesso!");
            
            
            Materia mat = new Materia();
            
            
       } catch (Exception erro){
           JOptionPane.showMessageDialog(null,"Erro ao alterar " +erro);
       }
        
        Listar();
        
    }//GEN-LAST:event_EditarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        // TODO add your handling code here:
        if(idAtual>0)
        try {
         //   Aluno obj = new Aluno();
            MateriaDAO mat= new MateriaDAO();
            mat.excluirMateria(idAtual);
         
            AlunoDAO dao = new AlunoDAO();
            dao.excluirAluno( idAtual);
         
           //remove(idAtual);
            Listar();
            
            JOptionPane.showMessageDialog(null, "dados excluidos com sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro ao excluir "+erro);
        }
     //   Listar();
    }//GEN-LAST:event_ExcluirActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private String qualValor(String v){
        if (v.equals("null")){
            return "";
        }else{
            return v;
        }
    }
    
    private void fmtTabela22(){
    }
 
    private void fmtTabela(){
        tabela.getColumnModel().getColumn(0).setMinWidth(280);
        tabela.getColumnModel().getColumn(1).setMinWidth(90);

        tabela.getColumnModel().getColumn(8).setMinWidth(0);
        tabela.getColumnModel().getColumn(8).setMaxWidth(0);
        tabela.getColumnModel().getColumn(9).setMinWidth(0);
        tabela.getColumnModel().getColumn(9).setMaxWidth(0);
        tabela.getColumnModel().getColumn(10).setMinWidth(0);
        tabela.getColumnModel().getColumn(10).setMaxWidth(0);
    }

    private void fmtAtzTabela(){

        fmtTabela();

        Salvar.setEnabled(false);
        Editar.setEnabled(true);
        Excluir.setEnabled(true);

        int col=0;

        txtNome.setText(tabela.getValueAt(tabela.getSelectedRow(), col++).toString());
        txtDataNasc.setText(tabela.getValueAt(tabela.getSelectedRow(), col++).toString());
        txtRG.setText(qualValor(tabela.getValueAt(tabela.getSelectedRow(), col++).toString()));
        txtCPF.setText(qualValor(tabela.getValueAt(tabela.getSelectedRow(), col++).toString()));
        txtTurma.setText(qualValor(tabela.getValueAt(tabela.getSelectedRow(), col++).toString()));
        txtCurso.setText(qualValor(tabela.getValueAt(tabela.getSelectedRow(), col++).toString()));
        txtTurno.setText(qualValor(tabela.getValueAt(tabela.getSelectedRow(), col++).toString()));
        txtAno.setText(qualValor(tabela.getValueAt(tabela.getSelectedRow(), col++).toString()));

        idAtual = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), col++).toString());

        
     //   idAtual = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());        
     //   idAtual = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 9).toString());
     //   idAtual = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 10).toString());
        
/* *****************************************/
//https://www.guj.com.br/t/gravar-e-buscar-imagem-no-banco-de-dados-resolvido/131492/4
                
		BufferedImage img = null; 
                int colImg = col++;
		
                jLabel10.setIcon(null);
                    jLabel10.setText("Clique aqui para carregar");

                if (tabela.getValueAt(tabela.getSelectedRow(), colImg) != null)
		try {
                    img = ImageIO.read(new ByteArrayInputStream( (byte[]) tabela.getValueAt(tabela.getSelectedRow(), colImg) ));
                    jLabel10.setText("");
                    jLabel10.setIcon(new ImageIcon(img.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(),java.awt.Image.SCALE_SMOOTH )));
		
		} catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
		}
                
        cmbSexo.setSelectedIndex(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), col++).toString()));
        frmNotas.setNome(txtNome.getText());
        frmNotas.Listar(idAtual);
    }

    
    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        
        fmtAtzTabela();

        
    }//GEN-LAST:event_tabelaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fmtTabela();
        Listar();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        //System.exit(0);

        /********************************************/

        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setSelectedFile(new File("*.jpg"));
        jFileChooser.showSaveDialog(this);

        File file = jFileChooser.getSelectedFile().getAbsoluteFile();

        if(idAtual>0)
        try {
            Aluno obj = new Aluno();  
            AlunoDAO dao = new AlunoDAO();
            dao.cadastraFoto(idAtual,file);
            
            Listar();
           
            tabela.setRowSelectionInterval(idAtual, idAtual);
            
            tabelaMouseClicked(evt);
            

            

            
            JOptionPane.showMessageDialog(null, "foto cadastrado com sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro ao cadastrar fotorafia\n "+erro);
        }



        
        //https://www.guj.com.br/t/alguem-sabe-como-fazer-upload-e-carregar-imagens-do-mysql/368215/4
        
        
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void Excluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Excluir1ActionPerformed

    private void Excluir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Excluir1MouseClicked
        if(idAtual>0)
        try {
            AlunoDAO dao = new AlunoDAO();
            dao.excluirFoto(idAtual);
            Listar();
            
            JOptionPane.showMessageDialog(null, "foto excluída com sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro ao excluir fotorafia\n "+erro);
        }

        
        // TODO add your handling code here:
    }//GEN-LAST:event_Excluir1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_formMouseClicked

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        new notas().setVisible(true);


//JOptionPane.showMessageDialog(null, "Y:" + String.valueOf(frmNotas.getY()) );

        if (frmNotas.getY()<30){
            frmNotas.setLocation(0, getHeight() + 10);
        }

        

        frmNotas.setVisible( true);

//        frmNotas.setVisible( ! frmNotas.isDisplayable() );

        
//        Exibir notas
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabelaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaPropertyChange

    private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyPressed
        // TODO add your handling code here:
        fmtAtzTabela();
    }//GEN-LAST:event_tabelaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    //    try {
    //        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //            if ("Nimbus".equals(info.getName())) {
    //                javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                break;
    //            }
    //  //txtNome
    //          } catch (ClassNotFoundException ex) {
    //        java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    } catch (InstantiationException ex) {
    //        java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    } catch (IllegalAccessException ex) {
    //        java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //        java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Botoes;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Excluir1;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Salvar;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtTurma;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
