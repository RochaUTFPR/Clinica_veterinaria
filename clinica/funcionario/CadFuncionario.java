package clinica.funcionario;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import clinica.dal.ModuloConexao;

//Funções cadastrar, alterar, buscar por nome e excluir concluidas



public class CadFuncionario extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private static CadFuncionario cadFuncionario;

    public static CadFuncionario getCadFuncionario() {
        if (cadFuncionario == null) {
            cadFuncionario = new CadFuncionario();
        }

        return cadFuncionario;
    }

    Color cor = new Color(202, 242, 222);

    public CadFuncionario() {
        initComponents();
        conexao = ModuloConexao.conector();
        getContentPane().setBackground(cor);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/icone.png")).getImage());
    }

    private void consultar() {
        String sql = "select * from funcionario where cpf_func=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, Tx_Busca.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                TxCPF.setText(rs.getString(1));
                TxId.setText(rs.getString(2));
                TxNome.setText(rs.getString(3));
                TxData.setText(rs.getString(4));
                TxUsuario.setText(rs.getString(5));
                TxSenha.setText(rs.getString(6));
                JcomboPerfil.setSelectedItem(rs.getString(7));
                TxCargo.setText(rs.getString(8));
                TxSalario.setText(rs.getString(9));
                TxCrmv.setText(rs.getString(10));
                TxTelefone.setText(rs.getString(11));
                TxEndereco.setText(rs.getString(12));
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuario não cadastrado");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void cadastrar() {
        String sql = "insert into funcionario (cpf_func,nome_func,datanasc_func,usuario,senha,perfil,cargo,salario,crvm,telefone_func,endereco_func) values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, TxCPF.getText());
            pst.setString(2, TxNome.getText());
            pst.setString(3, TxData.getText());
            pst.setString(4, TxUsuario.getText());
            pst.setString(5, TxSenha.getText());
            pst.setString(6, JcomboPerfil.getSelectedItem().toString());
            pst.setString(7, TxCargo.getText());
            pst.setString(8, TxSalario.getText());

            if (TxCrmv.getText().equals("")) {
                pst.setString(9, null);
            } else {
                pst.setString(9, TxCrmv.getText());
            }
            pst.setString(10, TxTelefone.getText());
            pst.setString(11, TxEndereco.getText());

            //validação dos campos obrigatorios
            if (TxCPF.getText().equals("   .   .   -  ") || TxNome.getText().isEmpty() || TxData.getText().equals("  /  /    ")
                    || TxUsuario.getText().isEmpty() || TxSenha.getText().isEmpty() || TxCargo.getText().isEmpty() || TxSalario.getText().isEmpty()
                    || TxTelefone.getText().equals("(  )     -    ") || TxEndereco.getText().isEmpty()) {
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
    
    private void alterar() {
        String sql = "update funcionario set cpf_func=?,nome_func=?,datanasc_func=?,usuario =?,senha =?, perfil=?,cargo=?,salario=?,crvm =?,telefone_func=?,endereco_func=? where cpf_func=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, TxCPF.getText());
            pst.setString(2, TxNome.getText());
            pst.setString(3, TxData.getText());
            pst.setString(4, TxUsuario.getText());
            pst.setString(5, TxSenha.getText());
            pst.setString(6, JcomboPerfil.getSelectedItem().toString());
            pst.setString(7, TxCargo.getText());
            pst.setString(8, TxSalario.getText());

            if (TxCrmv.getText().equals("")) {
                pst.setString(9, null);
            } else {
                pst.setString(9, TxCrmv.getText());
            }
            pst.setString(10, TxTelefone.getText());
            pst.setString(11, TxEndereco.getText());
            pst.setString(12, TxCPF.getText());

            //validação dos campos obrigatorios
            if (TxCPF.getText().equals("   .   .   -  ") || TxNome.getText().isEmpty() || TxData.getText().equals("  /  /    ")
                    || TxUsuario.getText().isEmpty() || TxSenha.getText().isEmpty() || TxCargo.getText().isEmpty() || TxSalario.getText().isEmpty()
                    || TxTelefone.getText().isEmpty() || TxEndereco.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
            } else {

                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void excluir() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este funcionario?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from funcionario where cpf_func=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, Tx_Busca.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario removido com sucesso");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lb_busca = new javax.swing.JLabel();
        TxNome = new javax.swing.JTextField();
        LbNome = new javax.swing.JLabel();
        LbTelefone = new javax.swing.JLabel();
        LbId = new javax.swing.JLabel();
        TxId = new javax.swing.JTextField();
        TxTelefone = new javax.swing.JFormattedTextField();
        LbCPF = new javax.swing.JLabel();
        TxCPF = new javax.swing.JFormattedTextField();
        LbNascimento = new javax.swing.JLabel();
        TxData = new javax.swing.JFormattedTextField();
        TxEndereco = new javax.swing.JTextField();
        BtAtualizar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();
        LbEndereco = new javax.swing.JLabel();
        JbCargo = new javax.swing.JLabel();
        TxCargo = new javax.swing.JTextField();
        JbUsuario = new javax.swing.JLabel();
        TxUsuario = new javax.swing.JTextField();
        LbUsuario = new javax.swing.JLabel();
        LbCrmv = new javax.swing.JLabel();
        TxSenha = new javax.swing.JPasswordField();
        LbPerfil = new javax.swing.JLabel();
        JcomboPerfil = new javax.swing.JComboBox<>();
        TxCrmv = new javax.swing.JTextField();
        Tx_Busca = new javax.swing.JFormattedTextField();
        TxSalario = new javax.swing.JTextField();
        LbSalario = new javax.swing.JLabel();
        BtBuscar = new javax.swing.JButton();
        Imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionários");
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

        LbId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbId.setText("ID:");

        TxId.setEditable(false);
        TxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdActionPerformed(evt);
            }
        });

        try {
            TxTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
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

        LbNascimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbNascimento.setText("Data de Nascimento:");

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
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        LbEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbEndereco.setText("Endereço :");

        JbCargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JbCargo.setText("Cargo:");

        TxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCargoActionPerformed(evt);
            }
        });

        JbUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JbUsuario.setText("Usuário:");

        TxUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxUsuarioActionPerformed(evt);
            }
        });

        LbUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbUsuario.setText("Senha:");

        LbCrmv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbCrmv.setText("CRMV:");

        TxSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxSenhaActionPerformed(evt);
            }
        });

        LbPerfil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbPerfil.setText("Perfil:");

        JcomboPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Administrador" }));
        JcomboPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcomboPerfilActionPerformed(evt);
            }
        });

        try {
            Tx_Busca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Tx_Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_BuscaActionPerformed(evt);
            }
        });

        TxSalario.setText(" ");
        TxSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxSalarioActionPerformed(evt);
            }
        });

        LbSalario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbSalario.setText("Salário:");

        BtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/procurar.png"))); // NOI18N
        BtBuscar.setBorder(null);
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/CadFun2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LbPerfil)
                                    .addComponent(LbId))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JcomboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(TxId, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LbNascimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JbUsuario)
                                    .addComponent(LbUsuario))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(TxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LbCPF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LbCrmv)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxCrmv, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JbCargo)
                                        .addComponent(LbSalario))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxCargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxSalario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lb_busca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tx_Busca, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtSair)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JbUsuario)
                                    .addComponent(TxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbId)
                                    .addComponent(Lb_busca)
                                    .addComponent(Tx_Busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbUsuario)
                                    .addComponent(JcomboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbPerfil)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LbNome)
                                .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxCrmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LbCrmv)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbTelefone)
                            .addComponent(TxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbCPF)
                            .addComponent(TxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JbCargo)
                            .addComponent(TxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LbNascimento)
                                        .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(LbSalario))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(830, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNomeActionPerformed

    }//GEN-LAST:event_TxNomeActionPerformed

    private void TxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdActionPerformed

    }//GEN-LAST:event_TxIdActionPerformed

    private void TxCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCPFActionPerformed

    }//GEN-LAST:event_TxCPFActionPerformed

    private void TxDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxDataActionPerformed

    }//GEN-LAST:event_TxDataActionPerformed

    private void BtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtualizarActionPerformed
        alterar();
        limpar();
    }//GEN-LAST:event_BtAtualizarActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        cadastrar();
        limpar();
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        exit();
    }//GEN-LAST:event_BtSairActionPerformed

    private void TxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCargoActionPerformed

    }//GEN-LAST:event_TxCargoActionPerformed

    private void TxUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxUsuarioActionPerformed

    }//GEN-LAST:event_TxUsuarioActionPerformed

    private void TxSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxSenhaActionPerformed

    }//GEN-LAST:event_TxSenhaActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        excluir();
        limpar();
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void Tx_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_BuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tx_BuscaActionPerformed

    private void JcomboPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcomboPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcomboPerfilActionPerformed

    private void TxSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxSalarioActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        consultar();
    }//GEN-LAST:event_BtBuscarActionPerformed

    public void exit() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {
            this.dispose();
        }
    }

    public void limpar() {
        Tx_Busca.setText("");
        TxCPF.setText("");
        TxCargo.setText("");
        TxCrmv.setText("");
        TxData.setText("");
        TxId.setText("");
        TxNome.setText("");
        TxEndereco.setText("");
        TxSenha.setText("");
        TxTelefone.setText("");
        TxUsuario.setText("");
        TxSalario.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAtualizar;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JLabel Imagem;
    private javax.swing.JLabel JbCargo;
    private javax.swing.JLabel JbUsuario;
    private javax.swing.JComboBox<String> JcomboPerfil;
    private javax.swing.JLabel LbCPF;
    private javax.swing.JLabel LbCrmv;
    private javax.swing.JLabel LbEndereco;
    private javax.swing.JLabel LbId;
    private javax.swing.JLabel LbNascimento;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbPerfil;
    private javax.swing.JLabel LbSalario;
    private javax.swing.JLabel LbTelefone;
    private javax.swing.JLabel LbUsuario;
    private javax.swing.JLabel Lb_busca;
    private javax.swing.JFormattedTextField TxCPF;
    private javax.swing.JTextField TxCargo;
    private javax.swing.JTextField TxCrmv;
    private javax.swing.JFormattedTextField TxData;
    private javax.swing.JTextField TxEndereco;
    private javax.swing.JTextField TxId;
    private javax.swing.JTextField TxNome;
    private javax.swing.JTextField TxSalario;
    private javax.swing.JPasswordField TxSenha;
    private javax.swing.JFormattedTextField TxTelefone;
    private javax.swing.JTextField TxUsuario;
    private javax.swing.JFormattedTextField Tx_Busca;
    // End of variables declaration//GEN-END:variables
}
