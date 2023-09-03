/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impostorenda;

/**
 *
 * @author Marcio Melo
 */
public class PessoaFisica extends Contribuinte{
    private String cpf;
    

    //geteres e seteres
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    @Override
    public double calcularImposto(){
        double renda = this.getRendaBruta();
        
         if (renda <= 1400){
            return 0;
        }

        else if (renda > 1400 && renda <= 2100){
            return (renda * 0.1) - 100;
        }

        else if (renda > 2100 && renda <= 2800){
            return (renda * 0.15) - 270;
        }

        else if (renda > 2800 && renda <= 3600){
            return (renda * 0.25) - 500;
        }

        // maior que 3600
        return (renda * 0.3) - 700;
     
        
        //toString
        
    }

   @Override
    public String toString() {
        String s = "Pessoa Física";
        s += super.toString();
        s += "\n CPF : " + cpf;
        s += "\n Imposto a ser pago : " + calcularImposto();
        return s;
    }
    
}
