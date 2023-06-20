package entities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Pedido {
    private String atendente;
    private int mesa;
    private String Entrada, Principal, Sobremesa, Bebida;
    private boolean situacao;
    private double valor;

    public Pedido(String atendente, int mesa, String Entrada, String Principal, String Sobremesa, String Bebida, boolean situacao, double valor) {
        this.atendente = atendente;
        this.mesa = mesa;
        this.Entrada = Entrada;
        this.Principal = Principal;
        this.Sobremesa = Sobremesa;
        this.Bebida = Bebida;
        this.situacao = situacao;
        this.valor = valor;
    }
    
    public String getSituacao(){
        if(this.situacao){
            return "Atendido";
        }else{
            return "Aguardando";
        }
    }
    
    public String getAtendente() {
        return atendente;
    }

    public int getMesa() {
        return mesa;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getEntrada() {
        return Entrada;
    }

    public String getPrincipal() {
        return Principal;
    }

    public String getSobremesa() {
        return Sobremesa;
    }

    public String getBebida() {
        return Bebida;
    }

    public void setEntrada(String Entrada) {
        this.Entrada = Entrada;
    }

    public void setPrincipal(String Principal) {
        this.Principal = Principal;
    }

    public void setSobremesa(String Sobremesa) {
        this.Sobremesa = Sobremesa;
    }

    public void setBebida(String Bebida) {
        this.Bebida = Bebida;
    }
    
    
}
