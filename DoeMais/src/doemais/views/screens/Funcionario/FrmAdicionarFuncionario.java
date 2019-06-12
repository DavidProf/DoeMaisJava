package doemais.views.screens.Funcionario;

import java.awt.Point;

/**
 * @author DoeMais
 */
public class FrmAdicionarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form FrmAdicionarFuncionario
     */
    public FrmAdicionarFuncionario() {
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

        panel_tudo = new javax.swing.JPanel();
        panel_titleBar = new javax.swing.JPanel();
        label_login = new javax.swing.JLabel();
        button_minimizar = new javax.swing.JButton();
        button_fechar = new javax.swing.JButton();
        panel_dadosbasicos = new javax.swing.JPanel();
        textField_cpf = new javax.swing.JTextField();
        textField_nome = new javax.swing.JTextField();
        textField_sobrenome = new javax.swing.JTextField();
        panel_dataNascimento = new javax.swing.JPanel();
        textField_dataDia = new javax.swing.JTextField();
        textField_dataMes = new javax.swing.JTextField();
        textField_dataAno = new javax.swing.JTextField();
        panel_endereco = new javax.swing.JPanel();
        textField_cep = new javax.swing.JTextField();
        textField_logradouro = new javax.swing.JTextField();
        textField_numero = new javax.swing.JTextField();
        textField_complemento = new javax.swing.JTextField();
        textField_bairro = new javax.swing.JTextField();
        textField_cidade = new javax.swing.JTextField();
        textField_cidade1 = new javax.swing.JTextField();
        panel_telefones = new javax.swing.JPanel();
        textField_telefoneA = new javax.swing.JTextField();
        textField_nome1 = new javax.swing.JTextField();
        checkBox_administrador = new javax.swing.JCheckBox();
        button_adicionar = new javax.swing.JButton();
        button_salvar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DoeMais - Funcionário");
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        panel_tudo.setBackground(new java.awt.Color(255, 255, 255));
        panel_tudo.setLayout(null);

        panel_titleBar.setBackground(new java.awt.Color(0, 29, 73));
        panel_titleBar.setFocusable(false);
        panel_titleBar.setPreferredSize(new java.awt.Dimension(40, 450));
        panel_titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_titleBarMouseDragged(evt);
            }
        });
        panel_titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_titleBarMousePressed(evt);
            }
        });
        panel_titleBar.setLayout(null);

        label_login.setFont(new java.awt.Font("David", 0, 18)); // NOI18N
        label_login.setForeground(new java.awt.Color(255, 255, 255));
        label_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_login.setText("DoeMais - Funcionario");
        label_login.setToolTipText("");
        label_login.setFocusable(false);
        label_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_titleBar.add(label_login);
        label_login.setBounds(0, 0, 200, 40);

        button_minimizar.setBackground(new java.awt.Color(255, 255, 255));
        button_minimizar.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        button_minimizar.setForeground(new java.awt.Color(255, 255, 255));
        button_minimizar.setText("-");
        button_minimizar.setBorder(null);
        button_minimizar.setFocusable(false);
        button_minimizar.setOpaque(false);
        button_minimizar.setRequestFocusEnabled(false);
        button_minimizar.addActionListener((e)-> {setExtendedState(ICONIFIED);});
        panel_titleBar.add(button_minimizar);
        button_minimizar.setBounds(550, 0, 40, 40);

        button_fechar.setBackground(new java.awt.Color(250, 65, 65));
        button_fechar.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        button_fechar.setForeground(new java.awt.Color(255, 255, 255));
        button_fechar.setText("X");
        button_fechar.setBorder(null);
        button_fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_fechar.setFocusable(false);
        button_fechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_fechar.setRequestFocusEnabled(false);
        button_fechar.addActionListener((e)-> {doemais.views.screens.FrmMenu.habilitarFuncionario();this.dispose();});
        panel_titleBar.add(button_fechar);
        button_fechar.setBounds(590, 0, 40, 40);

        panel_tudo.add(panel_titleBar);
        panel_titleBar.setBounds(0, 0, 630, 40);

        panel_dadosbasicos.setBackground(new java.awt.Color(255, 255, 255));
        panel_dadosbasicos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Dados Básicos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        panel_dadosbasicos.setLayout(null);

        textField_cpf.setBackground(new java.awt.Color(219, 243, 255));
        textField_cpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_cpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_cpf.setUI(new doemais.views.UI.JTextFieldHintUI("CPF - Somente nºs", new java.awt.Color(166,166,166)));
        textField_cpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_cpf.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_dadosbasicos.add(textField_cpf);
        textField_cpf.setBounds(10, 15, 135, 30);

        textField_nome.setBackground(new java.awt.Color(219, 243, 255));
        textField_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_nome.setUI(new doemais.views.UI.JTextFieldHintUI("Nome", new java.awt.Color(166,166,166)));
        textField_nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_nome.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_dadosbasicos.add(textField_nome);
        textField_nome.setBounds(150, 15, 135, 30);

        textField_sobrenome.setBackground(new java.awt.Color(219, 243, 255));
        textField_sobrenome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_sobrenome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_sobrenome.setUI(new doemais.views.UI.JTextFieldHintUI("Sobrenome", new java.awt.Color(166,166,166)));
        textField_sobrenome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_sobrenome.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_dadosbasicos.add(textField_sobrenome);
        textField_sobrenome.setBounds(290, 15, 135, 30);

        panel_tudo.add(panel_dadosbasicos);
        panel_dadosbasicos.setBounds(10, 50, 435, 55);

        panel_dataNascimento.setBackground(new java.awt.Color(255, 255, 255));
        panel_dataNascimento.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nascimento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        panel_dataNascimento.setLayout(null);

        textField_dataDia.setBackground(new java.awt.Color(219, 243, 255));
        textField_dataDia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_dataDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_dataDia.setUI(new doemais.views.UI.JTextFieldHintUI("Dia", new java.awt.Color(166,166,166)));
        textField_dataDia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_dataDia.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_dataNascimento.add(textField_dataDia);
        textField_dataDia.setBounds(10, 15, 35, 30);

        textField_dataMes.setBackground(new java.awt.Color(219, 243, 255));
        textField_dataMes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_dataMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_dataMes.setUI(new doemais.views.UI.JTextFieldHintUI("Mês", new java.awt.Color(166,166,166)));
        textField_dataMes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_dataMes.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_dataNascimento.add(textField_dataMes);
        textField_dataMes.setBounds(50, 15, 35, 30);

        textField_dataAno.setBackground(new java.awt.Color(219, 243, 255));
        textField_dataAno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_dataAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_dataAno.setUI(new doemais.views.UI.JTextFieldHintUI("Ano", new java.awt.Color(166,166,166)));
        textField_dataAno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_dataAno.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_dataNascimento.add(textField_dataAno);
        textField_dataAno.setBounds(90, 15, 70, 30);

        panel_tudo.add(panel_dataNascimento);
        panel_dataNascimento.setBounds(455, 50, 170, 55);

        panel_endereco.setBackground(new java.awt.Color(255, 255, 255));
        panel_endereco.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Endereço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        panel_endereco.setLayout(null);

        textField_cep.setBackground(new java.awt.Color(219, 243, 255));
        textField_cep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_cep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_cep.setUI(new doemais.views.UI.JTextFieldHintUI("CEP - Somente nºs", new java.awt.Color(166,166,166)));
        textField_cep.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_cep.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_endereco.add(textField_cep);
        textField_cep.setBounds(10, 15, 135, 30);

        textField_logradouro.setBackground(new java.awt.Color(219, 243, 255));
        textField_logradouro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_logradouro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_logradouro.setUI(new doemais.views.UI.JTextFieldHintUI("Logradouro", new java.awt.Color(166,166,166)));
        textField_logradouro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_logradouro.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_endereco.add(textField_logradouro);
        textField_logradouro.setBounds(150, 15, 235, 30);

        textField_numero.setBackground(new java.awt.Color(219, 243, 255));
        textField_numero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_numero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_numero.setUI(new doemais.views.UI.JTextFieldHintUI("Nº", new java.awt.Color(166,166,166)));
        textField_numero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_numero.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_endereco.add(textField_numero);
        textField_numero.setBounds(390, 15, 100, 30);

        textField_complemento.setBackground(new java.awt.Color(219, 243, 255));
        textField_complemento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_complemento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_complemento.setUI(new doemais.views.UI.JTextFieldHintUI("Complemento", new java.awt.Color(166,166,166)));
        textField_complemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_complemento.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_endereco.add(textField_complemento);
        textField_complemento.setBounds(495, 15, 110, 30);

        textField_bairro.setBackground(new java.awt.Color(219, 243, 255));
        textField_bairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_bairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_bairro.setUI(new doemais.views.UI.JTextFieldHintUI("Bairro", new java.awt.Color(166,166,166)));
        textField_bairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_bairro.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_endereco.add(textField_bairro);
        textField_bairro.setBounds(10, 50, 230, 30);

        textField_cidade.setBackground(new java.awt.Color(219, 243, 255));
        textField_cidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_cidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_cidade.setUI(new doemais.views.UI.JTextFieldHintUI("Cidade", new java.awt.Color(166,166,166)));
        textField_cidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_cidade.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_endereco.add(textField_cidade);
        textField_cidade.setBounds(245, 50, 230, 30);

        textField_cidade1.setBackground(new java.awt.Color(219, 243, 255));
        textField_cidade1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_cidade1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_cidade1.setUI(new doemais.views.UI.JTextFieldHintUI("UF", new java.awt.Color(166,166,166)));
        textField_cidade1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_cidade1.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_endereco.add(textField_cidade1);
        textField_cidade1.setBounds(500, 50, 100, 30);

        panel_tudo.add(panel_endereco);
        panel_endereco.setBounds(10, 110, 615, 90);

        panel_telefones.setBackground(new java.awt.Color(255, 255, 255));
        panel_telefones.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Telefones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        panel_telefones.setLayout(null);

        textField_telefoneA.setBackground(new java.awt.Color(219, 243, 255));
        textField_telefoneA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_telefoneA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_telefoneA.setUI(new doemais.views.UI.JTextFieldHintUI("Telefone A", new java.awt.Color(166,166,166)));
        textField_telefoneA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_telefoneA.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_telefones.add(textField_telefoneA);
        textField_telefoneA.setBounds(10, 15, 135, 30);

        textField_nome1.setBackground(new java.awt.Color(219, 243, 255));
        textField_nome1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_nome1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField_nome1.setUI(new doemais.views.UI.JTextFieldHintUI("Telefone B", new java.awt.Color(166,166,166)));
        textField_nome1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textField_nome1.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_telefones.add(textField_nome1);
        textField_nome1.setBounds(150, 15, 135, 30);

        panel_tudo.add(panel_telefones);
        panel_telefones.setBounds(10, 205, 295, 55);

        checkBox_administrador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        checkBox_administrador.setText("administrador");
        checkBox_administrador.setOpaque(false);
        panel_tudo.add(checkBox_administrador);
        checkBox_administrador.setBounds(310, 220, 110, 23);

        button_adicionar.setBackground(new java.awt.Color(11, 26, 51));
        button_adicionar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        button_adicionar.setForeground(new java.awt.Color(255, 255, 255));
        button_adicionar.setText("Adicionar");
        button_adicionar.setBorder(null);
        button_adicionar.setBorderPainted(false);
        button_adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_adicionar.setFocusPainted(false);
        panel_tudo.add(button_adicionar);
        button_adicionar.setBounds(525, 220, 100, 30);

        button_salvar1.setBackground(new java.awt.Color(250, 65, 65));
        button_salvar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        button_salvar1.setForeground(new java.awt.Color(255, 255, 255));
        button_salvar1.setText("Cancelar");
        button_salvar1.setBorder(null);
        button_salvar1.setBorderPainted(false);
        button_salvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_salvar1.setFocusPainted(false);
        panel_tudo.add(button_salvar1);
        button_salvar1.setBounds(420, 220, 100, 30);

        getContentPane().add(panel_tudo, "card2");

        setSize(new java.awt.Dimension(630, 265));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panel_titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_titleBarMouseDragged
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_panel_titleBarMouseDragged

    private void panel_titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_titleBarMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_panel_titleBarMousePressed

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAdicionarFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdicionarFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdicionarFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdicionarFuncionario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdicionarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_adicionar;
    private javax.swing.JButton button_fechar;
    private javax.swing.JButton button_minimizar;
    private javax.swing.JButton button_salvar1;
    private javax.swing.JCheckBox checkBox_administrador;
    private javax.swing.JLabel label_login;
    private javax.swing.JPanel panel_dadosbasicos;
    private javax.swing.JPanel panel_dataNascimento;
    private javax.swing.JPanel panel_endereco;
    private javax.swing.JPanel panel_telefones;
    private javax.swing.JPanel panel_titleBar;
    private javax.swing.JPanel panel_tudo;
    private javax.swing.JTextField textField_bairro;
    private javax.swing.JTextField textField_cep;
    private javax.swing.JTextField textField_cidade;
    private javax.swing.JTextField textField_cidade1;
    private javax.swing.JTextField textField_complemento;
    private javax.swing.JTextField textField_cpf;
    private javax.swing.JTextField textField_dataAno;
    private javax.swing.JTextField textField_dataDia;
    private javax.swing.JTextField textField_dataMes;
    private javax.swing.JTextField textField_logradouro;
    private javax.swing.JTextField textField_nome;
    private javax.swing.JTextField textField_nome1;
    private javax.swing.JTextField textField_numero;
    private javax.swing.JTextField textField_sobrenome;
    private javax.swing.JTextField textField_telefoneA;
    // End of variables declaration//GEN-END:variables

    private Point point = new Point();
}
