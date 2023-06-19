/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import entities.Pedido;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author robert
 */
public class ModelPedido extends AbstractTableModel {

    static ArrayList<Pedido> pedidos = new ArrayList();
    
    String[] colunas = {"Mesa", "Atendente", "Entrada", "Principal", "Sobremesa", "Bebida", "Valor", "Situação"};
    
    @Override
    public int getRowCount() {
        return pedidos.size();
    }

    @Override
    public String getColumnName (int column){
        return colunas[column];
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return pedidos.get(rowIndex).getMesa();
            case 1:
                return pedidos.get(rowIndex).getAtendente();
            case 2:
                return pedidos.get(rowIndex).getEntrada();
            case 3:
                return pedidos.get(rowIndex).getPrincipal();
            case 4:
                return pedidos.get(rowIndex).getSobremesa();
            case 5:
                return pedidos.get(rowIndex).getBebida();
            case 6:
                return pedidos.get(rowIndex).getValor();
            case 7:
                return pedidos.get(rowIndex).isSituacao();
            default:
                break;
        }
        return null;
    }
}
