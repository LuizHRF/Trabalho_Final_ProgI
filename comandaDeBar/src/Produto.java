/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Produto {
    private String nome;
    private double valor;
    private int idTipo;

    public Produto(String nome, double valor, int tipo){
        this.nome = nome;
        this.valor = valor;
        this.idTipo = tipo;
    }
    
    public String getTipo(Produto p){
        switch (p.idTipo){
            case 0 -> {
                return "Entrada";
            }
            case 1 -> {
                return "Prato principal";
            }
            case 2 -> {
                return "Sobremesa";
            }
            case 3 -> {
                return "Bebida";
            }
        }
        return null;
    } 
    
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
    
    
}
