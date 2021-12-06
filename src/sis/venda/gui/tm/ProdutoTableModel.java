package sis.venda.gui.tm;

import sis.venda.to.Produto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que define o modelo para tabela contendo dados do produto
 *
 * @author Mayara
 */
public class ProdutoTableModel extends AbstractTableModel {

    private String colunas[] = {"Nome", "Preço Compra", "Preço Venda"};
    private List<Produto> dados;

    @Override
    public int getRowCount() {
        if (dados == null) {
            return 0;
        }
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int l, int c) {
        Produto produto = dados.get(l);
        switch (c) {
            case 0:
                return produto.getNome();
            case 1:
                return produto.getPrecoCompra();
            case 2:
                return produto.getPrecoVenda();
            default:
                throw new IndexOutOfBoundsException("Coluna inexistente!");
        }
    }

    @Override
    public String getColumnName(int c) {
        return colunas[c];
    }

    @Override
    public boolean isCellEditable(int l, int c) {
        return false;
    }

    public void setDados(List<Produto> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public Produto getRowValue(int l) {
        return dados.get(l);
    }
}
