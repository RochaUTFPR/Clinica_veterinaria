package clinica.animal;

import clinica.dal.ModuloConexao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import clinica.animal.CadAnimal;


//Funções cadastrar, busca, excluir e alterar concluidas

public class CadAnimal extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private static CadAnimal cadAnimal;
    public static CadAnimal getCadAnimal() {
        if (cadAnimal == null) {
            cadAnimal = new CadAnimal(); 
        }
        
        return cadAnimal;
    }
    
    
    Color cor = new Color(202,242,222);
    public CadAnimal() {
        initComponents();
        conexao = ModuloConexao.conector();
        
        getContentPane().setBackground(cor);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/icone.png")).getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxNome = new javax.swing.JTextField();
        LbNome = new javax.swing.JLabel();
        LbTelefone = new javax.swing.JLabel();
        LbId = new javax.swing.JLabel();
        TxId = new javax.swing.JTextField();
        TxTelefone = new javax.swing.JFormattedTextField();
        LbCPF = new javax.swing.JLabel();
        TxCPFDono = new javax.swing.JFormattedTextField();
        LbNascimento = new javax.swing.JLabel();
        TbAnimal = new javax.swing.JScrollPane();
        TbCliente = new javax.swing.JTable();
        BtAtualizar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();
        LbEspecie = new javax.swing.JLabel();
        TxEspecie = new javax.swing.JTextField();
        LbRaca = new javax.swing.JLabel();
        LbSexo = new javax.swing.JLabel();
        TxRaca = new javax.swing.JTextField();
        JcomboSexo = new javax.swing.JComboBox<>();
        LbNomeDono = new javax.swing.JLabel();
        ImagemCachorro = new javax.swing.JLabel();
        TxIdade = new javax.swing.JTextField();
        TxNomeDono = new javax.swing.JTextField();
        LbId1 = new javax.swing.JLabel();
        TxIdanimal = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        BtBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Animais");
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        TxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNomeActionPerformed(evt);
            }
        });

        LbNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbNome.setText("Nome:");

        LbTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbTelefone.setText("Telefone:");

        LbId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbId.setText("ID do cliente:");

        TxId.setEditable(false);
        TxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdActionPerformed(evt);
            }
        });

        TxTelefone.setEditable(false);
        try {
            TxTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        LbCPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbCPF.setText("CPF do dono:");

        TxCPFDono.setEditable(false);
        try {
            TxCPFDono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxCPFDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCPFDonoActionPerformed(evt);
            }
        });

        LbNascimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbNascimento.setText("Idade:");

        TbCliente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        TbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome do Animal", "Espécie", "Raça", "Idade", "Sexo", "Dono", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbCliente.getTableHeader().setReorderingAllowed(false);
        TbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbClienteMouseClicked(evt);
            }
        });
        TbAnimal.setViewportView(TbCliente);
        if (TbCliente.getColumnModel().getColumnCount() > 0) {
            TbCliente.getColumnModel().getColumn(0).setResizable(false);
            TbCliente.getColumnModel().getColumn(1).setResizable(false);
            TbCliente.getColumnModel().getColumn(2).setResizable(false);
            TbCliente.getColumnModel().getColumn(3).setResizable(false);
            TbCliente.getColumnModel().getColumn(4).setResizable(false);
            TbCliente.getColumnModel().getColumn(5).setResizable(false);
            TbCliente.getColumnModel().getColumn(6).setResizable(false);
            TbCliente.getColumnModel().getColumn(7).setResizable(false);
        }

        BtAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/atualizar.png"))); // NOI18N
        BtAtualizar.setBorder(null);
        BtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAtualizarActionPerformed(evt);
            }
        });

        BtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/lixo.png"))); // NOI18N
        BtExcluir.setBorder(null);
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });

        BtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/salvar.png"))); // NOI18N
        BtSalvar.setBorder(null);
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });

        BtSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/seta-pequena-esquerda.png"))); // NOI18N
        BtSair.setBorder(null);
        BtSair.setFocusPainted(false);
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        LbEspecie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbEspecie.setText("Espécie:");

        TxEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxEspecieActionPerformed(evt);
            }
        });

        LbRaca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbRaca.setText("Raça:");

        LbSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbSexo.setText("Sexo:");

        TxRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxRacaActionPerformed(evt);
            }
        });

        JcomboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Fêmea" }));
        JcomboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcomboSexoActionPerformed(evt);
            }
        });

        LbNomeDono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbNomeDono.setText("Nome do dono:");

        ImagemCachorro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/Meu projeto (2)_resized.png"))); // NOI18N

        TxNomeDono.setEditable(false);
        TxNomeDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNomeDonoActionPerformed(evt);
            }
        });

        LbId1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbId1.setText("ID do animal:");

        TxIdanimal.setEditable(false);
        TxIdanimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdanimalActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        BtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/procurar.png"))); // NOI18N
        BtBuscar.setBorder(null);
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID do animal :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TbAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ImagemCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(124, 124, 124)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbNome)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LbEspecie)
                                            .addComponent(LbRaca))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LbId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(LbSexo)
                                                    .addComponent(LbNascimento))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(JcomboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(TxIdade))
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(LbCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(LbNomeDono)
                                                    .addComponent(LbTelefone, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LbId1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxIdanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(89, 89, 89)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxCPFDono, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(TxNomeDono)
                                            .addComponent(TxTelefone))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbId)
                            .addComponent(TxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbId1)
                            .addComponent(TxIdanimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbNome)
                            .addComponent(LbSexo)
                            .addComponent(JcomboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(BtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbTelefone)
                            .addComponent(TxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbCPF)
                            .addComponent(TxCPFDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbEspecie)
                    .addComponent(TxEspecie)
                    .addComponent(LbNascimento)
                    .addComponent(TxIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbNomeDono)
                    .addComponent(TxNomeDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(ImagemCachorro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbRaca))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TbAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BtSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
        );

        setSize(new java.awt.Dimension(681, 541));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNomeActionPerformed

    private void TxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxIdActionPerformed

    private void TxCPFDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCPFDonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCPFDonoActionPerformed

    private void BtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtualizarActionPerformed
        //atualiza
        alterar();
        limpar();
    }//GEN-LAST:event_BtAtualizarActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        //salva
        cadastrar();
        limpar();
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        exit();
    }//GEN-LAST:event_BtSairActionPerformed

    private void TxEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxEspecieActionPerformed

    private void TxRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxRacaActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        //exclui
        excluir();
        limpar();
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void JcomboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcomboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcomboSexoActionPerformed

    private void TbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbClienteMouseClicked
        setar_campos();
    }//GEN-LAST:event_TbClienteMouseClicked

    private void TxNomeDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNomeDonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNomeDonoActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        TxId.setText(clinica.cliente.CadCliente.getId_dodono());
        setarcamposcli();
        buscarcli();
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void TxIdanimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdanimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxIdanimalActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        buscarid();
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    
        public void setarcamposcli(){
            String sql = "select nome_cli, cpf_cli,telefone_cli  from cliente where id_cli=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,TxId.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                TxNomeDono.setText(rs.getString(1));
                TxCPFDono.setText(rs.getString(2));
                TxTelefone.setText(rs.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario não cadastrado");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
        private void buscarid(){
        String sql = "select id_animal 'id animal',especie 'espécie',raca 'raça',nome_animal 'Nome do animal',idade, sexo from cliente natural join animal where id_cli like ?;";
        try {
            pst = conexao.prepareStatement(sql);
            //passando o conteudo da caixa de pesquisa para o ?
            //atenção ao % - continuação da String sql
            pst.setString(1,TxId.getText() + "%");
            rs=pst.executeQuery();
            //a linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
            TbCliente.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
            
        
        
    //arrumar
     private void alterar() {
        String sql = "update animal set id_cli, id_animal, especie, raca, nome_animal,idade,sexo where id_animal =?";
        try {   
            pst = conexao.prepareStatement(sql);
            pst.setString(1, TxId.getText());
            pst.setString(2, TxIdanimal.getText());
            pst.setString(3, TxEspecie.getText());
            pst.setString(4, TxRaca.getText());
            pst.setString(5, TxNome.getText());
            pst.setString(6, TxIdade.getText());
            pst.setString(8, JcomboSexo.getActionCommand());
            //validação dos campos obrigatorios
            if ( TxEspecie.getText().isEmpty() || TxRaca.getText().isEmpty() || 
                    TxNome.getText().isEmpty() || TxIdade.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
            } else {

                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Animal alterado com sucesso");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    private void cadastrar() {
        String sql = "insert into animal (id_cli, especie, raca, nome_animal,idade,sexo) values (?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,TxId.getText());
            pst.setString(2,TxEspecie.getText());
            pst.setString(3,TxRaca.getText());
            pst.setString(4,TxNome.getText());
            pst.setString(5,TxIdade.getText());
            pst.setString(6,JcomboSexo.getSelectedItem().toString());
             //validação dos campos obrigatorios
            if ( TxEspecie.getText().isEmpty() || TxRaca.getText().isEmpty() || 
                    TxNome.getText().isEmpty() || TxIdade.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
            } else {

                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    public void limpar(){
        TxId.setText("");
        TxIdanimal.setText("");
        TxNome.setText("");
        TxEspecie.setText("");
        TxRaca.setText("");
        TxIdade.setText("");
        TxTelefone.setText("");
        TxCPFDono.setText("");        
        TxNomeDono.setText("");
    }
    
    private void excluir() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este Animal", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from animal where id_animal=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, TxId.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Animal removido com sucesso");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } 
        }

    }
    
    //"select * from cliente natural join animal where id_cli like ?;"
    private void buscarcli() {
        String sql = "select id_animal 'id animal',especie 'espécie',raca 'raça',nome_animal 'Nome do animal',idade, sexo from cliente natural join animal where id_cli like ?;";
        try {
            pst = conexao.prepareStatement(sql);
            //passando o conteudo da caixa de pesquisa para o ?
            //atenção ao % - continuação da String sql
            pst.setString(1,TxId.getText() + "%");
            rs=pst.executeQuery();
            //a linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
            TbCliente.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
  
    public void setar_campos(){
        int setar = TbCliente.getSelectedRow();   
            TxIdanimal.setText(TbCliente.getModel().getValueAt(setar,0).toString());
            TxEspecie.setText(TbCliente.getModel().getValueAt(setar,1).toString());
            TxRaca.setText(TbCliente.getModel().getValueAt(setar,2).toString());
            TxNome.setText(TbCliente.getModel().getValueAt(setar,3).toString());
            TxIdade.setText(TbCliente.getModel().getValueAt(setar,4).toString());
            String sexo = TbCliente.getModel().getValueAt(setar,5).toString();
            if (sexo.equals("Macho")){
               JcomboSexo.setSelectedItem("Macho"); 
            }
            else{
                JcomboSexo.setSelectedItem("Fêmea");
            }
    }
    
    
    
    public void exit() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {
            this.dispose();
        }
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAtualizar;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JLabel ImagemCachorro;
    private javax.swing.JComboBox<String> JcomboSexo;
    private javax.swing.JLabel LbCPF;
    private javax.swing.JLabel LbEspecie;
    private javax.swing.JLabel LbId;
    private javax.swing.JLabel LbId1;
    private javax.swing.JLabel LbNascimento;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbNomeDono;
    private javax.swing.JLabel LbRaca;
    private javax.swing.JLabel LbSexo;
    private javax.swing.JLabel LbTelefone;
    private javax.swing.JScrollPane TbAnimal;
    private javax.swing.JTable TbCliente;
    public javax.swing.JFormattedTextField TxCPFDono;
    private javax.swing.JTextField TxEspecie;
    private javax.swing.JTextField TxId;
    private javax.swing.JTextField TxIdade;
    private javax.swing.JTextField TxIdanimal;
    private javax.swing.JTextField TxNome;
    public javax.swing.JTextField TxNomeDono;
    private javax.swing.JTextField TxRaca;
    private javax.swing.JFormattedTextField TxTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
