/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao02;

/**
 *
 * @author Marcio Melo
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //metodos personaliadaos
    public void estadoAtual(){
        System.out.println("__________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status:" + this.getStatus());
    }
    
    
    public  void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if(t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso! " + this.getDono());
    }
    
    
     public void fecharConta(){
         if (this.getSaldo()> 0){
             System.out.println("Conta não pode ser fechada pois tem dinheiro: " + this.getDono());
         } else if(this.getSaldo() < 0){
             System.out.println("Conta não pode ser fechada pois tem debito: " + this.getDono());
         } else{
             this.setStatus(false);
             System.out.println("Conta fechada com sucesso! " + this.getDono());
         }
     }
     
     
     public void depositar(float v){
         if (this.getStatus()){
             this.setSaldo(this.getSaldo() + v);
             System.out.println("Deposito realizado com sucesso na conta de: " +getDono());
         } else{
             System.out.println("Impossivel depositar conta fechada: " + this.getDono());
         }
     }
     
     
     public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: " + this.getDono());
            }else {
                System.out.println("Saldo insuficente: " + this.getDono());
            }
        } else{
            System.out.println("Impossivel sacar conta fechada: " + this.getDono());
        }
         
     }
     
     
     public void pagarMensal(){
         int v = 0;
         if (this.getTipo() == "CC") {
             v = 12;
         } else if(this.getTipo()== "CP") {
             v = 20;
         }
         if(this.getStatus()){
             this.setSaldo(this.getSaldo() - v);
             System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
         }else{
             System.out.println("Impossivel pagar conta fechada: " + this.getDono());
         }
     }
     
     //metodos especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    //geteres e seteres
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
     
}
