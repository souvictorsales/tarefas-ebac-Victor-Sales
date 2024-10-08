import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//commit
/**
 *
 * @author victo
 */
public class Layout extends JFrame {
    private ClienteDAO clienteDAO = new ClienteDAOImpl();
    //private JTextField jTextFieldNome, jTextFieldCpf, jTextFieldEndereco, jTextFieldCidade, jTextFieldEstado, jTextFieldEmail, jTextFieldTelefone;
    //private JTable jTableClientes;
    private tableModel model;
    private DefaultTableModel tableModel;

    /**
     * Creates new form Layout
     * @param connection
     */
    public Layout() {
        //clienteDAO = new ClienteDAO(connection); //nao deu certo esse
        initComponents();
        initTable();
        pack();
        setLocationRelativeTo(null);
        //setVisible(true);
        setTitle("Cadastro de Clientes");
        //model = new tableModel();
        //jTableClientes = new JTable(model);
        //JScrollPane scrollPane = new JScrollPane(jTableClientes);
        //scrollPane.setPreferredSize(new Dimension(800, 200));
        //add(scrollPane, BorderLayout.CENTER);
    }
        private void initTable(){
        String[] columnNames = {"Nome", "CPF", "Telefone", "E-mail"};
        tableModel = new NonEditableTableModel(columnNames, 0);
        jTableClientes.setModel(tableModel);

        jTableClientes = new JTable();
        JScrollPane scrollPane = new JScrollPane(jTableClientes);
        scrollPane.setPreferredSize(new Dimension(820, 700));
        //add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        JButton listarButton = new JButton("Listar Clientes");
        listarButton.addActionListener(e -> listarClientes());
        add(listarButton, BorderLayout.SOUTH);
    }
        
        public class NonEditableTableModel extends DefaultTableModel {
    public NonEditableTableModel(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false; // This makes all cells non-editable
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jButtonCadastro = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonVisualizar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setText("Nome:");

        jLabelCpf.setText("CPF:");

        jLabelEmail.setText("E-mail:");

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(jTableClientes);

        jLabelEndereco.setText("Endereço:");

        jLabelCidade.setText("Cidade:");

        jLabelEstado.setText("Estado:");

        jLabelTelefone.setText("Telefone:");

        jButtonCadastro.setText("Cadastrar");
        jButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar Cadastro");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonVisualizar.setText("Listar Cadastros");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir Cadastro");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jMenu1.setText("Opções");

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButtonCadastro)
                        .addGap(64, 64, 64)
                        .addComponent(jButtonAtualizar)
                        .addGap(63, 63, 63)
                        .addComponent(jButtonVisualizar)
                        .addGap(63, 63, 63)
                        .addComponent(jButtonExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabelNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(jLabelCpf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelEndereco)
                                    .addGap(12, 12, 12)
                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelCidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabelEstado)
                                    .addGap(12, 12, 12)
                                    .addComponent(jTextFieldEstado))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelEmail)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabelTelefone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCpf)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastro)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonVisualizar)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroActionPerformed
    jButtonCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarCliente();
            }
        });
    }//GEN-LAST:event_jButtonCadastroActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
    jButtonAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarCliente();
            }
        });
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
    jButtonVisualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarClientes();
            }
        });
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
    jButtonExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirCliente();
            }
        });  
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        int result = JOptionPane.showConfirmDialog(this,"Deseja sair da aplicação?","Sair",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuSairActionPerformed
    private void cadastrarCliente() {
        ClienteCarros cliente = new ClienteCarros(
                jTextFieldCpf.getText(),
                jTextFieldEmail.getText(),
                jTextFieldNome.getText(),
                jTextFieldTelefone.getText(),
                jTextFieldEndereco.getText(),
                jTextFieldCidade.getText(),
                jTextFieldEstado.getText()
        );
        clienteDAO.adicionar(cliente);
        limparCampos();
        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
    }
    
    private void atualizarCliente() {
        ClienteCarros cliente = clienteDAO.buscarPorCPF(jTextFieldCpf.getText());
        if (cliente != null) {
            cliente.setEmail(jTextFieldEmail.getText());
            cliente.setNome(jTextFieldNome.getText());
            cliente.setTelefone(jTextFieldTelefone.getText());
            cliente.setEndereco(jTextFieldEndereco.getText());
            cliente.setCidade(jTextFieldCidade.getText());
            cliente.setEstado(jTextFieldEstado.getText());
            clienteDAO.atualizar(cliente);
            limparCampos();
            JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado!"); 
        }
    }
    
    private void listarClientes() {
        System.out.println("Método listarClientes() chamado"); // Depuração
        List<ClienteCarros> clientes = clienteDAO.listarTodos();
        System.out.println("Número de clientes recuperados: " + clientes.size()); // Depuração
        tableModel.setRowCount(0);
        for (ClienteCarros cliente : clientes) {
            System.out.println("Adicionando cliente: " + cliente.getNome() + ", " + cliente.getCpf() + ", " + cliente.getTelefone() + ", " + cliente.getEmail());
            tableModel.addRow(new Object[]{
                    cliente.getNome(),
                    cliente.getCpf(),
                    cliente.getTelefone(),
                    cliente.getEmail()
            });
        }
        System.out.println("Tabela atualizada com " + tableModel.getRowCount() + " linhas"); // Depuração
        tableModel.fireTableDataChanged();
        jTableClientes.repaint();
        jTableClientes.revalidate();
        System.out.println("Tabela atualizada com " + tableModel.getRowCount() + " linhas");
        for (int i = 0; i < tableModel.getRowCount(); i++) {
        System.out.println("Linha " + i + ": " + tableModel.getValueAt(i, 0) + ", " + tableModel.getValueAt(i, 1) + ", " + tableModel.getValueAt(i, 2) + ", " + tableModel.getValueAt(i, 3));
    }
    tableModel.fireTableDataChanged();
    jTableClientes.repaint();
        System.out.println("TableModel: " + tableModel);
        System.out.println("JTable: " + jTableClientes);
        System.out.println("JTable model: " + jTableClientes.getModel());
        
    }

    private void excluirCliente() {
        String cpf = jTextFieldCpf.getText();
        clienteDAO.remover(cpf);
        limparCampos();
        JOptionPane.showMessageDialog(this, "Cliente removido com sucesso!");
    }

    private void limparCampos() {
        jTextFieldNome.setText("");
        jTextFieldCpf.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldCidade.setText("");
        jTextFieldEstado.setText("");
        jTextFieldEmail.setText("");
        jTextFieldTelefone.setText("");
    }
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
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables

    private static class tableModel extends DefaultTableModel {
        private static final String[] COLUMN_NAMES = {"Nome", "CPF", "E-mail", "Telefone"};

        public tableModel() {
            super(COLUMN_NAMES, 0); // 0 indica que começamos sem nenhuma linha
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false; // Torna todas as células não editáveis
    }
        }
    
}
