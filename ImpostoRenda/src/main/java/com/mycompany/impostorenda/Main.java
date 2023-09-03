/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.impostorenda;

/**
 *
 * @author Marcio Melo
 */
public class Main {

    public static void main(String[] args) {
 
      PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 01");
        p1.setRendaBruta(1000);
        p1.setCpf("583.358.456-62");
        System.out.println("");

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(5000);
        p2.setCnpj("91.403.512/0001-54");
        System.out.println("");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 03");
        p3.setRendaBruta(2000);
        p3.setCpf("828.277.078-70");
        System.out.println("");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 04");
        p4.setRendaBruta(3000);
        p4.setCnpj("35.434.693/0001-05");
        System.out.println("");

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Contribuinte 05");
        p5.setRendaBruta(3700);
        p5.setCpf("547.653.548-90");
        System.out.println("");

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 06");
        p6.setRendaBruta(4000);
        p6.setCnpj("10.684.822/0001-92");
        System.out.println("");
        

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for (Contribuinte c : contribuintes) {
            System.out.println(c.toString());
        }
    }
    }

