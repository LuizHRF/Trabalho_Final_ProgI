/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import entities.Produto;
import models.ModelProduto;

/**
 *
 * @author aluno
 */
public class main {
    
    public static void main(String args[]){
        
        Produto prods[] = new Produto[12];
        prods[0] = new Produto("--", 0, 0);
        prods[1] = new Produto("--", 0, 1);
        prods[2] = new Produto("--", 0, 2);
        prods[3] = new Produto("--", 0, 3);
        prods[4] = new Produto("Salada Italiana", 13.50, 0);
        prods[5] = new Produto("Torradas", 10, 0);
        prods[6] = new Produto("Paella", 25.50, 1);
        prods[7] = new Produto("Espaguete com frutos do mar", 34, 1);
        prods[8] = new Produto("Petit Gateau", 19.50, 2);
        prods[9] = new Produto("Brisadeiro", 9, 2);
        prods[10] = new Produto("Água", 4, 3);
        prods[11] = new Produto("Coca-cola", 6, 3);
        
        
        for(int i =0; i<12; i++){
            
            ModelProduto.getProdutos().add(prods[i]);
           
            switch (prods[i].getIdTipo()){
                case 0:
                    novoPedido.modelEntrada.addElement(prods[i].getNome());
                    break;
                case 1:
                    novoPedido.modelPrincipal.addElement(prods[i].getNome());
                    break;
                case 2:
                    novoPedido.modelSobremesa.addElement(prods[i].getNome());
                    break;
                case 3:
                    novoPedido.modelBebida.addElement(prods[i].getNome());
                    break;
                default:
                    break;
            }
        }
        
        painelInicial p = new painelInicial();
        p.setVisible(true);
        
    }
}
