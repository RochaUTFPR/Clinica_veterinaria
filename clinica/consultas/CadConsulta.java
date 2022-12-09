
package clinica.consultas;

import static clinica.consultas.Triagem.TxCrmv;
import static clinica.consultas.Triagem.TxFuncionario;
import clinica.dal.ModuloConexao;
import static com.sun.corba.se.impl.orbutil.CorbaResourceUtil.getText;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane; 
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

//Precisa alterar uma consulta???

public class CadConsulta extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private static CadConsulta cadConsulta;
    
    public static CadConsulta getCadConsulta(){
        if (cadConsulta == null) {
            cadConsulta = new CadConsulta();
        }

        return cadConsulta;
    }

    Color cor = new Color(202,242,222);
    
    public CadConsulta() {
        initComponents();
        conexao = ModuloConexao.conector();
        TxFuncionario.setText(clinica.interfaces.Login.getNomefunc());
        TxCrmv.setText(clinica.interfaces.Login.getCrmv());
        Txcodigoconsulta.setText(clinica.consultas.Triagem.getCod_consulta());
        
        Color cor = null;
        getContentPane().setBackground(cor);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/icone.png")).getImage());
    }
     String id_animal = null;
    
   
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Txcodigo = new javax.swing.JTextField();
        LbProcedimento = new javax.swing.JLabel();
        LbDiagnostico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxProcedimento = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxDiagnostico = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        LbProcMedico = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxMedicamentos = new javax.swing.JTextArea();
        TxData = new javax.swing.JFormattedTextField();
        LbData = new javax.swing.JLabel();
        LbCliente = new javax.swing.JLabel();
        TxCliente = new javax.swing.JTextField();
        LbAnimal = new javax.swing.JLabel();
        TxAnimal = new javax.swing.JTextField();
        BtSalvar3 = new javax.swing.JButton();
        BtAtualizar3 = new javax.swing.JButton();
        LbFuncionario = new javax.swing.JLabel();
        TxCrmv = new javax.swing.JTextField();
        LbCrmv = new javax.swing.JLabel();
        TxFuncionario = new javax.swing.JTextField();
        BtGerarReceita = new javax.swing.JButton();
        BtSair2 = new javax.swing.JButton();
        ImagemConsulta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txcodigoconsulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Txcodigoanimal = new javax.swing.JTextField();

        jLabel2.setText("codigo :");

        Txcodigo.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Consultas");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        LbProcedimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbProcedimento.setText("Procedimento:");

        LbDiagnostico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbDiagnostico.setText("Diagnóstico:");

        TxProcedimento.setColumns(20);
        TxProcedimento.setRows(5);
        jScrollPane1.setViewportView(TxProcedimento);

        TxDiagnostico.setColumns(20);
        TxDiagnostico.setRows(5);
        jScrollPane2.setViewportView(TxDiagnostico);

        LbProcMedico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbProcMedico.setText("Medicamentos:");

        TxMedicamentos.setColumns(20);
        TxMedicamentos.setRows(5);
        jScrollPane3.setViewportView(TxMedicamentos);

        TxData.setEditable(false);
        try {
            TxData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxDataActionPerformed(evt);
            }
        });

        LbData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbData.setText("Data:");

        LbCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbCliente.setText("Cliente:");

        TxCliente.setEditable(false);
        TxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxClienteActionPerformed(evt);
            }
        });

        LbAnimal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbAnimal.setText("Animal:");

        TxAnimal.setEditable(false);
        TxAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAnimalActionPerformed(evt);
            }
        });

        BtSalvar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/salvar.png"))); // NOI18N
        BtSalvar3.setBorder(null);
        BtSalvar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvar3ActionPerformed(evt);
            }
        });

        BtAtualizar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/atualizar.png"))); // NOI18N
        BtAtualizar3.setBorder(null);
        BtAtualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAtualizar3ActionPerformed(evt);
            }
        });

        LbFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbFuncionario.setText("Funcionário:");

        TxCrmv.setEditable(false);
        TxCrmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCrmvActionPerformed(evt);
            }
        });

        LbCrmv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbCrmv.setText("CRMV:");

        TxFuncionario.setEditable(false);
        TxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxFuncionarioActionPerformed(evt);
            }
        });

        BtGerarReceita.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        BtGerarReceita.setText("Gerar Receita Médica");
        BtGerarReceita.setBorder(null);
        BtGerarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtGerarReceitaActionPerformed(evt);
            }
        });

        BtSair2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/seta-pequena-esquerda.png"))); // NOI18N
        BtSair2.setBorder(null);
        BtSair2.setFocusPainted(false);
        BtSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSair2ActionPerformed(evt);
            }
        });

        ImagemConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/icone-vet-leopoldina.png"))); // NOI18N

        jLabel3.setText("Código da Consulta:");

        Txcodigoconsulta.setEditable(false);

        jLabel4.setText("Código do Animal:");

        Txcodigoanimal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LbDiagnostico)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(LbCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(LbAnimal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(246, 246, 246))
                                    .addComponent(LbProcMedico)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LbProcedimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtSalvar3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(BtAtualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(LbFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(LbCrmv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxCrmv, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(LbData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagemConsulta)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtGerarReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtSair2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txcodigoanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txcodigoconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtSair2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txcodigoanimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txcodigoconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ImagemConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtGerarReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LbData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxCrmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LbCrmv))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LbFuncionario)
                                .addComponent(TxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbCliente)
                            .addComponent(TxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbAnimal)
                            .addComponent(TxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbProcedimento)
                            .addComponent(LbDiagnostico))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbProcMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtSalvar3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtAtualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(925, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxDataActionPerformed

    }//GEN-LAST:event_TxDataActionPerformed

    private void TxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxClienteActionPerformed

    }//GEN-LAST:event_TxClienteActionPerformed

    private void TxAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAnimalActionPerformed

    private void BtSalvar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvar3ActionPerformed
        //salva
        cadastrar();
        limpar2();
    }//GEN-LAST:event_BtSalvar3ActionPerformed

    private void BtAtualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtualizar3ActionPerformed
        //atualiza
    }//GEN-LAST:event_BtAtualizar3ActionPerformed

    private void TxCrmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCrmvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCrmvActionPerformed

    private void TxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxFuncionarioActionPerformed

    private void BtGerarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtGerarReceitaActionPerformed
       imprimir_prescricao();
    }//GEN-LAST:event_BtGerarReceitaActionPerformed

    private void BtSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSair2ActionPerformed
        exit();
    }//GEN-LAST:event_BtSair2ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
     setar();
     setar2();
    }//GEN-LAST:event_formWindowGainedFocus
  
    public void setar(){
    String sql = "select id_animal from consulta where codigo_cons = ?";
   
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,Txcodigoconsulta.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
             Txcodigoanimal.setText(rs.getString(1));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario não cadastrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
    public void setar2(){
        String sql = "select nome_cli,nome_animal,data from consulta natural join animal natural join cliente where id_animal like ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,Txcodigoanimal.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                TxCliente.setText(rs.getString(1));
                TxAnimal.setText(rs.getString(2));
                TxData.setText(rs.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario não cadastrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
    
    
    
    public void exit() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {
            this.dispose();
        }
    }
    //arrumar
    private void cadastrar(){
        String sql = "update consulta set procedimento=?,diagnostico=?,medicacao=? where codigo_cons =?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,TxProcedimento.getText());
            pst.setString(2,TxDiagnostico.getText());
            pst.setString(3,TxMedicamentos.getText());
            pst.setString(4,Txcodigoconsulta.getText());
            //validação dos campos obrigatorios
            if (TxProcedimento.getText().isEmpty() || TxDiagnostico.getText().isEmpty() ||
                TxMedicamentos.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Consulta registrada com sucesso");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void limpar(){
        Txcodigoanimal.setText("");
        Txcodigoconsulta.setText("");
        TxCliente.setText("");
        TxAnimal.setText("");
        TxData.setText("");
        TxFuncionario.setText("");
        TxCrmv.setText("");
        TxProcedimento.setText("");
        TxDiagnostico.setText("");
        TxMedicamentos.setText("");
    }
    
    public void limpar2(){
        TxCliente.setText("");
        TxAnimal.setText("");
        TxData.setText("");
        TxFuncionario.setText("");
        TxCrmv.setText("");
        TxProcedimento.setText("");
        TxDiagnostico.setText("");
        TxMedicamentos.setText("");
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadConsulta().setVisible(true);
            }
        });
    }
    
    //método para imprimir a prescrição
    private void imprimir_prescricao(){
        int confirma = JOptionPane.showConfirmDialog(null,"Deseja imprimir esta prescrição?","Confirme",JOptionPane.YES_NO_OPTION);
    if(confirma == JOptionPane.YES_OPTION) {
        try {
            //usando a classe Jasperprint para impressão
            HashMap filtro = new HashMap();
            filtro.put("cod_consu",Integer.parseInt(Txcodigoconsulta.getText()));
            JasperPrint print = JasperFillManager.fillReport("C:/Users/peher/OneDrive/Área de Trabalho/APOO/reports/Prontuario.jasper",filtro,conexao); 
            JasperViewer.viewReport(print,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAtualizar3;
    private javax.swing.JButton BtGerarReceita;
    private javax.swing.JButton BtSair2;
    private javax.swing.JButton BtSalvar3;
    private javax.swing.JLabel ImagemConsulta;
    private javax.swing.JLabel LbAnimal;
    private javax.swing.JLabel LbCliente;
    private javax.swing.JLabel LbCrmv;
    private javax.swing.JLabel LbData;
    private javax.swing.JLabel LbDiagnostico;
    private javax.swing.JLabel LbFuncionario;
    private javax.swing.JLabel LbProcMedico;
    private javax.swing.JLabel LbProcedimento;
    private javax.swing.JTextField TxAnimal;
    private javax.swing.JTextField TxCliente;
    private javax.swing.JTextField TxCrmv;
    private javax.swing.JFormattedTextField TxData;
    private javax.swing.JTextArea TxDiagnostico;
    private javax.swing.JTextField TxFuncionario;
    private javax.swing.JTextArea TxMedicamentos;
    private javax.swing.JTextArea TxProcedimento;
    private javax.swing.JTextField Txcodigo;
    private javax.swing.JTextField Txcodigoanimal;
    private javax.swing.JTextField Txcodigoconsulta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
