package sis.venda.gui.tm;

import sis.venda.to.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que define o modelo para tabela contendo dados do cliente
 *
 * @author Mayara
 */
public class ClienteTableModel extends AbstractTableModel {

    private String colunas[] = {"Nome", "CPF", "Data de Nascimento"};
    private List<Cliente> dados;

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
        Cliente cliente = dados.get(l);
        switch (c) {
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getCpf();
            case 2:
                return cliente.getDataNascimento();
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

    public void setDados(List<Cliente> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public Cliente getRowValue(int l) {
        return dados.get(l);
    }
}
