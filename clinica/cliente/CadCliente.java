package clinica.cliente;


import clinica.animal.CadAnimal;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import clinica.dal.ModuloConexao;
//a linha abaixo importa recursos da biblioteca rs2xml.jar
import net.proteanit.sql.DbUtils;


//Funções cadastrar, alterar, buscar por nome e excluir concluidas
public class CadCliente extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private static CadCliente cadCliente;

    public static CadCliente getCadCliente() {
        if (cadCliente == null) {
            cadCliente = new CadCliente();
        }

        return cadCliente;
    }

    Color cor = new Color(202, 242, 222);

    public CadCliente() {
        initComponents();
        conexao = ModuloConexao.conector();
        getContentPane().setBackground(cor);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/icone.png")).getImage());

    }
    
    private static String nomedodono;
    private static String cpfdodono;
    private static String telefonedodono;
    private static String id_dodono;

    public static String getTelefonedodono() {
        return telefonedodono;
    }

    public static void setTelefonedodono(String telefonedodono) {
        CadCliente.telefonedodono = telefonedodono;
    }

    public static String getNomedodono() {
        return nomedodono;
    }

    public static void setNomedodono(String nomedodono) {
        CadCliente.nomedodono = nomedodono;
    }

    public static String getCpfdodono() {
        return cpfdodono;
    }

    public static void setCpfdodono(String cpfdodono) {
        CadCliente.cpfdodono = cpfdodono;
    }
    
    public static String getId_dodono() {
        return id_dodono;
    }

    public static void setId_dodono(String id_dodono) {
        CadCliente.id_dodono = id_dodono;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lb_busca = new javax.swing.JLabel();
        TxNome = new javax.swing.JTextField();
        LbNome = new javax.swing.JLabel();
        LbTelefone = new javax.swing.JLabel();
        TxBusca = new javax.swing.JFormattedTextField();
        LbId = new javax.swing.JLabel();
        TxId = new javax.swing.JTextField();
        TxTelefone = new javax.swing.JFormattedTextField();
        LbCPF = new javax.swing.JLabel();
        TxCPF = new javax.swing.JFormattedTextField();
        LbEndereco = new javax.swing.JLabel();
        TxEndereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbCliente = new javax.swing.JTable();
        BtAtualizar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();
        LbBuscarNome = new javax.swing.JLabel();
        TxBuscarNome = new javax.swing.JTextField();
        BtCadAnimal = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        Imagem1 = new javax.swing.JLabel();
        Imagem2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);

        Lb_busca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lb_busca.setText("Buscar por CPF:");

        TxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNomeActionPerformed(evt);
            }
        });

        LbNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbNome.setText("Nome:");

        LbTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbTelefone.setText("Telefone:");

        try {
            TxBusca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxBuscaActionPerformed(evt);
            }
        });

        LbId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbId.setText("ID:");

        TxId.setEditable(false);
        TxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdActionPerformed(evt);
            }
        });

        try {
            TxTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        LbCPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbCPF.setText("CPF:");

        try {
            TxCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCPFActionPerformed(evt);
            }
        });

        LbEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbEndereco.setText("Endereço:");

        TbCliente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "Data de Nasc.", "Endereço"
            }
        ));
        TbCliente.setFocusable(false);
        TbCliente.getTableHeader().setResizingAllowed(false);
        TbCliente.getTableHeader().setReorderingAllowed(false);
        TbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbCliente);

        BtAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/atualizar.png"))); // NOI18N
        BtAtualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        BtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAtualizarActionPerformed(evt);
            }
        });

        BtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/lixo.png"))); // NOI18N
        BtExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });

        BtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/salvar.png"))); // NOI18N
        BtSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });

        BtSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/seta-pequena-esquerda.png"))); // NOI18N
        BtSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        BtSair.setFocusPainted(false);
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        LbBuscarNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbBuscarNome.setText("Buscar por Nome:");

        TxBuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxBuscarNomeActionPerformed(evt);
            }
        });
        TxBuscarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxBuscarNomeKeyReleased(evt);
            }
        });

        BtCadAnimal.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        BtCadAnimal.setForeground(new java.awt.Color(51, 51, 51));
        BtCadAnimal.setText("Cadastrar animal");
        BtCadAnimal.setBorder(null);
        BtCadAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadAnimalActionPerformed(evt);
            }
        });

        BtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/procurar.png"))); // NOI18N
        BtBuscar.setBorder(null);
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        Imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/ClienteAni.png"))); // NOI18N
        Imagem1.setToolTipText("");

        Imagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/ClienteAni2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(BtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(BtCadAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbTelefone)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(LbCPF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbNome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxNome, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(TxEndereco)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(LbBuscarNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Lb_busca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LbBuscarNome)
                                        .addComponent(TxBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lb_busca)
                                        .addComponent(TxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BtSair)))
                            .addComponent(BtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LbId)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LbCPF))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbTelefone))
                                .addGap(4, 4, 4)
                                .addComponent(Imagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbEndereco)
                                    .addComponent(TxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BtCadAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(Imagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(930, 441));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNomeActionPerformed

    }//GEN-LAST:event_TxNomeActionPerformed

    private void TxBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxBuscaActionPerformed

    }//GEN-LAST:event_TxBuscaActionPerformed

    private void TxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdActionPerformed

    }//GEN-LAST:event_TxIdActionPerformed

    private void TxCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCPFActionPerformed

    }//GEN-LAST:event_TxCPFActionPerformed

    private void BtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtualizarActionPerformed
        alterar();
        limpar();
    }//GEN-LAST:event_BtAtualizarActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        //vai salvar
        cadastrar();
        limpar();
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        exit();
    }//GEN-LAST:event_BtSairActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        //vai excluir
        excluir();
        limpar();
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void TxBuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxBuscarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxBuscarNomeActionPerformed
//O evento abaixo é do tipo "enquanto for digitando em tempo real"
    private void TxBuscarNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxBuscarNomeKeyReleased
       buscarpornome();
    }//GEN-LAST:event_TxBuscarNomeKeyReleased
