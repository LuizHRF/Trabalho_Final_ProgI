/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import entities.Produto;
import java.util.ArrayList;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author robert
 */
public class ModelProduto extends AbstractTableModel {

    static ArrayList<Produto> produtos = new ArrayList();
    
    String[] colunas = { "Tipo", "Nome", "Valor (R$)"};
    
    
    
    @Override
    public int getRowCount() {
        return produtos.size()-4;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName (int column){
        return colunas[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return produtos.get(rowIndex).getTipo(produtos.get(rowIndex).getIdTipo());
            case 1:
                return produtos.get(rowIndex).getNome();
            case 2:
                return produtos.get(rowIndex).getValor();
            default:
                break;
        }
        return null;
    }
    
    public static double getValor(String produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(produto)) {
                return produtos.get(i).getValor();
            }
        }
        return 0;
    }

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public String[] getColunas() {
        return colunas;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }
    
}