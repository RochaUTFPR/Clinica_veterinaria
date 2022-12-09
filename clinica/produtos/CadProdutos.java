
package clinica.produtos;

import clinica.dal.ModuloConexao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


//Funções cadastrar, alterar, buscar por nome e excluir concluidas


public class CadProdutos extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private static CadProdutos cadProdutos;
    
    public static CadProdutos getCadProdutos(){
        if (cadProdutos == null) {
            cadProdutos = new CadProdutos();
        }

        return cadProdutos;
    }

    Color cor = new Color(202,242,222);
    public CadProdutos() {
        initComponents();
        conexao = ModuloConexao.conector();
        getContentPane().setBackground(cor);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/icone.png")).getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbBuscarNome = new javax.swing.JLabel();
        TxBuscaNome = new javax.swing.JTextField();
        JbNome = new javax.swing.JLabel();
        LbQuantidade = new javax.swing.JLabel();
        LbDescricao = new javax.swing.JLabel();
        LbFornecedor = new javax.swing.JLabel();
        LbDataVal = new javax.swing.JLabel();
        LbCodigo = new javax.swing.JLabel();
        TxNome = new javax.swing.JTextField();
        TxQuantidade = new javax.swing.JTextField();
        TxDescricao = new javax.swing.JTextField();
        TxForn = new javax.swing.JTextField();
        TxData = new javax.swing.JFormattedTextField();
        TxCodigo = new javax.swing.JTextField();
        TbProdutos = new javax.swing.JScrollPane();
        Tbprodutos = new javax.swing.JTable();
        BtSalvar = new javax.swing.JButton();
        BtAtualizar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();
        LbBuscarCodigo = new javax.swing.JLabel();
        TxBuscaCodigo = new javax.swing.JTextField();
        ImagemProdutos = new javax.swing.JLabel();
        BtBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);

        LbBuscarNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbBuscarNome.setText("Buscar por nome:");

        TxBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxBuscaNomeActionPerformed(evt);
            }
        });
        TxBuscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxBuscaNomeKeyReleased(evt);
            }
        });

        JbNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JbNome.setText("Nome do produto:");

        LbQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbQuantidade.setText("Quantidade:");

        LbDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbDescricao.setText("Descrição:");

        LbFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbFornecedor.setText("Fornecedor:");

        LbDataVal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbDataVal.setText("Data de validade:");

        LbCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbCodigo.setText("Código:");

        TxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNomeActionPerformed(evt);
            }
        });

        TxQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxQuantidadeActionPerformed(evt);
            }
        });

        TxDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxDescricaoActionPerformed(evt);
            }
        });

        try {
            TxData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TxCodigo.setEditable(false);
        TxCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCodigoActionPerformed(evt);
            }
        });

        Tbprodutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Código", "Quantidade", "Descrição", "Fornecedor", "Data de V."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbprodutos.getTableHeader().setReorderingAllowed(false);
        Tbprodutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbprodutosMouseClicked(evt);
            }
        });
        TbProdutos.setViewportView(Tbprodutos);
        if (Tbprodutos.getColumnModel().getColumnCount() > 0) {
            Tbprodutos.getColumnModel().getColumn(0).setResizable(false);
            Tbprodutos.getColumnModel().getColumn(1).setResizable(false);
            Tbprodutos.getColumnModel().getColumn(2).setResizable(false);
            Tbprodutos.getColumnModel().getColumn(3).setResizable(false);
            Tbprodutos.getColumnModel().getColumn(4).setResizable(false);
            Tbprodutos.getColumnModel().getColumn(5).setResizable(false);
        }

        BtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/salvar.png"))); // NOI18N
        BtSalvar.setBorder(null);
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });

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

        BtSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/seta-pequena-esquerda.png"))); // NOI18N
        BtSair.setBorder(null);
        BtSair.setFocusPainted(false);
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        LbBuscarCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbBuscarCodigo.setText("Buscar por código:");

        TxBuscaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxBuscaCodigoActionPerformed(evt);
            }
        });
        TxBuscaCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxBuscaCodigoKeyReleased(evt);
            }
        });

        ImagemProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/Produtos.png"))); // NOI18N

        BtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/procurar.png"))); // NOI18N
        BtBuscar.setBorder(null);
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(225, 225, 225)
                                .addComponent(LbQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(LbDataVal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxForn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(JbNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LbDescricao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(208, 208, 208))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(199, 199, 199)
                                        .addComponent(LbBuscarNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LbBuscarCodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxBuscaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(BtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(BtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(ImagemProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtSair)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LbBuscarNome)
                                .addComponent(TxBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LbBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxBuscaCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JbNome)
                            .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbDescricao)
                            .addComponent(TxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbDataVal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbCodigo)
                            .addComponent(TxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbFornecedor)
                            .addComponent(TxForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImagemProdutos)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1072, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxBuscaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxBuscaNomeActionPerformed

    private void TxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNomeActionPerformed

    private void TxQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxQuantidadeActionPerformed

    private void TxDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxDescricaoActionPerformed

    private void TxCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCodigoActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtualizarActionPerformed
        //atualizar
        alterar();
        limpar();
    }//GEN-LAST:event_BtAtualizarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        excluir();
        limpar();
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void TxBuscaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxBuscaNomeKeyReleased
        buscarpornome();
    }//GEN-LAST:event_TxBuscaNomeKeyReleased

    private void TbprodutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbprodutosMouseClicked
        setar_campos();
    }//GEN-LAST:event_TbprodutosMouseClicked

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        exit();
    }//GEN-LAST:event_BtSairActionPerformed

    private void TxBuscaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxBuscaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxBuscaCodigoActionPerformed

    private void TxBuscaCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxBuscaCodigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TxBuscaCodigoKeyReleased

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtBuscarActionPerformed
    
    private void alterar() {
        String sql = "update estoque set codigo=?,nome=?,descricao=?,dataval =?,quantidade =?, fornecedor=? where codigo =?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, TxCodigo.getText());
            pst.setString(2, TxNome.getText());
            pst.setString(3, TxDescricao.getText());
            pst.setString(4, TxData.getText());
            pst.setString(5, TxQuantidade.getText());
            pst.setString(6, TxForn.getText());
            pst.setString(7, TxCodigo.getText());
            

            //validação dos campos obrigatorios
            if (TxCodigo.getText().isEmpty() || TxNome.getText().isEmpty() || TxData.getText().equals("  /  /    ")
                    || TxDescricao.getText().isEmpty() || TxQuantidade.getText().isEmpty() || TxForn.getText().isEmpty() 
                    || TxCodigo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
            } else {

                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    
    
    
    private void cadastrar() {
        String sql = "insert into estoque (nome,descricao,dataval,quantidade,fornecedor) values (?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, TxNome.getText());
            pst.setString(2, TxDescricao.getText());
            pst.setString(3, TxData.getText());
            pst.setString(4, TxQuantidade.getText());
            pst.setString(5, TxForn.getText());
          
            //validação dos campos obrigatorios
            if (TxNome.getText().isEmpty() || TxData.getText().equals("  /  /    ") || TxQuantidade.getText().isEmpty() 
                    || TxForn.getText().isEmpty() || TxDescricao.getText().isEmpty())  {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
            } else {

                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
                }
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
    
    public void limpar(){
        TxBuscaNome.setText("");
        TxCodigo.setText("");
        TxData.setText("");
        TxDescricao.setText("");
        TxForn.setText("");
        TxNome.setText("");
        TxQuantidade.setText("");
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProdutos().setVisible(true);
            }
        });
    }
    
    private void buscarpornome() {
        String sql = "select codigo , nome as Nome , Descricao , dataval as Validade , quantidade , fornecedor from estoque where nome like ?";
        try {
            pst = conexao.prepareStatement(sql);
            //passando o conteudo da caixa de pesquisa para o ?
            //atenção ao % - continuação da String sql
            pst.setString(1,TxBuscaNome.getText() + "%");
            rs=pst.executeQuery();
            //a linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
            Tbprodutos.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
   public void setar_campos(){
        int setar = Tbprodutos.getSelectedRow();
            TxCodigo.setText(Tbprodutos.getModel().getValueAt(setar,0).toString());
            TxNome.setText(Tbprodutos.getModel().getValueAt(setar,1).toString());
            TxDescricao.setText(Tbprodutos.getModel().getValueAt(setar,2).toString());
            TxData.setText(Tbprodutos.getModel().getValueAt(setar,3).toString());
            TxQuantidade.setText(Tbprodutos.getModel().getValueAt(setar,4).toString());
            TxForn.setText(Tbprodutos.getModel().getValueAt(setar,5).toString());
    }
   
   private void excluir() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este produto?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from estoque where codigo=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, TxCodigo.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }
   
   
   
   
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAtualizar;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JLabel ImagemProdutos;
    private javax.swing.JLabel JbNome;
    private javax.swing.JLabel LbBuscarCodigo;
    private javax.swing.JLabel LbBuscarNome;
    private javax.swing.JLabel LbCodigo;
    private javax.swing.JLabel LbDataVal;
    private javax.swing.JLabel LbDescricao;
    private javax.swing.JLabel LbFornecedor;
    private javax.swing.JLabel LbQuantidade;
    private javax.swing.JScrollPane TbProdutos;
    private javax.swing.JTable Tbprodutos;
    private javax.swing.JTextField TxBuscaCodigo;
    private javax.swing.JTextField TxBuscaNome;
    private javax.swing.JTextField TxCodigo;
    private javax.swing.JFormattedTextField TxData;
    private javax.swing.JTextField TxDescricao;
    private javax.swing.JTextField TxForn;
    private javax.swing.JTextField TxNome;
    private javax.swing.JTextField TxQuantidade;
    // End of variables declaration//GEN-END:variables
}
