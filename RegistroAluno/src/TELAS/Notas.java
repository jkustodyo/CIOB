/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TELAS;
import DAO.MateriaDAO;
import Javabeans.Materia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user1lock
 */
public class Notas extends javax.swing.JFrame {
    Integer idAluno = 0;
    Boolean notasExiste = false;
    public void Listar (Integer id){
        this.idAluno=id;
        try{
            MateriaDAO dao=new MateriaDAO();
            List<Materia>listademateria=dao.ListaRMateria(id);
            DefaultTableModel dtmMateria = (DefaultTableModel) tabelaMateria.getModel();
            dtmMateria.setNumRows(0);
            notasExiste = false;
            for(Materia v:listademateria){
                notasExiste = true;
                dtmMateria.addRow(new Object[]{
                    v.getMat(),
                    v.getPort(),
                    v.getGeo() + "",
                    v.getHis() + "",
                    v.getLit() + "",
                    v.getArtes() + "",
                    v.getRedacao() + "",
                    v.getFis() + "",
                    v.getBio() + "",
                    v.getQui(),
                    v.geted_f() + ""
                });
            }
            if(!notasExiste){
//                dtmMateria.setNumRows(1);
                dtmMateria.addRow(new Object[]{0,0,0,0,0,0,0,0,0,0,0});
            }
            //dtmMateria.setNumRows(4+4-qtd);

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro na atz das notas: " + e.getMessage() );
        }}

    /**
     * Creates new form notas
     */
    public Notas() {
        initComponents();
    }

    public void setNome(String nome){
        txtNomeAluno.setText(nome);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaMateria = new javax.swing.JTable();
        AlunoNota = new javax.swing.JScrollPane();
        txtNomeAluno = new javax.swing.JTextPane();
        SalvarNotas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Médias finais do aluno(a):");

        tabelaMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mat", "Port", "Geo", "His", "Lit", "Artes", "Redação", "Fis", "Bio", "Qui", "Ed. F."
            }
        ));
        tabelaMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMateriaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaMateria);

        AlunoNota.setViewportView(txtNomeAluno);

        SalvarNotas.setText("Salvar");
        SalvarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarNotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SalvarNotas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(AlunoNota))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(AlunoNota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SalvarNotas)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMateriaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tabelaMateriaMouseClicked

    private void SalvarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarNotasActionPerformed
        // TODO add your handling code here:
        
        
        // TODO add your handling code here:
        if (this.idAluno >0)
        try{
            Materia mat = new Materia();
            int col=0;
            mat.setMat(Integer.parseInt(tabelaMateria.getValueAt(0, col++).toString()));
            mat.setPort(Integer.parseInt(tabelaMateria.getValueAt(0, col++).toString()));
            mat.setGeo(Integer.parseInt(tabelaMateria.getValueAt(0, col++).toString()));
            mat.setHis(Integer.parseInt(tabelaMateria.getValueAt(0, col++).toString()));
            mat.setLit(Integer.parseInt(tabelaMateria.getValueAt(0, col++).toString()));
            mat.setArtes(Integer.parseInt(tabelaMateria.getValueAt(0, col++).toString()));
            mat.setRedacao( Integer.parseInt(tabelaMateria.getValueAt(0, col++).toString()));
            mat.setFis(Integer.parseInt(tabelaMateria.getValueAt(0, col++).toString()));
            mat.setBio(Integer.parseInt(tabelaMateria.getValueAt(0, col++).toString()));
            mat.setQui(Integer.parseInt(tabelaMateria.getValueAt(0, col++).toString()));
            mat.setEdF(Integer.parseInt(tabelaMateria.getValueAt(0, col++).toString()));


            MateriaDAO matDAO = new MateriaDAO();
            matDAO.salvarMateria(mat, idAluno);
            
            matDAO.getMateria(this.idAluno);
            //khjgjgjhgjgjgjgj
            
            Listar(idAluno);
            
            JOptionPane.showMessageDialog(null, "dados alterados com sucesso!");
            
                        
            
       } catch (Exception erro){
           JOptionPane.showMessageDialog(null,"Erro ao alterar " +erro);
       }
        
      
        

        
        
    }//GEN-LAST:event_SalvarNotasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AlunoNota;
    private javax.swing.JButton SalvarNotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaMateria;
    private javax.swing.JTextPane txtNomeAluno;
    // End of variables declaration//GEN-END:variables
}
