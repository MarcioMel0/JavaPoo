/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.revisao02;

/**
 *
 * @author Marcio Melo
 */
public class Main {

    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1010);
       p1.setDono("Marcio");
       p1.abrirConta("CC");
      
       
       p1.depositar(100);
       p1.sacar(50);
       
       p1.estadoAtual();
    }
}
