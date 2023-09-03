/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impostorenda;

/**
 *
 * @author Marcio Melo
 */
 public class PessoaJuridica extends Contribuinte{
   private String cnpj;

   
   //geteres e seteres
    public String getCnpj() {
        return cnpj;
    }

    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
        
    }
    
    //toString

    @Override
    public String toString() {
        String s = "Pessoa Jurídica";
        s += super.toString();
        s += "\n CNPJ : " + cnpj;
        s += "\n Imposto a ser pago: " + calcularImposto();
        return s;
    }
    
}
