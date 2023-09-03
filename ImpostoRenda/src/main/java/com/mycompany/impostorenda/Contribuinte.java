/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impostorenda;

/**
 *
 * @author Marcio Melo
 */
public abstract class Contribuinte {
    private String nome;
    private double rendaBruta;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();

    @Override
    public String toString() {
        String s = "\n Nome : " + nome;
        s += "\n Renda Bruta : " + rendaBruta;
        return s;
    }
}
