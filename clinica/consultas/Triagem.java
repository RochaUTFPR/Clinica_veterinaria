
package clinica.consultas;

import clinica.dal.ModuloConexao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import clinica.interfaces.Login;
import net.proteanit.sql.DbUtils;

// falta limpar os campos!!!

public class Triagem extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    
    private static Triagem cadTriagem;
    
    public static Triagem getCadTriagem(){
        if (cadTriagem == null) {
            cadTriagem = new Triagem();
        }

        return cadTriagem;
    }

    Color cor = new Color(202,242,222);
    public Triagem() {
        initComponents();
        TxFuncionario.setText(clinica.interfaces.Login.getNomefunc());
        TxCrmv.setText(clinica.interfaces.Login.getCrmv());
        conexao = ModuloConexao.conector();
        getContentPane().setBackground(cor);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/icone.png")).getImage());
    }
    
    private static String cod_consulta;

    public static String getCod_consulta() {
        return cod_consulta;
    }

    public static void setCod_consulta(String cad_consulta) {
        Triagem.cod_consulta = cad_consulta;
    }
  

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbBuscar = new javax.swing.JLabel();
        LbFuncionario = new javax.swing.JLabel();
        LbCliente = new javax.swing.JLabel();
        LbData = new javax.swing.JLabel();
        LbCrmv = new javax.swing.JLabel();
        TxFuncionario = new javax.swing.JTextField();
        TxCliente = new javax.swing.JTextField();
        TxData = new javax.swing.JFormattedTextField();
        TxCrmv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbDadosTriagem = new javax.swing.JTable();
        LbHora = new javax.swing.JLabel();
        TxHora = new javax.swing.JFormattedTextField();
        LbServico = new javax.swing.JLabel();
        TxNomeanimal = new javax.swing.JTextField();
        LbAnimal = new javax.swing.JLabel();
        TxBusca = new javax.swing.JFormattedTextField();
        BtAtualizar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        JcomboServicos = new javax.swing.JComboBox<>();
        LbCPF = new javax.swing.JLabel();
        TxCPF = new javax.swing.JFormattedTextField();
        BtSair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        LbPeso = new javax.swing.JLabel();
        LbAltura = new javax.swing.JLabel();
        LbGravidade = new javax.swing.JLabel();
        LbPressao = new javax.swing.JLabel();
        TxAltura = new javax.swing.JTextField();
        TxPressao = new javax.swing.JTextField();
        TxPeso = new javax.swing.JTextField();
        JcomboGravidade = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbDadosCliente = new javax.swing.JTable();
        Imagem = new javax.swing.JLabel();
        BtCadConsulta = new javax.swing.JButton();
        LbValor = new javax.swing.JLabel();
        TxValor = new javax.swing.JTextField();
        Txbuscanome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txcodigo = new javax.swing.JTextField();
        Txcodigoconsulta = new javax.swing.JTextField();
        LbCodigoConsulta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxIdAnimal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxIdCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamentos de Serviços");
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LbBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbBuscar.setText("Buscar por data:");

        LbFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbFuncionario.setText("Funcionário:");

        LbCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbCliente.setText("Cliente:");

        LbData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbData.setText("Data:");

        LbCrmv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbCrmv.setText("CRMV:");

        TxFuncionario.setEditable(false);
        TxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxFuncionarioActionPerformed(evt);
            }
        });

        TxCliente.setEditable(false);
        TxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxClienteActionPerformed(evt);
            }
        });

        try {
            TxData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TxCrmv.setEditable(false);
        TxCrmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxCrmvActionPerformed(evt);
            }
        });

        TbDadosTriagem = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TbDadosTriagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Funcionario", "CRMV", "Cliente", "CPF", "Nome", "Serviço", "Data", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbDadosTriagem.getTableHeader().setReorderingAllowed(false);
        TbDadosTriagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbDadosTriagemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbDadosTriagem);
        if (TbDadosTriagem.getColumnModel().getColumnCount() > 0) {
            TbDadosTriagem.getColumnModel().getColumn(0).setResizable(false);
            TbDadosTriagem.getColumnModel().getColumn(1).setResizable(false);
            TbDadosTriagem.getColumnModel().getColumn(2).setResizable(false);
            TbDadosTriagem.getColumnModel().getColumn(3).setResizable(false);
            TbDadosTriagem.getColumnModel().getColumn(4).setResizable(false);
            TbDadosTriagem.getColumnModel().getColumn(5).setResizable(false);
            TbDadosTriagem.getColumnModel().getColumn(6).setResizable(false);
            TbDadosTriagem.getColumnModel().getColumn(7).setResizable(false);
        }

        LbHora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbHora.setText("Hora:");

        try {
            TxHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        LbServico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbServico.setText("Serviço:");

        TxNomeanimal.setEditable(false);

        LbAnimal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbAnimal.setText("Nome do Animal:");

        try {
            TxBusca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxBuscaActionPerformed(evt);
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

        BtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/procurar.png"))); // NOI18N
        BtBuscar.setBorder(null);
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        JcomboServicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banho/Tosa", "Consulta Médica", "Cirurgia" }));
        JcomboServicos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JcomboServicosFocusGained(evt);
            }
        });
        JcomboServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcomboServicosActionPerformed(evt);
            }
        });

        LbCPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbCPF.setText("CPF:");

        TxCPF.setEditable(false);
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

        BtSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/seta-pequena-esquerda.png"))); // NOI18N
        BtSair.setBorder(null);
        BtSair.setFocusPainted(false);
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        LbPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbPeso.setText("Peso:");

        LbAltura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbAltura.setText("Altura:");

        LbGravidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbGravidade.setText("Gravidade:");

        LbPressao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbPressao.setText("Pressão:");

        TxAltura.setEditable(false);
        TxAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAlturaActionPerformed(evt);
            }
        });

        TxPressao.setEditable(false);
        TxPressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxPressaoActionPerformed(evt);
            }
        });

        TxPeso.setEditable(false);
        TxPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxPesoActionPerformed(evt);
            }
        });

        JcomboGravidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixo", "Médio", "Alto" }));
        JcomboGravidade.setEnabled(false);
        JcomboGravidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcomboGravidadeActionPerformed(evt);
            }
        });

        TbDadosCliente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        TbDadosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Animal", "Peso", "Altura", "Pressao", "Gravidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbDadosCliente.getTableHeader().setReorderingAllowed(false);
        TbDadosCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbDadosClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TbDadosCliente);

        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagem/triagem.png"))); // NOI18N

        BtCadConsulta.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        BtCadConsulta.setText("Realizar Consulta");
        BtCadConsulta.setBorder(null);
        BtCadConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadConsultaActionPerformed(evt);
            }
        });

        LbValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbValor.setText("Valor:");

        TxValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxValorActionPerformed(evt);
            }
        });

        Txbuscanome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxbuscanomeKeyReleased(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Código :");

        Txcodigo.setEditable(false);

        Txcodigoconsulta.setEditable(false);

        LbCodigoConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LbCodigoConsulta.setText("Código da consulta:");

        jLabel4.setText("ID do animal:");

        TxIdAnimal.setEditable(false);

        jLabel5.setText("ID do cliente:");

        TxIdCliente.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LbPeso)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(99, 99, 99)
                                    .addComponent(LbAltura)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(114, 114, 114)
                                    .addComponent(LbPressao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TxPressao, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(106, 106, 106)
                                    .addComponent(LbGravidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JcomboGravidade, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LbValor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LbFuncionario)
                                        .addComponent(LbCrmv))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxCrmv, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LbCliente)
                                        .addComponent(LbCPF))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(15, 15, 15)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txbuscanome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LbBuscar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LbAnimal)
                                        .addComponent(LbServico))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TxNomeanimal)
                                        .addComponent(JcomboServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LbHora)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LbData)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(121, 121, 121)
                                    .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(59, 59, 59)
                                    .addComponent(BtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(59, 59, 59)
                                    .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(LbCodigoConsulta)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Txcodigoconsulta))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addComponent(BtCadConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(77, 77, 77))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Txbuscanome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(Txcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtSair))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbFuncionario)
                            .addComponent(TxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbCliente)
                            .addComponent(TxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TxIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LbCrmv)
                            .addComponent(TxCrmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbCPF)
                            .addComponent(TxCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(TxIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbBuscar)))
                            .addComponent(BtBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxNomeanimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbAnimal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbServico)
                                    .addComponent(JcomboServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LbPeso)
                        .addComponent(LbAltura)
                        .addComponent(LbPressao)
                        .addComponent(TxAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxPressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LbGravidade)
                        .addComponent(JcomboGravidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtCadConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txcodigoconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbCodigoConsulta))))
                .addGap(0, 72, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1069, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxFuncionarioActionPerformed
       
    }//GEN-LAST:event_TxFuncionarioActionPerformed

    private void TxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxClienteActionPerformed
        
    }//GEN-LAST:event_TxClienteActionPerformed

    private void TxCrmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCrmvActionPerformed
        
    }//GEN-LAST:event_TxCrmvActionPerformed

    private void TxBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxBuscaActionPerformed
        
    }//GEN-LAST:event_TxBuscaActionPerformed

    private void BtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtualizarActionPerformed
        //atualiza
        alterar();
        limpar();
    }//GEN-LAST:event_BtAtualizarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        //exclui
        excluir();
        limpar();
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        //salva
        cadastrar();
        limpar();
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        buscardata();
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void JcomboServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcomboServicosActionPerformed
    if(JcomboServicos.getSelectedItem().toString().equals("Consulta Médica") || JcomboServicos.getSelectedItem().toString().equals("Cirurgia")){
            TxPeso.setEditable(true); 
            TxAltura.setEditable(true);
            TxPressao.setEditable(true);
            JcomboGravidade.setEnabled(true);
        }else{
            TxPeso.setEditable(false); 
            TxAltura.setEditable(false);
            TxPressao.setEditable(false);
            JcomboGravidade.setEnabled(false);
        }
    }//GEN-LAST:event_JcomboServicosActionPerformed

    private void TxCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxCPFActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        exit();
        limpar();
    }//GEN-LAST:event_BtSairActionPerformed

    private void TxAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAlturaActionPerformed

    private void TxPressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxPressaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxPressaoActionPerformed

    private void TxPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxPesoActionPerformed

    private void JcomboGravidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcomboGravidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcomboGravidadeActionPerformed

    private void BtCadConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadConsultaActionPerformed
        setCod_consulta(Txcodigoconsulta.getText());
        CadConsulta.getCadConsulta().setVisible(true);
    }//GEN-LAST:event_BtCadConsultaActionPerformed

    private void TxValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxValorActionPerformed
      

    }//GEN-LAST:event_TxValorActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
     
    }//GEN-LAST:event_formFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void JcomboServicosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JcomboServicosFocusGained
       
    }//GEN-LAST:event_JcomboServicosFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       
    }//GEN-LAST:event_formWindowGainedFocus

    private void TxbuscanomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbuscanomeKeyReleased
     buscarpornome();
    }//GEN-LAST:event_TxbuscanomeKeyReleased

    private void TbDadosClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbDadosClienteMouseClicked
      setar_campos();
    }//GEN-LAST:event_TbDadosClienteMouseClicked

    private void TbDadosTriagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbDadosTriagemMouseClicked
     setar_camposcliente();
    }//GEN-LAST:event_TbDadosTriagemMouseClicked
    //pronto
    private void cadastrar() {
        String sql = "insert into consulta (data, hora, servico, peso, altura, pressao, gravidade, valor, id_animal,id_cli, id_func) values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,TxData.getText());
            pst.setString(2,TxHora.getText());
            pst.setString(3,JcomboServicos.getSelectedItem().toString());
            if (TxPeso.getText().equals("")) {
                pst.setString(4, null);
            } else {
                pst.setString(4, TxPeso.getText());
            }
            if (TxAltura.getText().equals("")) {
                pst.setString(5, null);
            } else {
                pst.setString(5, TxAltura.getText());
            }
            if (TxPressao.getText().equals("")) {
                pst.setString(6, null);
            } else {
                pst.setString(6, TxPressao.getText());
            }
            pst.setString(7,JcomboGravidade.getSelectedItem().toString());
            pst.setString(8,TxValor.getText());
            pst.setString(9,TxIdAnimal.getText());
            pst.setString(10,TxIdCliente.getText());
            pst.setString(11,clinica.interfaces.Login.getId());
            
            //validação dos campos obrigatorios
            if (TxCPF.getText().isEmpty() || TxCliente.getText().isEmpty() || 
                TxValor.getText().isEmpty() || TxData.getText().equals("  /  /    ") || 
                TxHora.getText().equals("  :  ")){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
            } else {

                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Serviço agendado com sucesso");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //pronto
    private void buscardata() {
        String sql = "select codigo_cons as 'Codigo',id_animal 'Id animal', id_cli 'Id cliente',data 'Data',hora 'Hora',servico 'Serviço',peso 'Peso',altura 'Altura',pressao 'Pressão',gravidade 'Gravidade',valor 'Valor' from consulta where data like ?";
        try {
            pst = conexao.prepareStatement(sql);
            //passando o conteudo da caixa de pesquisa para o ?
            //atenção ao % - continuação da String sql
            pst.setString(1,TxBusca.getText() + "%");
            rs=pst.executeQuery();
            //a linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
            TbDadosTriagem.setModel(DbUtils.resultSetToTableModel(rs));
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
    //pronto
    private void buscarpornome() {
        String sql = "select nome_cli 'Nome do cliente',cpf_cli 'CPF',id_animal 'Id', nome_animal 'Nome do animal',especie 'Espécie',raca 'Raça', sexo 'Sexo', id_cli from cliente natural join animal where nome_cli like ?;";
        try {
            pst = conexao.prepareStatement(sql);
            //passando o conteudo da caixa de pesquisa para o ?
            //atenção ao % - continuação da String sql
            pst.setString(1,Txbuscanome.getText() + "%");
            rs=pst.executeQuery();
            //a linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
            TbDadosCliente.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // falta arrumar limpar esta apitando
    public void setar_camposcliente(){
            limpar();
        int setar = TbDadosTriagem.getSelectedRow();
            Txcodigoconsulta.setText(TbDadosTriagem.getModel().getValueAt(setar,0).toString());
            TxIdAnimal.setText(TbDadosTriagem.getModel().getValueAt(setar,1).toString());
            TxIdCliente.setText(TbDadosTriagem.getModel().getValueAt(setar,2).toString());
            TxData.setText(TbDadosTriagem.getModel().getValueAt(setar,3).toString());
            TxHora.setText(TbDadosTriagem.getModel().getValueAt(setar,4).toString());
            JcomboServicos.setSelectedItem(TbDadosTriagem.getModel().getValueAt(setar,5).toString());
            TxValor.setText(TbDadosTriagem.getModel().getValueAt(setar,10).toString());
            String sql = "select nome_cli,cpf_cli,nome_animal from consulta natural join animal natural join cliente where id_animal like ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,TxIdAnimal.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                TxCliente.setText(rs.getString(1));
                TxCPF.setText(rs.getString(2));
                TxNomeanimal.setText(rs.getString(3));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario não cadastrado");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
            TxPeso.setText(TbDadosTriagem.getModel().getValueAt(setar,6).toString());
            TxAltura.setText(TbDadosTriagem.getModel().getValueAt(setar,7).toString());
            TxPressao.setText(TbDadosTriagem.getModel().getValueAt(setar,8).toString());
            JcomboGravidade.setSelectedItem(TbDadosTriagem.getModel().getValueAt(setar,9).toString());   
    }
    //pronto
    public void setar_campos(){
        int setar = TbDadosCliente.getSelectedRow();
            TxCliente.setText(TbDadosCliente.getModel().getValueAt(setar,0).toString());
            TxCPF.setText(TbDadosCliente.getModel().getValueAt(setar,1).toString());
            TxIdAnimal.setText(TbDadosCliente.getModel().getValueAt(setar,2).toString());
            TxNomeanimal.setText(TbDadosCliente.getModel().getValueAt(setar,3).toString());
            TxIdCliente.setText(TbDadosCliente.getModel().getValueAt(setar,7).toString());
    }
    
    //pronto
        private void alterar() {
        String sql = "update consulta set data=?,hora=?,servico=?,peso=?,altura=?,pressao=?,gravidade=?,valor=?,id_func where codigo_cons =?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, TxData.getText());
            pst.setString(2, TxHora.getText());
            pst.setString(3,JcomboServicos.getSelectedItem().toString());
            pst.setString(4, TxPeso.getText());
            pst.setString(5, TxAltura.getText());
            pst.setString(6, TxPressao.getText());
            pst.setString(7,JcomboGravidade.getSelectedItem().toString());
            pst.setString(8, TxValor.getText());
            pst.setString(9,clinica.interfaces.Login.getId());
            pst.setString(10, Txcodigoconsulta.getText());
           
            //validação dos campos obrigatorios
            if (TxData.getText().equals("  /  /    ") || TxHora.getText().equals("  :  ") ||
                    TxValor.getText().isEmpty() || Txcodigoconsulta.getText().isEmpty()) {
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
    //pronto
    private void excluir() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover esta consulta?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from consulta where codigo_cons=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, Txcodigoconsulta.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Consulta removida com sucesso");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    //pronto
    public void limpar(){
        Txcodigo.setText("");
        Txbuscanome.setText("");
        TxBusca.setText("");
        TxCliente.setText("");
        TxNomeanimal.setText("");
        TxData.setText("");
        TxCPF.setText("");
        TxHora.setText("");
        TxPeso.setText("");
        TxAltura.setText("");
        TxPressao.setText("");
        TxValor.setText("");
        TxIdAnimal.setText("");
        TxIdCliente.setText("");
        Txcodigoconsulta.setText("");
    }
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Triagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAtualizar;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtCadConsulta;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JLabel Imagem;
    private javax.swing.JComboBox<String> JcomboGravidade;
    private javax.swing.JComboBox<String> JcomboServicos;
    private javax.swing.JLabel LbAltura;
    private javax.swing.JLabel LbAnimal;
    private javax.swing.JLabel LbBuscar;
    private javax.swing.JLabel LbCPF;
    private javax.swing.JLabel LbCliente;
    private javax.swing.JLabel LbCodigoConsulta;
    private javax.swing.JLabel LbCrmv;
    private javax.swing.JLabel LbData;
    private javax.swing.JLabel LbFuncionario;
    private javax.swing.JLabel LbGravidade;
    private javax.swing.JLabel LbHora;
    private javax.swing.JLabel LbPeso;
    private javax.swing.JLabel LbPressao;
    private javax.swing.JLabel LbServico;
    private javax.swing.JLabel LbValor;
    private javax.swing.JTable TbDadosCliente;
    private javax.swing.JTable TbDadosTriagem;
    private javax.swing.JTextField TxAltura;
    private javax.swing.JFormattedTextField TxBusca;
    private javax.swing.JFormattedTextField TxCPF;
    private javax.swing.JTextField TxCliente;
    public static javax.swing.JTextField TxCrmv;
    private javax.swing.JFormattedTextField TxData;
    public static javax.swing.JTextField TxFuncionario;
    private javax.swing.JFormattedTextField TxHora;
    private javax.swing.JTextField TxIdAnimal;
    private javax.swing.JTextField TxIdCliente;
    private javax.swing.JTextField TxNomeanimal;
    private javax.swing.JTextField TxPeso;
    private javax.swing.JTextField TxPressao;
    private javax.swing.JTextField TxValor;
    private javax.swing.JTextField Txbuscanome;
    private javax.swing.JTextField Txcodigo;
    private javax.swing.JTextField Txcodigoconsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
