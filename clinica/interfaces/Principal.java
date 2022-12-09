
package clinica.interfaces;

import clinica.animal.CadAnimal;
import clinica.animal.CadAnimal;
import clinica.cliente.CadCliente;
import clinica.consultas.Triagem;
import clinica.consultas.ConsultaAgenda;
import clinica.consultas.ConsultaCliente;
import clinica.dal.ModuloConexao;
import clinica.estoque.Estoque;
import clinica.funcionario.CadFuncionario;
import clinica.produtos.CadProdutos;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Principal extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    Color cor = new Color(202,242,222);
    
    private static Principal principal;
   
    public Principal() {
        initComponents();
        conexao = ModuloConexao.conector();
        getContentPane().setBackground(cor);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/icone.png")).getImage());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TbAgendamentos = new javax.swing.JTable();
        LbAgendamentos = new javax.swing.JLabel();
        lbldata = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        LbbemVindo = new javax.swing.JLabel();
        Imagem = new javax.swing.JLabel();
        Imagem1 = new javax.swing.JLabel();
        Imagem2 = new javax.swing.JLabel();
        ImagemData = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MnAnimal = new javax.swing.JMenu();
        MeCadCliente = new javax.swing.JMenuItem();
        MnFuncionario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MeProdutos = new javax.swing.JMenu();
        MnEstoque = new javax.swing.JMenuItem();
        MeServico = new javax.swing.JMenu();
        MnAgenda = new javax.swing.JMenuItem();
        MnConsultaAgenda = new javax.swing.JMenuItem();
        MnConsultaCliente = new javax.swing.JMenuItem();
        MeSair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clínica");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TbAgendamentos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        TbAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Funcionario", "Cliente", "Animal", "Hora", "Data", "Serviço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbAgendamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TbAgendamentos);
        if (TbAgendamentos.getColumnModel().getColumnCount() > 0) {
            TbAgendamentos.getColumnModel().getColumn(0).setResizable(false);
            TbAgendamentos.getColumnModel().getColumn(1).setResizable(false);
            TbAgendamentos.getColumnModel().getColumn(2).setResizable(false);
            TbAgendamentos.getColumnModel().getColumn(3).setResizable(false);
            TbAgendamentos.getColumnModel().getColumn(4).setResizable(false);
            TbAgendamentos.getColumnModel().getColumn(5).setResizable(false);
        }

        LbAgendamentos.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        LbAgendamentos.setText("Próximos Agendamentos:");

        lbldata.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        lbldata.setForeground(new java.awt.Color(102, 102, 102));
        lbldata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldata.setText("Data");

        lblusuario.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusuario.setText("Nome do usuario");
        lblusuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LbbemVindo.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        LbbemVindo.setText("Bem vindo(a):");

        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/Principal4.png"))); // NOI18N

        Imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/Principal3.png"))); // NOI18N

        Imagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/Principal2.png"))); // NOI18N

        ImagemData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/calendario.png"))); // NOI18N
        ImagemData.setToolTipText("");

        MnAnimal.setText("Cadastro");

        MeCadCliente.setText("Clientes");
        MeCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeCadClienteActionPerformed(evt);
            }
        });
        MnAnimal.add(MeCadCliente);

        MnFuncionario.setText("Funcionários");
        MnFuncionario.setEnabled(false);
        MnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFuncionarioActionPerformed(evt);
            }
        });
        MnAnimal.add(MnFuncionario);

        jMenuItem1.setText("Produtos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MnAnimal.add(jMenuItem1);

        Menu.add(MnAnimal);

        MeProdutos.setText("Produtos");

        MnEstoque.setText("Estoque");
        MnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnEstoqueActionPerformed(evt);
            }
        });
        MeProdutos.add(MnEstoque);

        Menu.add(MeProdutos);

        MeServico.setText("Serviços");

        MnAgenda.setText("Agendamentos");
        MnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAgendaActionPerformed(evt);
            }
        });
        MeServico.add(MnAgenda);

        MnConsultaAgenda.setText("Consulta dos Agendamentos");
        MnConsultaAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnConsultaAgendaActionPerformed(evt);
            }
        });
        MeServico.add(MnConsultaAgenda);

        MnConsultaCliente.setText("Consulta por Cliente");
        MnConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnConsultaClienteActionPerformed(evt);
            }
        });
        MeServico.add(MnConsultaCliente);

        Menu.add(MeServico);

        MeSair.setText("Sair");
        MeSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeSairActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Sair ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MeSair.add(jMenuItem2);

        Menu.add(MeSair);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(ImagemData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LbAgendamentos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Imagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Imagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LbbemVindo)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbldata, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addComponent(Imagem1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Imagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ImagemData, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbAgendamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(LbbemVindo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblusuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbldata, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Imagem1)
                        .addGap(17, 17, 17))))
        );

        setSize(new java.awt.Dimension(739, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MeCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeCadClienteActionPerformed
        CadCliente.getCadCliente().setVisible(true);
    }//GEN-LAST:event_MeCadClienteActionPerformed

    private void MnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFuncionarioActionPerformed
        CadFuncionario.getCadFuncionario().setVisible(true);
    }//GEN-LAST:event_MnFuncionarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadProdutos.getCadProdutos().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MeSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeSairActionPerformed
        exit();
    }//GEN-LAST:event_MeSairActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        exit();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void MnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnEstoqueActionPerformed
        Estoque.getEstoque().setVisible(true);
    }//GEN-LAST:event_MnEstoqueActionPerformed

    private void MnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAgendaActionPerformed
        Triagem.getCadTriagem().setVisible(true);
    }//GEN-LAST:event_MnAgendaActionPerformed

    private void MnConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnConsultaClienteActionPerformed
        ConsultaCliente.getConsultaCliente().setVisible(true);
    }//GEN-LAST:event_MnConsultaClienteActionPerformed

    private void MnConsultaAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnConsultaAgendaActionPerformed
        ConsultaAgenda.getConsultaAgenda().setVisible(true);
    }//GEN-LAST:event_MnConsultaAgendaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.MEDIUM);
    lbldata.setText(formatador.format(data));
      buscarconsultas();
    }//GEN-LAST:event_formWindowActivated

    public void exit() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {
            this.dispose();
        }
    }
    
    private void buscarconsultas() {
        String sql = "select nome_func 'Funcionario', nome_cli 'Cliente', nome_animal 'Animal' , Data , Hora , codigo_cons 'Consulta' from consulta natural join funcionario natural join animal natural join cliente  where data like ?";
        try {
            pst = conexao.prepareStatement(sql);
            //passando o conteudo da caixa de pesquisa para o ?
            //atenção ao % - continuação da String sql
            pst.setString(1,lbldata.getText());
            rs=pst.executeQuery();
            //a linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
            TbAgendamentos.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagem;
    private javax.swing.JLabel Imagem1;
    private javax.swing.JLabel Imagem2;
    private javax.swing.JLabel ImagemData;
    private javax.swing.JLabel LbAgendamentos;
    public static javax.swing.JLabel LbbemVindo;
    private javax.swing.JMenuItem MeCadCliente;
    private javax.swing.JMenu MeProdutos;
    private javax.swing.JMenu MeSair;
    private javax.swing.JMenu MeServico;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem MnAgenda;
    private javax.swing.JMenu MnAnimal;
    private javax.swing.JMenuItem MnConsultaAgenda;
    private javax.swing.JMenuItem MnConsultaCliente;
    private javax.swing.JMenuItem MnEstoque;
    public static javax.swing.JMenuItem MnFuncionario;
    private javax.swing.JTable TbAgendamentos;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldata;
    public static javax.swing.JLabel lblusuario;
    // End of variables declaration//GEN-END:variables
}
