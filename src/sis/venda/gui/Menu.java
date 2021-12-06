package sis.venda.gui;

import sis.venda.dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Janela menu da aplicação
 *
 * @author Mayara
 */
public class Menu extends javax.swing.JFrame {

    Conexao con;

    public Menu() throws ClassNotFoundException, SQLException {
        initComponents();
        this.con = new Conexao();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btVenda = new javax.swing.JButton();
        btCompra = new javax.swing.JButton();
        btProduto = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btFornecedor = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        fundo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        miProduto = new javax.swing.JMenuItem();
        miCliente = new javax.swing.JMenuItem();
        miFornecedor = new javax.swing.JMenuItem();
        menuMovimentos = new javax.swing.JMenu();
        miVenda = new javax.swing.JMenuItem();
        miCompra = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        miRelatorioVendas = new javax.swing.JMenuItem();
        miRelatorioProdutos = new javax.swing.JMenuItem();
        miRelatorioClientes = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        miSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");
        setResizable(false);

        toolBar.setBackground(new java.awt.Color(238, 206, 224));
        toolBar.setFloatable(false);

        btVenda.setBackground(new java.awt.Color(238, 206, 224));
        btVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/venda.png"))); // NOI18N
        btVenda.setText("Venda");
        btVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVenda.setFocusable(false);
        btVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVenda.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/venda-foco.png"))); // NOI18N
        btVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        toolBar.add(btVenda);

        btCompra.setBackground(new java.awt.Color(238, 206, 224));
        btCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/compra.png"))); // NOI18N
        btCompra.setText("Compra");
        btCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCompra.setFocusable(false);
        btCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCompra.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/compra-foco.png"))); // NOI18N
        btCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        toolBar.add(btCompra);

        btProduto.setBackground(new java.awt.Color(238, 206, 224));
        btProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/produto.png"))); // NOI18N
        btProduto.setText("Produto");
        btProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProduto.setFocusable(false);
        btProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProduto.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/produto-foco.png"))); // NOI18N
        btProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        toolBar.add(btProduto);

        btCliente.setBackground(new java.awt.Color(238, 206, 224));
        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/cliente.png"))); // NOI18N
        btCliente.setText("Cliente");
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCliente.setFocusable(false);
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/cliente-foco.png"))); // NOI18N
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        toolBar.add(btCliente);

        btFornecedor.setBackground(new java.awt.Color(238, 206, 224));
        btFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/fornecedor.png"))); // NOI18N
        btFornecedor.setText("Fornecedor");
        btFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFornecedor.setFocusable(false);
        btFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFornecedor.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/fornecedor-foco.png"))); // NOI18N
        btFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        toolBar.add(btFornecedor);

        btSair.setBackground(new java.awt.Color(238, 206, 224));
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/sair-foco.png"))); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        toolBar.add(btSair);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        desktopPane.setOpaque(false);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis/venda/gui/img/fundolimpo.jpg"))); // NOI18N
        fundo.setMaximumSize(new java.awt.Dimension(1200, 1200));
        desktopPane.add(fundo);
        fundo.setBounds(-6, -60, 900, 640);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        menuBar.setBackground(new java.awt.Color(217, 183, 202));

        menuCadastros.setText("Cadastros");

        miProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        miProduto.setText("Cadastrar Produto");
        miProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        menuCadastros.add(miProduto);

        miCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        miCliente.setText("Cadastrar Cliente");
        miCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        menuCadastros.add(miCliente);

        miFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        miFornecedor.setText("Cadastrar Fornecedor");
        miFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        menuCadastros.add(miFornecedor);

        menuBar.add(menuCadastros);

        menuMovimentos.setBackground(new java.awt.Color(217, 183, 202));
        menuMovimentos.setText("Movimentos");

        miVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        miVenda.setText("Registrar Venda");
        miVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        menuMovimentos.add(miVenda);

        miCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        miCompra.setText("Registrar Compra");
        miCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        menuMovimentos.add(miCompra);

        menuBar.add(menuMovimentos);

        menuRelatorios.setText("Relatórios");

        miRelatorioVendas.setText("Relatório de Vendas");
        miRelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioVendasActionPerformed(evt);
            }
        });
        menuRelatorios.add(miRelatorioVendas);

        miRelatorioProdutos.setText("Relatório de Produtos");
        miRelatorioProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioProdutosActionPerformed(evt);
            }
        });
        menuRelatorios.add(miRelatorioProdutos);

        miRelatorioClientes.setText("Relatório de Clientes");
        miRelatorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioClientesActionPerformed(evt);
            }
        });
        menuRelatorios.add(miRelatorioClientes);

        menuBar.add(menuRelatorios);

        menuSistema.setBackground(new java.awt.Color(217, 183, 202));
        menuSistema.setText("Sistema");

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        menuSistema.add(miSair);

        menuBar.add(menuSistema);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(906, 697));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProdutoActionPerformed
        CadastroProduto c = new CadastroProduto();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miProdutoActionPerformed

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        CadastroCliente c = new CadastroCliente();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miClienteActionPerformed

    private void miFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFornecedorActionPerformed
        CadastroFornecedor c = new CadastroFornecedor();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miFornecedorActionPerformed

    private void miVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaActionPerformed
        LancamentoVenda v = new LancamentoVenda();
        desktopPane.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_miVendaActionPerformed

    private void miCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCompraActionPerformed
        LancamentoCompra c = new LancamentoCompra();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miCompraActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSairActionPerformed

    private void miRelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioVendasActionPerformed
        try {
            String sql = "SELECT TBVENDA.CODIGO, DATAVENDA,VALORTOTAL,NOME,CPF, CASE SITUACAO\n"
                    + "                                   WHEN 1 THEN 'Aberta'\n"
                    + "                                   WHEN 2 THEN 'Finalizada'\n"
                    + "                                   ELSE 'Cancelada' END AS SITUACAO from TBVENDA \n"
                    + "LEFT JOIN TBCLIENTE ON TBCLIENTE.CODIGO = CODIGOCLIENTE\n"
                    + "LEFT JOIN TBITEMVENDA ON TBITEMVENDA.CODIGOVENDA= TBVENDA.CODIGO ;";
            PreparedStatement ps;
            ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            JRResultSetDataSource relatResul = new JRResultSetDataSource(rs);
            JasperPrint jpPrint = JasperFillManager.fillReport("iReports/relatorioVendas.jasper", new HashMap(), relatResul);
            JasperViewer jv = new JasperViewer(jpPrint, false);
            jv.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro ao chamar o relatório", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miRelatorioVendasActionPerformed

    private void miRelatorioProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioProdutosActionPerformed
        try {
            String sql = "SELECT * FROM TBPRODUTO";
            PreparedStatement ps;
            ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            JRResultSetDataSource relatResul = new JRResultSetDataSource(rs);
            JasperPrint jpPrint = JasperFillManager.fillReport("iReports/relatorioProdutos.jasper", new HashMap(), relatResul);
            JasperViewer jv = new JasperViewer(jpPrint, false);
            jv.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro ao chamar o relatório", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miRelatorioProdutosActionPerformed

    private void miRelatorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioClientesActionPerformed
        try {
            String sql = "SELECT * FROM TBCLIENTE";
            PreparedStatement ps;
            ps = con.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            JRResultSetDataSource relatResul = new JRResultSetDataSource(rs);
            JasperPrint jpPrint = JasperFillManager.fillReport("iReports/relatorioClientes.jasper", new HashMap(), relatResul);
            JasperViewer jv = new JasperViewer(jpPrint, false);
            jv.setVisible(true);
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro ao chamar o relatório", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_miRelatorioClientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btCompra;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVenda;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel fundo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuMovimentos;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miCompra;
    private javax.swing.JMenuItem miFornecedor;
    private javax.swing.JMenuItem miProduto;
    private javax.swing.JMenuItem miRelatorioClientes;
    private javax.swing.JMenuItem miRelatorioProdutos;
    private javax.swing.JMenuItem miRelatorioVendas;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miVenda;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