// evento que sera usado para setar os campos da tabela ao clicar
    private void TbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbClienteMouseClicked
        setar_campos();
    }//GEN-LAST:event_TbClienteMouseClicked

    private void BtCadAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadAnimalActionPerformed
        setId_dodono(TxId.getText());
        CadAnimal.getCadAnimal().setVisible(true);
    }//GEN-LAST:event_BtCadAnimalActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
       consultar();
    }//GEN-LAST:event_BtBuscarActionPerformed
    
    
    private void alterar() {
        String sql = "update cliente set nome_cli=?,cpf_cli=?,telefone_cli=?,endereco_cli=? where cpf_cli =?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, TxNome.getText());
            pst.setString(2, TxCPF.getText());
            pst.setString(3, TxTelefone.getText());
            pst.setString(4, TxEndereco.getText());
            pst.setString(5, TxCPF.getText());

            //validação dos campos obrigatorios
            if ( TxNome.getText().isEmpty()|| TxCPF.getText().equals("   .   .   -  ")
                || TxTelefone.getText().isEmpty() || TxEndereco.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
            } else {

                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void cadastrar() {
        String sql = "insert into cliente (cpf_cli,nome_cli,telefone_cli,endereco_cli) values (?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, TxCPF.getText());
            pst.setString(2, TxNome.getText());
            pst.setString(3,TxTelefone.getText());
            pst.setString(4,TxEndereco.getText());
            
            //validação dos campos obrigatorios
            if (TxCPF.getText().equals("   .   .   -  ") || TxNome.getText().isEmpty() ||
                TxTelefone.getText().equals("  /  /    ") || TxEndereco.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
            } else {

                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "cliente cadastrado com sucesso");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void buscarpornome() {
        String sql = "select id_cli as id, nome_cli as Nome, cpf_cli as CPF, telefone_cli, endereco_cli as endereço from cliente where nome_cli like ?";
        try {
            pst = conexao.prepareStatement(sql);
            //passando o conteudo da caixa de pesquisa para o ?
            //atenção ao % - continuação da String sql
            pst.setString(1,TxBuscarNome.getText() + "%");
            rs=pst.executeQuery();
            //a linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
            TbCliente.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //metodo para setar os campos do formulario com o conteudo da tabela
    public void setar_campos(){
        int setar = TbCliente.getSelectedRow();
            TxId.setText(TbCliente.getModel().getValueAt(setar,0).toString());
            TxNome.setText(TbCliente.getModel().getValueAt(setar,1).toString());
            TxCPF.setText(TbCliente.getModel().getValueAt(setar,2).toString());
            TxTelefone.setText(TbCliente.getModel().getValueAt(setar,3).toString());
            TxEndereco.setText(TbCliente.getModel().getValueAt(setar,4).toString());
            
    }
    
     private void excluir() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este cliente?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from cliente where cpf_cli=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, TxCPF.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente removido com sucesso");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }
     
     public void limpar() {
        TxBusca.setText("");
        TxBuscarNome.setText("");
        TxCPF.setText("");
        TxId.setText("");
        TxNome.setText("");
        TxEndereco.setText("");
        TxTelefone.setText("");
    }

    private void consultar() {
        String sql = "select * from cliente where cpf_cli=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,TxBusca.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                TxId.setText(rs.getString(1));
                TxNome.setText(rs.getString(2));
                TxCPF.setText(rs.getString(3));
                TxTelefone.setText(rs.getString(4));
                TxEndereco.setText(rs.getString(5));
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuario não cadastrado");
                limpar();
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAtualizar;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtCadAnimal;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JLabel Imagem1;
    private javax.swing.JLabel Imagem2;
    private javax.swing.JLabel LbBuscarNome;
    private javax.swing.JLabel LbCPF;
    private javax.swing.JLabel LbEndereco;
    private javax.swing.JLabel LbId;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbTelefone;
    private javax.swing.JLabel Lb_busca;
    private javax.swing.JTable TbCliente;
    private javax.swing.JFormattedTextField TxBusca;
    private javax.swing.JTextField TxBuscarNome;
    private javax.swing.JFormattedTextField TxCPF;
    private javax.swing.JTextField TxEndereco;
    private javax.swing.JTextField TxId;
    private javax.swing.JTextField TxNome;
    private javax.swing.JFormattedTextField TxTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
