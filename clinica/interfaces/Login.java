package clinica.interfaces;

import java.sql.*;
import clinica.dal.ModuloConexao;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void logar() {
        String sql = "select * from funcionario where usuario=? and senha=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, Tx_usuario.getText());
            String captura = new String(Tx_senha.getPassword());
            pst.setString(2, captura);
            //A linha abaixo executa a consulta
            rs = pst.executeQuery();

            //se existir usuario e senha correspondente
            if (rs.next()) {
                //A linha abaixo obtem o conteudo do campo perfil, da tabela funcionario
                String perfil = rs.getString(7);
                // a estrutura abaixo trata o perfil do usuario
                if (perfil.equals("Administrador")) {
                    Principal tela = new Principal();
                    tela.setVisible(true);
                    Principal.MnFuncionario.setEnabled(true);
                    Principal.lblusuario.setText(rs.getString(3));
                    Color corUsuario = new Color(204,85,73);
                    Principal.lblusuario.setForeground(corUsuario);
                    setCpf(rs.getString(1));
                    setId(rs.getString(2));
                    setNomefunc(rs.getString(3));
                    setCrmv(rs.getString(10));
                } else {
                    Principal tela = new Principal();
                    tela.setVisible(true);
                    Principal.lblusuario.setText(rs.getString(3));
                    setCpf(rs.getString(1));
                    setId(rs.getString(2));
                    setNomefunc(rs.getString(3));
                    setCrmv(rs.getString(10));
                }
            } else {
                JOptionPane.showMessageDialog(null, "usuario e/ou senha inválido(s)");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    private static String nomefunc; 
    private static String Crmv;
    private static String cpf;
    private static String id;
    
    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Login.id = id;
    }
    
    
    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        Login.cpf = cpf;
    }
    

    public static String getNomefunc() {
        return nomefunc;
    }

    public static void setNomefunc(String nomefunc) {
        Login.nomefunc = nomefunc;
    }

    public static String getCrmv() {
        return Crmv;
    }

    public static void setCrmv(String Crmv) {
        Login.Crmv = Crmv;
    }
    
    
    
    
    

    public void limpar() {
        Tx_usuario.setText("");
        Tx_senha.setText("");
    }

    Color verde = new Color(51, 255, 102);
    Color vermelho = new Color(238, 95, 95);

    public Login() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/iconeLogin.png")).getImage());
        conexao = ModuloConexao.conector();
        //System.out.println(conexao);
        if (conexao != null) {
            ImageIcon imgConectado = new ImageIcon(getClass().getResource("/clinica/imagem/bancoconectadoteste.png"));
            Image imgTeste = imgConectado.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
            lblStatus.setIcon(new ImageIcon(imgTeste));
        } else {
            ImageIcon imgDesconectado = new ImageIcon(getClass().getResource("/clinica/imagem/desconectado.png"));
            Image imgdesc = imgDesconectado.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
            lblStatus.setIcon(new ImageIcon(imgdesc));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImgUsuario = new javax.swing.JLabel();
        ImgSenha = new javax.swing.JLabel();
        Tx_usuario = new javax.swing.JTextField();
        BtEntrar = new javax.swing.JButton();
        Tx_senha = new javax.swing.JPasswordField();
        JbImagem = new javax.swing.JLabel();
        BtSair = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formHierarchyChanged(evt);
            }
        });

        ImgUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/do-utilizador.png"))); // NOI18N

        ImgSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImgSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/trancar.png"))); // NOI18N

        Tx_usuario.setBackground(new java.awt.Color(202, 242, 222));
        Tx_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_usuarioActionPerformed(evt);
            }
        });

        BtEntrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtEntrar.setText("ENTRAR");
        BtEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEntrarActionPerformed(evt);
            }
        });

        Tx_senha.setBackground(new java.awt.Color(201, 239, 220));
        Tx_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_senha(evt);
            }
        });

        JbImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/login.jpg"))); // NOI18N

        BtSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtSair.setText("SAIR");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JbImagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ImgSenha)
                                    .addComponent(ImgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tx_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tx_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ImgUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(Tx_usuario))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tx_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(381, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tx_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tx_usuarioActionPerformed

    private void BtEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEntrarActionPerformed
        logar();
        limpar();
    }//GEN-LAST:event_BtEntrarActionPerformed

    private void Tx_senha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_senha
        // TODO add your handling code here:
    }//GEN-LAST:event_Tx_senha

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formHierarchyChanged

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        exit();
    }//GEN-LAST:event_BtSairActionPerformed

    public void exit() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saida", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resp == 0) {
            this.dispose();
        }
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEntrar;
    private javax.swing.JButton BtSair;
    private javax.swing.JLabel ImgSenha;
    private javax.swing.JLabel ImgUsuario;
    private javax.swing.JLabel JbImagem;
    private javax.swing.JPasswordField Tx_senha;
    private javax.swing.JTextField Tx_usuario;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
