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
    private String[] prdoutos;
    private boolean situacao;

    public Pedido(String atendente, int mesa, String[] prdoutos, boolean situacao) {
        this.atendente = atendente;
        this.mesa = mesa;
        this.prdoutos = prdoutos;
        this.situacao = situacao;
    }
    
    public String getAtendente() {
        return atendente;
    }

    public int getMesa() {
        return mesa;
    }

    public String[] getPrdoutos() {
        return prdoutos;
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

    public void setPrdoutos(String[] prdoutos) {
        this.prdoutos = prdoutos;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    
}
